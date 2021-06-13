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
public class beneficiary 
{
    int projectid;
    int needyid;
    int amountcollected;

    public beneficiary(int projectid, int needyid, int amountcollected) {
        this.projectid = projectid;
        this.needyid = needyid;
        this.amountcollected = amountcollected;
    }

    public int getProjectid()
    {
        return projectid;
    }

    public void setProjectid(int projectid)
    {
        this.projectid = projectid;
    }

    public int getNeedyid() {
        return needyid;
    }

    public void setNeedyid(int needyid)
    {
        this.needyid = needyid;
    }
    public int getAmountcollected() 
    {
        return amountcollected;
    }

    public void setAmountcollected(int amountcollected)
    {
        this.amountcollected = amountcollected;
    }
    
}
