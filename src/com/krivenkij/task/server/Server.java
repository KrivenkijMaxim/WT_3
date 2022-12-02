package com.krivenkij.task.server;

import com.krivenkij.task.server.controller.ServerController;

public class Server {
    public static void main(String[] args) {
        var server = new ServerController();
        server.start();
    }
}
