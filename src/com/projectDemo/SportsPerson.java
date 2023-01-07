package com.projectDemo;

public class SportsPerson {
    String name;
    String Sports;
    String status;

    public static String getCurrentStatus() {
        return null;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSports() {
        return Sports;
    }

    public void setSports(String sports) {
        Sports = sports;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SportsPerson{" +
                "name='" + name + '\'' +
                ", Sports='" + Sports + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public SportsPerson(String name, String sports, String status) {
        this.name = name;
        Sports = sports;
        this.status = status;
    }





}
