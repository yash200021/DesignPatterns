package com.yash.designpatterns.creational.singleton;

public class Client {
    public static void main(String[] args) {
//        DBConnection dbConnection1 = DBConnection.getDBConnection("url","username","password");
//        DBConnection dbConnection2 = DBConnection.getDBConnection("url","username","password");
//        System.out.println(dbConnection1);
//        System.out.println(dbConnection2);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                DBConnection db = DBConnection.getDBConnection("","","");
                System.out.println(db);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                DBConnection db = DBConnection.getDBConnection("","","");
                System.out.println(db);
            }
        });

        Thread t3 = new Thread(() -> {
            DBConnection db = DBConnection.getDBConnection("","","");
            System.out.println(db);
        });

        Thread t4 = new Thread(() -> {
            DBConnection db = DBConnection.getDBConnection("","","");
            System.out.println(db);
        });

        //If we run the code by commenting out the lock code, we can get multiple instances of DBConnection object
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
