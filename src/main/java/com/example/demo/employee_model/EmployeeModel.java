package com.example.demo.employee_model;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EmployeeModel {

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(String empMobile) {
        this.empMobile = empMobile;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    private Integer empId;
    private String empName;
    private String empMobile;
    private double empSal;


    public EmployeeModel(Integer empId, String empName, String empMobile, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empMobile = empMobile;
        this.empSal = empSal;
    }
}
