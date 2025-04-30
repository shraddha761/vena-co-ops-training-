package CollectionsFrameWork.Q4TaskPrioritization;

import java.time.LocalDateTime;

public class Task {
    String taskName;
    int priority;
    LocalDateTime deadline;

    Task(String taskName, int priority, LocalDateTime deadline) {
        this.taskName = taskName;
        this.priority = priority;
        this.deadline = deadline;
    }
}
