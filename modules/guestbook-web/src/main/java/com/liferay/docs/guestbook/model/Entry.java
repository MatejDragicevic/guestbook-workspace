package com.liferay.docs.guestbook.model;

/**
 * Created by matej on 07.06.18.
 */
public class Entry {

    private String name;
    private String message;

    public Entry() {
        this.name = null;
        this.message = null;
    }

    public Entry(String name, String message) {
        setName(name);
        setMessage(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
