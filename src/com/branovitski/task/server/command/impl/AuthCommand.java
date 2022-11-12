package com.branovitski.task.server.command.impl;

import com.branovitski.task.server.command.Command;
import com.branovitski.task.server.command.exception.CommandException;
import com.branovitski.task.server.model.AuthType;
import com.branovitski.task.server.service.ServiceFactory;

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
        return "Success.";
    }
}
