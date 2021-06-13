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
public class needy extends person
{
    
    int income;
    String address;
    int p_idd;

    public needy(int income, String address, int p_idd, int p_id, String p_name, String p_age, String p_cnic, String p_numb) {
        super(p_id, p_name, p_age, p_cnic, p_numb);
        this.income = income;
        this.address = address;
        this.p_idd = p_idd;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getP_idd() {
        return p_idd;
    }

    public void setP_idd(int p_idd) {
        this.p_idd = p_idd;
    }
    
    
    
    

}
    
   

  
   
   
