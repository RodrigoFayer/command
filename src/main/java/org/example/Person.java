package org.example;

import java.util.List;
import java.util.ArrayList;

public class Person {
    private List<Task> tasks = new ArrayList<Task>();

    public void runTask(Task task) {
        tasks.add(task);
        task.run();
    }

    public void cancelLastRanTask() {
        if (tasks.size() != 0) {
            Task task = this.tasks.get(this.tasks.size() - 1);
            task.cancel();
            this.tasks.remove(this.tasks.size() - 1);
        }
    }
}
