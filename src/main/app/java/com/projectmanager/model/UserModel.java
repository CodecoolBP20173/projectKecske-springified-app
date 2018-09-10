package com.projectmanager.model;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.*;

@Entity
public class UserModel {


    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String hashedPassword;

    @Column(unique = true)
    private String email;

    private int score;
    private String title = "Rookie";

    @ManyToOne
    private TeamModel team;

    public UserModel() {
    }

    public UserModel(String name, String password, String email) {
        this.name = name;
        this.hashedPassword = password;
        this.email = email;
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

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String password) {
        this.hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TeamModel getTeam() {
        return team;
    }

    public void setTeam(TeamModel team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Usr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + hashedPassword + '\'' +
                ", email='" + email + '\'' +
                ", score=" + score +
                ", title='" + title + '\'' +
                ", team='" + (team == null ? '-' : team.getName()) +
                '}';
    }
}
