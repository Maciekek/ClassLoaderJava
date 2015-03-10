package com.example.classLoader.src;

/**
 * Created by Maciek on 2015-03-10.
 */
public class MessageImpl implements MessageService {

    String message = "qwe";

    @Override
    public String getMessage() {
        return "Message says: " + message;
    }


}
