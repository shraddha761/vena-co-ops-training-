package CollectionsFrameWork.Q4TaskPrioritization;

import java.time.LocalDateTime;

public class Task {
    private String taskName;
    private int priority;
    private LocalDateTime deadline;

    Task(String taskName, int priority, LocalDateTime deadline) {
        this.taskName = taskName;
        this.priority = priority;
        this.deadline = deadline;
    }
    
    public LocalDateTime getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return name + " | Priority: " + priority + " | Deadline: " + deadline;
    }
}
