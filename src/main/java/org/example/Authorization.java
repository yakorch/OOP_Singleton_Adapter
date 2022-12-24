package org.example;

public class Authorization {
    public boolean authorize(DB db) {
        db.getUserData();
        return true;
    }
}
