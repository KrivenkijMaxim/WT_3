package com.branovitski.task.server.command.impl;

import com.branovitski.task.server.command.exception.CommandException;
import com.branovitski.task.server.model.AuthType;
import com.branovitski.task.server.service.ServiceFactory;
import com.branovitski.task.server.command.Command;

public class DisconnectCommand implements Command {
    @Override
    public String execute(Object caller, String request) throws CommandException {
        ServiceFactory.getInstance().getAuthService().setAuthType(caller, AuthType.UNAUTH);
        return "Bye bye!";
    }
}
