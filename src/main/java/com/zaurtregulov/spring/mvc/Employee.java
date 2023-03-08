package com.zaurtregulov.spring.mvc;

import com.zaurtregulov.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "name must be min 2 symbols") // size количество символов mib от max до , Нужен для вывода ошибки
    private String name;
//    @NotEmpty(message = "surname is required field") // нужен для обезательного заполнения
    @NotBlank(message = "surname is required field") // делает тоже самое что и  NotEmpty но еще проверяет на пробелы
    private String surName;
    @Min(value = 500,message = "must be greater than 499")
    @Max(value = 1000,message = "must be less than 1001")
    private int salary;
    private String department;
    private String carBrand;

    private Map<String, String> departments;
    private Map<String, String> carBrands;

    private String[] languages;

    private Map<String, String> languageList;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}",message = "please use pattern XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail(value = "nikita.com", message = "email must ends with nikita.com")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT","Information Technology");
        departments.put("HR","Human Resources");
        departments.put("Sales","Sales");
        carBrands = new HashMap<>();
        carBrands.put("BMV","BMV");
        carBrands.put("Audi","Audi");
        carBrands.put("Mercedes-Benz","MB");
        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Deutch", "DE");
        languageList.put("French", "FE");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
