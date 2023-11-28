package com.workintech.firstchallenge.modals;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;

    public Set<Task> getTasks(String assignee) {
        Set<Task> returnTasks = null;
        switch (assignee) {
            case "ann": {
                returnTasks = annsTasks;
            }
            case "bob": {
                returnTasks = bobsTasks;
            }
            case "carol": {
                returnTasks = carolsTasks;
            }
            case "all": {
                returnTasks.addAll(annsTasks);
                returnTasks.addAll(bobsTasks);
                returnTasks.addAll(carolsTasks);
            }
            default: System.out.println("Please select a viable assignee.");
        }
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
}
