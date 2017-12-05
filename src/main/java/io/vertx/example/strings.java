package io.vertx.example;

import io.vertx.core.Vertx;

/**
 * @author Aayush Sabharwal
 */

public class strings{
    public static void localhostPort()
    {
        System.out.println("http://localhost:8080/");
    }

    public static void portError_CouldNotListen()
    {
        System.err.println("Failed to listen on port 8080");
    }
}
