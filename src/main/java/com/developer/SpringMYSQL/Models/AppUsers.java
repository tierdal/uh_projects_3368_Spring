package com.developer.SpringMYSQL.Models;

import javax.persistence.*;

@Entity
@Table(name = "homework3")
public class AppUsers
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name = "name_first")
    public String firstName;
    @Column(name = "name_last")
    public String lastName;

    public AppUsers()
    {

    }

    public AppUsers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }


}
