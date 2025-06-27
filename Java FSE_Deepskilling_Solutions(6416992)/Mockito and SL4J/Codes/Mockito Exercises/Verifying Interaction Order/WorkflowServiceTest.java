package com.advexample.junitparamdemo;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.InOrder;

public class WorkflowServiceTest {

    @Test
    public void testMethodCallOrder() {
        TaskRunner mockRunner = mock(TaskRunner.class);
        WorkflowService service = new WorkflowService(mockRunner);

        service.runWorkflow();

        InOrder inOrder = inOrder(mockRunner);
        inOrder.verify(mockRunner).start();
        inOrder.verify(mockRunner).execute();
        inOrder.verify(mockRunner).finish();
    }
}
