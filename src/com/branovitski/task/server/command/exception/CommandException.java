package com.branovitski.task.server.command.exception;

public class CommandException extends Exception{
    public CommandException() {
        super();
    }

    public CommandException(String message) {
        super(message);
    }
}
