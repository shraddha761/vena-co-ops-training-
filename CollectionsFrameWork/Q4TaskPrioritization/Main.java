package CollectionsFrameWork.Q4TaskPrioritization;

import java.time.LocalDateTime;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>((t1, t2) -> {
            int cmp = t1.getDeadline().compareTo(t2.getDeadline());
            if(cmp == 0){
                return Integer.compare(t2.getPriority(), t1.getPriority());
            }
            return cmp;
        });

        taskQueue.add(new Task("Task A",2,  LocalDateTime.of(2025, 5, 1, 10, 0)));
        taskQueue.add(new Task("Task B", 1, LocalDateTime.of(2025, 4, 30, 9, 0)));
        taskQueue.add(new Task("Task C", 3, LocalDateTime.of(2025, 4, 30, 9, 0)));
        taskQueue.add(new Task("Task D", 1, LocalDateTime.of(2025, 5, 1, 8, 0)));

        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}
