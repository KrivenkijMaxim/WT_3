package com.krivenkij.task.server.command.impl;

import com.krivenkij.task.server.command.exception.CommandException;
import com.krivenkij.task.server.model.AuthType;
import com.krivenkij.task.server.service.ServiceFactory;
import com.krivenkij.task.server.command.Command;

public class DisconnectCommand implements Command {
    @Override
    public String execute(Object caller, String request) throws CommandException {
        ServiceFactory.getInstance().getAuthService().setAuthType(caller, AuthType.UNAUTH);
        return "Bye bye!";
    }
}
