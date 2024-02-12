package org.example;

public class SingletonClient {

    public static void main(String[] args) {
        for (int i = 0; i<3; i++){
            Singleton s = Singleton.getInstance();
            s.printName();
        }
    }
}