package com.example.user.api.Entity;

import javax.persistence.*;

/**
 * @author davcan 16.10.2019
 */

@Entity
@Table(name = "groups")
public class GroupImpl implements IGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String userId;

    public GroupImpl() {  }

    public GroupImpl(String name, String groupId) {
        this.setName(name);
        this.setUserId(groupId);
    }

    public GroupImpl(int id, String name, String groupId) {
        this.setId(id);
        this.setName(name);
        this.setUserId(groupId);
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group Id='" + userId + '\'' +
                '}';
    }
}
