package com.krivenkij.task.server.command.impl;

import com.krivenkij.task.server.command.Command;
import com.krivenkij.task.server.command.exception.CommandException;
import com.krivenkij.task.server.model.AuthType;
import com.krivenkij.task.server.service.ServiceFactory;

public class AuthCommand implements Command {
    @Override
    public String execute(Object caller, String request) throws CommandException {
        var arguments = request.split(" ");
        if (arguments.length != 2) throw new CommandException("AUTH command should contain 1 argument");
        AuthType authType;
        try {
            authType = AuthType.valueOf(arguments[1]);
        } catch (IllegalArgumentException e) {
            throw new CommandException("No such auth type");
        }

        ServiceFactory.getInstance().getAuthService().setAuthType(caller, authType);
        return "SUCCESS";
    }
}
