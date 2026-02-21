package com.academia.interfaces;

@FunctionalInterface
public interface EventHandler {
    void handle(String eventData);
}