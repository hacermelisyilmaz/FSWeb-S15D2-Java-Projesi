package com.workintech.firstchallenge.modals;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }

    public Set<Task> getTasks(String assignee) {
        if (assignee.equalsIgnoreCase("ann")) return this.annsTasks;
        else if (assignee.equalsIgnoreCase("bob")) return this.bobsTasks;
        else if (assignee.equalsIgnoreCase("carol")) return this.carolsTasks;
        else if (assignee.equalsIgnoreCase("all")) return getUnion(annsTasks, bobsTasks, carolsTasks);
        return new HashSet<>();
    }

    public Set<Task> getUnion(Set<Task>... sets) {
        Set<Task> returnTasks = new HashSet<>();
        for(Set<Task> taskSet: sets) {
            returnTasks.addAll(taskSet);
        }
        return returnTasks;
    }

    public Set<Task> getIntersect(Set<Task> list1, Set<Task> list2) {
        Set<Task> intersections = new HashSet<>(list1);
        intersections.retainAll(list2);
        return intersections;
    }

    public Set<Task> getDifference(Set<Task> list1, Set<Task> list2) {
        Set<Task> difference = new HashSet<>(list1);
        difference.removeAll(list2);
        return difference;
    }

    @Override
    public String toString() {
        return "TaskData{" +
                "annsTasks=" + annsTasks +
                ", bobsTasks=" + bobsTasks +
                ", carolsTasks=" + carolsTasks +
                '}';
    }
}
