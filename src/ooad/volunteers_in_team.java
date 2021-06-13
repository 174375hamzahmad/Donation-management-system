/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad;

/**
 *
 * @author Hamza-PC
 */
public class volunteers_in_team 
{
    int teamid;
    int volunteerid;

    public volunteers_in_team(int teamid, int volunteerid) 
    {
        this.teamid = teamid;
        this.volunteerid = volunteerid;
    }

    public int getTeamid()
    {
        return teamid;
    }

    public void setTeamid(int teamid)
    {
        this.teamid = teamid;
    }

    public int getVolunteerid() 
    {
        return volunteerid;
    }

    public void setVolunteerid(int volunteerid) {
        this.volunteerid = volunteerid;
    }
    
}
