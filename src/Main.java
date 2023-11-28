import com.workintech.firstchallenge.enums.Priority;
import com.workintech.firstchallenge.enums.Status;
import com.workintech.firstchallenge.modals.Task;
import com.workintech.firstchallenge.modals.TaskData;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("project1", "creating classes");
        Task task2 = new Task("project1", "declaring variables", "ann", Priority.MED, Status.IN_QUEUE);
        Task task3 = new Task("project1", "creating interface", "bob", Priority.MED, Status.IN_PROGRESS);
        Task task4 = new Task("project1", "creating interface", "carol", Priority.LOW, Status.ASSIGNED);
        Task task5 = new Task("project2", "creating abstract classes", "carol", Priority.MED, Status.IN_PROGRESS);

        Set<Task> annsTasks = new LinkedHashSet<>();
        annsTasks.add(task2);

        Set<Task> bobsTasks = new LinkedHashSet<>();
        bobsTasks.add(task3);

        Set<Task> carolsTasks = new LinkedHashSet<>();
        carolsTasks.add(task4);
        carolsTasks.add(task5);

        Set<Task> allTasks = new LinkedHashSet<>();
        allTasks.add(task1);
        allTasks.addAll(annsTasks);
        allTasks.addAll(bobsTasks);
        allTasks.addAll(carolsTasks);

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks);


        System.out.println("**ALL TASKS**");
        Set<Task> all = taskData.getTasks("all");
        System.out.println(all);

        System.out.println("**TASKS ON ASSIGNEES**");
        System.out.println("ANN: " + taskData.getTasks("ann"));
        System.out.println("BOB: " + taskData.getTasks("bob"));
        System.out.println("CAROL: " + taskData.getTasks("carol"));

        System.out.println("**UNASSIGNED TASKS**");
        Set<Task> unassignedTasks = taskData.getDifference(allTasks, taskData.getTasks("all"));
        System.out.println(unassignedTasks);

        System.out.println("**MULTIPLE ASSIGNEE**");
        Set<Task> intAnnBob =  taskData.getIntersect(annsTasks, bobsTasks);
        System.out.println("ANN & BOB: " + intAnnBob);
        Set<Task> intAnnCarol = taskData.getIntersect(annsTasks, carolsTasks);
        System.out.println("ANN & CAROL: " + intAnnCarol);
        Set<Task> intBobCarol =  taskData.getIntersect(bobsTasks, carolsTasks);
        System.out.println("BOB & CAROL: " + intBobCarol);
    }
}