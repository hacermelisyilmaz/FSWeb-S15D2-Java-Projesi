package com.workintech.firstchallenge.modals;

import com.workintech.firstchallenge.enums.Priority;
import com.workintech.firstchallenge.enums.Status;

import java.util.Objects;

public class Task {
    private String project;
    private String description;
    private String asignee;
    private Priority priority;
    private Status status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }
}
