package com.example.classLoader.classLoader;

import com.example.classLoader.src.MessageService;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by Maciek on 2015-03-10.
 */
public class StandardClassLoader {
    public static MessageService newInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        URL[] urls = ((URLClassLoader) java.lang.ClassLoader.getSystemClassLoader()).getURLs();

        java.lang.ClassLoader myCL = new MyClassLoader(urls);

        return (MessageService) myCL.loadClass("com.example.classLoader.src.MessageImpl").newInstance();
    }
}
