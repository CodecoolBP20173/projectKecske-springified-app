package com.projectmanager.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TeamModel {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    private ProjectModel project;

    public ProjectModel getProject() {
        return project;
    }

    public void setProject(ProjectModel project) {
        this.project = project;
    }

    @OneToMany(mappedBy = "team")
    private List<UserModel> teamMembers = new ArrayList<>();

    @OneToOne
    private UserModel teamLeader;

    public TeamModel() {
    }

    public TeamModel(String name) {
        this.name = name;
    }

    public void addMember(UserModel usr){
        teamMembers.add(usr);
    }

    public void addMember(List<UserModel> usrs){
        teamMembers.addAll(usrs);
    }

    public void removeMember(UserModel usr){
        teamMembers.remove(usr);
    }

    public void removeMember(List<UserModel> usrs){
        teamMembers.removeAll(usrs);
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

    public List<UserModel> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<UserModel> teamMembers) {
        this.teamMembers = teamMembers;
    }

    public UserModel getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(UserModel teamLeader) {
        this.teamLeader = teamLeader;
    }

}
