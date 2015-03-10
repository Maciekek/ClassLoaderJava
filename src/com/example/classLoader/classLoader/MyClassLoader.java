package com.example.classLoader.classLoader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;

/**
 * Created by Maciek on 2015-03-10.
 */
public class MyClassLoader extends URLClassLoader{
    public MyClassLoader(URL[] urls) {
        super(urls);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if(name.contains("MessageImpl")) return findClass(name);
        return super.loadClass(name);
    }

    public Class<?> findClass(String name){
        byte[] bytes = null;
        try{
            bytes = getClassData(name);
        } catch(IOException e){
            e.printStackTrace();
        }
        Class<?> result = defineClass(name,bytes,0,bytes.length);
        return result;
    }

    private byte[] getClassData(String name) throws IOException {
        String url = "http://localhost:3000/";
        URL myUrl = new URL(url);
        URLConnection connection = myUrl.openConnection();
        InputStream input = connection.getInputStream();
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int data = input.read();

        while (data != -1) {
            buffer.write(data);
            data = input.read();
        }

        input.close();

        byte[] classData = buffer.toByteArray();
        return classData;
    }
}
