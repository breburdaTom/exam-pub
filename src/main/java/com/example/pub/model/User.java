package com.example.pub.model;

public class User {
    private Long id;
    private String name;
    private boolean isActive;
    private boolean isAdult;
    private int pocket;

    public User() {
    }

    public User(Long id, String name, boolean isActive, boolean isAdult, int pocket) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.isAdult = isAdult;
        this.pocket = pocket;
    }

    public User(String name, boolean isActive, boolean isAdult, int pocket) {
        this.name = name;
        this.isActive = isActive;
        this.isAdult = isAdult;
        this.pocket = pocket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsAdult() {
        return isAdult;
    }

    public void setAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }

    public int getPocket() {
        return pocket;
    }

    public void setPocket(int pocket) {
        this.pocket = pocket;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                ", isAdult=" + isAdult +
                ", pocket=" + pocket +
                '}';
    }
}
