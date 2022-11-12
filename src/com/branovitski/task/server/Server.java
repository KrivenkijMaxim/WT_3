package com.branovitski.task.server;

import com.branovitski.task.server.controller.ServerController;

public class Server {
    public static void main(String[] args) {
        var server = new ServerController();
        server.start();
    }
}
