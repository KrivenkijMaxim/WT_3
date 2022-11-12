package com.branovitski.task.server.command;

import com.branovitski.task.server.command.exception.CommandException;

public interface Command {
    String execute(Object caller, String request) throws CommandException;
}
