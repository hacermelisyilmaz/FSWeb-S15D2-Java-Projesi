import com.workintech.firstchallenge.enums.Priority;
import com.workintech.firstchallenge.enums.Status;
import com.workintech.firstchallenge.modals.Task;
import com.workintech.firstchallenge.modals.TaskData;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("project1", "creating classes", "ann", Priority.HIGH, Status.IN_PROGRESS);
        Task task2 = new Task("project1", "declaring variables", "ann", Priority.MED, Status.IN_QUEUE);
        Task task3 = new Task("project1", "creating interface", "bob", Priority.MED, Status.IN_PROGRESS);
        Task task4 = new Task("project2", "mapping out inheritance", "carol", Priority.LOW, Status.ASSIGNED);
        Task task5 = new Task("project2", "creating abstract classes", "carol", Priority.MED, Status.IN_PROGRESS);

        TaskData taskData1 = new TaskData();
        taskData1.setAnnsTasks(new HashSet<>() {{
            add(task1);
            add(task2);
        }});
        taskData1.setBobsTasks(new HashSet<>() {{
            add(task3);
        }});
        taskData1.setCarolsTasks(new HashSet<>() {{
            add(task4);
            add(task5);
        }});

        System.out.println(taskData1.getAnnsTasks());
    }
}