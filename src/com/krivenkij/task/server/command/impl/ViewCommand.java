package com.krivenkij.task.server.command.impl;

import com.krivenkij.task.server.model.Case;
import com.krivenkij.task.server.command.Command;
import com.krivenkij.task.server.command.exception.CommandException;
import com.krivenkij.task.server.model.AuthType;
import com.krivenkij.task.server.service.ServiceFactory;

import java.util.List;

public class ViewCommand implements Command {
    @Override
    public String execute(Object caller, String request) throws CommandException {
        if (ServiceFactory.getInstance().getAuthService().getAuthType(caller) == AuthType.UNAUTH)
            return "Should be authenticated";

        var cases = ServiceFactory.getInstance().getCaseService().getAll();
        return toOutput(cases);
    }

    private static String toOutput(List<Case> cases) {
        var resultBuilder = new StringBuilder();
        resultBuilder.append("[\n");
        for (var _case : cases) {
            resultBuilder.append("\t").append(_case.toString()).append("\n");
        }
        resultBuilder.append("]");
        return resultBuilder.toString();
    }
}
