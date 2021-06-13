/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hamza-PC
 */
public class project 
{
    volunteermanagement vm;
    List<needy> targetsubjects=new ArrayList(); //needy
    int pid;
    String projectname;
    String manager;
    String description;
    int reqbudget;
    List<donor>donorsofproject=new ArrayList();
    List<Donations> donationsofproject=new ArrayList();

    public project(int pid, String projectname, String manager, String description, int reqbudget)
    {
        this.pid = pid;
        this.projectname = projectname;
        this.manager = manager;
        this.description = description;
        this.reqbudget = reqbudget;
    }

    public volunteermanagement getVm() {
        return vm;
    }

    public void setVm(volunteermanagement vm) {
        this.vm = vm;
    }

    public List<needy> getTargetsubjects() {
        return targetsubjects;
    }

    public void setTargetsubjects(List<needy> targetsubjects) {
        this.targetsubjects = targetsubjects;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReqbudget() {
        return reqbudget;
    }

    public void setReqbudget(int reqbudget) {
        this.reqbudget = reqbudget;
    }

    public List<donor> getDonorsofproject() {
        return donorsofproject;
    }

    public void setDonorsofproject(List<donor> donorsofproject) {
        this.donorsofproject = donorsofproject;
    }
    
  

    
   
}
