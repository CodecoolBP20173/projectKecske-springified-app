package com.projectmanager.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class ProjectModel {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Temporal(TemporalType.DATE)
    private Date deadline;

    private int currentBusinessValue;

    private int maxBusinessValue;

    @OneToMany(mappedBy = "project")
    private List<TeamModel> teams = new ArrayList<>();

    @OneToOne
    private UserModel projectLeader;

    @ManyToMany
    private List<TaskModel> tasks = new ArrayList<>();


    public ProjectModel() {
    }

    public ProjectModel(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public int getCurrentBusinessValue() {
        return currentBusinessValue;
    }

    public void setCurrentBusinessValue(int currentBusinessValue) {
        this.currentBusinessValue = currentBusinessValue;
    }

    public int getMaxBusinessValue() {
        return maxBusinessValue;
    }

    public void setMaxBusinessValue(int maxBusinessValue) {
        this.maxBusinessValue = maxBusinessValue;
    }

    public List<TeamModel> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamModel> teams) {
        this.teams = teams;
    }

    public UserModel getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(UserModel projectLeader) {
        this.projectLeader = projectLeader;
    }

    public List<TaskModel> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskModel> tasks) {
        this.tasks = tasks;
    }

}
