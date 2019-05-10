package com.Yulia.statePattern;

public interface DocumentState {
    void printInfo();
    DocumentState changeState();
}
