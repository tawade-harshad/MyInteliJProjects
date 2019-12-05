package com.jpmc.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    private String empId, empName;
    List<JobRole> jobList;
    Map<String, List<JobRole>> companyMap;

    /*public Employee(String empId, String empName, List<JobRole> jobList) {
        this.empId = empId;
        this.empName = empName;
        this.jobList = jobList;
    }*/

   /* public Employee(String empId, String empName, Map<String, List<JobRole>> companyMap) {
        this.empId = empId;
        this.empName = empName;
        this.companyMap = companyMap;
    }*/

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<JobRole> getJobList() {
        return jobList;
    }

    public void setJobList(List<JobRole> jobList) {
        this.jobList = jobList;
    }

    public Map<String, List<JobRole>> getCompanyMap() {
        return companyMap;
    }

    public void setCompanyMap(Map<String, List<JobRole>> companyMap) {
        this.companyMap = companyMap;
    }

    public void showJobRoles(){
        System.out.println("Employee Details : ID - " + empId + " Name - " + empName);
        System.out.println("Job Details : ");
        for (JobRole listObject: jobList) {
            System.out.println("Job Id - " + listObject.getJobID() + " Job Name - " + listObject.getJobName() + " Pay Scale - " + listObject.getPayScale() );
        }
    }

    public void showJobOpening() {
        for(String companyName : companyMap.keySet()){
            List<JobRole> mjobList = companyMap.get(companyName);
            System.out.println("Company Name : " +companyName);
            for (JobRole listObject: mjobList) {
                System.out.println("Job Id - " + listObject.getJobID() + " Job Name - " + listObject.getJobName() + " Pay Scale - " + listObject.getPayScale() );
            }
            System.out.println("=====================================================================");
        }
    }
}
