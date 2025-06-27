package com.advexample.junitparamdemo;

public class WorkflowService {
    private TaskRunner taskRunner;

    public WorkflowService(TaskRunner taskRunner) {
        this.taskRunner = taskRunner;
    }

    public void runWorkflow() {
        taskRunner.start();
        taskRunner.execute();
        taskRunner.finish();
    }
}
