package com.mijninzet.projectteamdrie.model.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Task")
public class Task {

    @Id
    private int taskId;
    private String taskName;
    private int estimatedHours;
    private int yearsToExpiryDate;
 //   @OneToMany(mappedBy = "taskId")
//   private TaskApplication taskApplication;
//    private List<TaskApplication> taskApplication;

    public Task() {
        this(0, "", 0, 0);
    }

    public Task(int taskId, String taskName, int estimatedHours, int yearsToExpiryDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.estimatedHours = estimatedHours;
        this.yearsToExpiryDate = yearsToExpiryDate;
    }

    public Task(int taskId) {
        this.taskId=taskId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public int getYearsToExpiryDate() {
        return yearsToExpiryDate;
    }

    public void setYearsToExpiryDate(int yearsToExpiryDate) {
        this.yearsToExpiryDate = yearsToExpiryDate;
    }
}
