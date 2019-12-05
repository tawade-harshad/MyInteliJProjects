package com.jpmc.aggregateandcomposition;

public class Employee {
    private int empId;
    private String empName;

    Manager manager;
    TeamLead teamLead;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public TeamLead getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(TeamLead teamLead) {
        this.teamLead = teamLead;
    }

    public Employee() {
        System.out.println("Default Constructor");
    }

    public Employee(int empId) {
        this.empId = empId;
    }

    public Employee(String empName) {
        this.empName = empName;
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public Employee(int empId, String empName, Manager manager, TeamLead teamLead) {
        this.empId = empId;
        this.empName = empName;
        this.manager = manager;
        this.teamLead = teamLead;
    }

    void show(){
        System.out.println(empId + " " + empName);
    }

    void show1(){
        System.out.println("Employee Class Details : " + empId + " " + empName);
        System.out.println("Manager Class Details : " + manager.managerID + " " + manager.managerName + " " + manager.managerDept);
        System.out.println("Team-Lead Class Details : " + teamLead.tlID + " " + teamLead.tlName + " " + teamLead.tlDept
                             + " " + teamLead.tlProject);
    }
}
