package com.workintech.firstchallenge.modals;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks = new HashSet<>();
    private Set<Task> bobsTasks = new HashSet<>();
    private Set<Task> carolsTasks = new HashSet<>();

    public Set<Task> getTasks(String assignee) {
        Set<Task> returnTasks = new HashSet<>();
        switch (assignee) {
            case "ann": {
                returnTasks.addAll(annsTasks);
            }
            case "bob": {
                returnTasks = bobsTasks;
            }
            case "carol": {
                returnTasks = carolsTasks;
            }
            case "all": {
                returnTasks.addAll(getUnion(annsTasks, bobsTasks));
                returnTasks.addAll(carolsTasks);
            }
            default: System.out.println("Please select a viable assignee.");
        }
        return returnTasks;
    }

    public Set<Task> getUnion(Set<Task> list1, Set<Task> list2) {
        Set<Task> returnTasks = new HashSet<>();
        returnTasks.addAll(list1);
        returnTasks.addAll(list2);
        return returnTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public void setAnnsTasks(Set<Task> annsTasks) {
        this.annsTasks = annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public void setBobsTasks(Set<Task> bobsTasks) {
        this.bobsTasks = bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public void setCarolsTasks(Set<Task> carolsTasks) {
        this.carolsTasks = carolsTasks;
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
