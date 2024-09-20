package com.yash.designpatterns.creational.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    private String url;
    private String username;
    private String password;
    private static DBConnection dbConnection;

    private DBConnection(String url,String username,String password){
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DBConnection getDBConnection(String url, String username, String password){
         if(dbConnection == null){
             //Double lock mechanism to avoid creation of multiple objects in multi-threaded enviornment
             //It takes bit more time,but it's thread safe.
             Lock lock = new ReentrantLock();
             lock.lock();
             //check again, if the object is already created or not
             if(dbConnection == null){
                 dbConnection = new DBConnection(url, username, password);
             }
             lock.unlock();
         }
         return dbConnection;
    }
}
