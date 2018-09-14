package com.projectmanager.model;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class UserModel {


    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String hashedPassword;

    @Email
    @NotNull
    @NotEmpty
    @Column(unique = true)
    private String email;


    @ManyToOne
    private TeamModel team;

    public UserModel() {
    }

    public UserModel(String name, String password, String email) {
        this.name = name;
        setHashedPassword(password);
        this.email = email;
        this.team = null;
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
                ", team='" + (team == null ? '-' : team.getTeamName()) +
                '}';
    }
}
