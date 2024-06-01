package com.lbarbaris.spring.mvc;
import com.lbarbaris.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name must be minimum 2 symbols")
    private String name;

    //@NotEmpty(message = "required field")
    @NotBlank(message = "required field")
    private String surname;
    @Max(value = 1001, message = "max is 1001")
    @Min(value = 900, message = "min is 900")
    private int salary;
    private String department;
    private Map<String,String> departments;
    private String[] languages;
    @CheckEmail(value = "gmail.com", message = "no valid email")
    private String email;


    /*regular expression!!!*/
    @Pattern(regexp = "(\\(\\d{3}\\))\\d{3}-\\d{2}-\\d{2}", message = "please use pattern (XXX)XXX-XX-XX")
    private String phoneNumber;
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

    public Map<String, String> getLanguagesMap() {
        return languagesMap;
    }

    public void setLanguagesMap(Map<String, String> languagesMap) {
        this.languagesMap = languagesMap;
    }

    private Map<String,String> languagesMap;

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }



    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    private Map<String,String> carBrands;

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    private String carBrand;

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Employee(){
        departments = new HashMap<>();
        departments.put("AP", "Administration of President");
        departments.put("HR", "Human Recources");

        carBrands = new HashMap<>();
        carBrands.put("Lada", "Lada");
        carBrands.put("UAZ", "UAZ");
        carBrands.put("GAZ", "GAZ");

        languagesMap = new HashMap<>();
        languagesMap.put("Russian", "RU");
        languagesMap.put("English", "EN");
        languagesMap.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
