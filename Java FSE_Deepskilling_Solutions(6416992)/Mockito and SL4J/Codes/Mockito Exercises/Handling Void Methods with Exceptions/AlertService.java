package com.advexample.junitparamdemo;

public class AlertService {
    private Notifier notifier;

    public AlertService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void triggerAlert(String message) {
        notifier.alert(message);
    }
}
