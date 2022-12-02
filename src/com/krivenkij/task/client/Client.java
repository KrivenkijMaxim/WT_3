package com.krivenkij.task.client;

import com.krivenkij.task.client.controller.ClientController;

public class Client {
    public static void main(String[] args) {
        var client = new ClientController();
        client.start();
    }
}
