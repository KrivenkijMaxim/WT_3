package com.krivenkij.task.server.command;

import com.krivenkij.task.server.command.exception.CommandException;

public interface Command {
    String execute(Object caller, String request) throws CommandException;
}
