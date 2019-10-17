package com.example.user.api.Entity;

import javax.persistence.*;

/**
 * @author davcan 16.10.2019
 */

@Entity
@Table(name = "users")
public class UserImpl implements IUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String groupId;

    public UserImpl() {  }

    public UserImpl(String name, String groupId) {
        this.setName(name);
        this.setGroupId(groupId);
    }

    public UserImpl(int id, String name, String groupId) {
        this.setId(id);
        this.setName(name);
        this.setGroupId(groupId);
    }
    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group Id='" + groupId + '\'' +
                '}';
    }
}
