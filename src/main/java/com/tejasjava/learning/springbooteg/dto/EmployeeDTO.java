package com.tejasjava.learning.springbooteg.dto;

public class EmployeeDTO {
    private Integer id;
    private String name;
    private String role;
    private Integer experience;

    public EmployeeDTO(){}

    public EmployeeDTO(Integer id, String name, String role, Integer experience) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.experience = experience;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

}
