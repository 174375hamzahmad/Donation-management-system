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
public class volunteermanagement 
{
    List<volunteer> team=new ArrayList(); 
    int teamid;
    int projectid; 
    volunteer v1;

    public volunteermanagement(int teamid, int projectid, volunteer v1) {
        this.teamid = teamid;
        this.projectid = projectid;
        this.v1 = v1;
    }
    
    void addteammembers(volunteer v)
    {
        team.add(v);
    }
    
    void removeteammembers(volunteer v)
    {
        team.remove(v);
    }
    public List<volunteer> getTeam() {
        return team;
    }
    
    public void setTeam(List<volunteer> team) {
        this.team = team;
    }

    public int getTeamid() {
        return teamid;
    }

    public void setTeamid(int teamid) {
        this.teamid = teamid;
    }

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public volunteer getV1() {
        return v1;
    }

    public void setV1(volunteer v1) {
        this.v1 = v1;
    }
    

    
    
    
    
   
      
}

