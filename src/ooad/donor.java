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
public class donor extends person
{
    

List<Donations> list_of_donations=new ArrayList();

    public donor(int p_id, String p_name, String p_age, String p_cnic, String p_numb) {
        super(p_id, p_name, p_age, p_cnic, p_numb);
    }

    public List<Donations> getList_of_donations() {
        return list_of_donations;
    }

    public void setList_of_donations(List<Donations> list_of_donations) {
        this.list_of_donations = list_of_donations;
    }

    
    

   

   
    
    
}
