package org.example;

import java.util.List;

/**
 * Simulates reading a file (always returns "Hello world").
 * Also stores log messages when the file is closed.
 */
public class FakeFileReader implements AutoCloseable {
    /**
     * List of log messages to add to when the file is closed.
     */
    private List<String> logMessages;

    /**
     * Constructor for the FakeFileReader.
     *
     * @param logMessages List of log messages to add to when the file is closed.
     */
    public FakeFileReader(List<String> logMessages) {
        this.logMessages = logMessages;
    }

    /**
     * Read the file and return its contents.
     *
     * @return The contents of the file.
     */
    public String read() {
        return "Hello world";
    }

    /**
     * Close the file and add a log message.
     */
    @Override
    public void close() {
        logMessages.add("Closing file");
    }
}
