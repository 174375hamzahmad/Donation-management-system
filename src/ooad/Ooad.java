/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hamza-PC
 */
public class Ooad 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        my_DB d=new my_DB();
 
      
        List<String> qs=new ArrayList();
           String qs1="What is your income?";
           String qs2="Who else earns in your family?";
           String qs3="What is your qualification?";
           
           qs.add(qs1);
           qs.add(qs2);
           qs.add(qs3);
      
           volunteer v1=new volunteer(1,"asad","19","323232323","0300422323");
           volunteer v2=new volunteer(2,"subhani","19","323232323","0300422323");
           
           needy n1=new needy(10000,"dha",1,1,"jawad","20","32323232","0303030");
           needy n2=new needy(10000,"dha",1,2,"jawad","20","32323232","0303030");
           
           
           
         
           
            DMS obj=new DMS();
           
            
            obj.allneedy.add(n1);
            obj.allneedy.add(n2);
            
            obj.allvolunteers.add(v1);
            obj.allvolunteers.add(v2);
            
            project p=new project(1,"soch","Ali","charity project",10000);
            
            
           
            
            //p.donationsofproject.add(dn);
            
            volunteers_in_team vit=new volunteers_in_team(1,1);
            volunteers_in_team vit1=new volunteers_in_team(1,2);
            
            //d.addproject(p);
            //d.addvolunteer(v1);
            //d.addvolunteer(v2);
            //d.addvolunteermanagement(vm);
            
            //d.addvolunteer_in_team(vit);
            //d.addvolunteer_in_team(vit1);
            
            
            
            
           
            
            //d.beneficiaryinproject(1);
            //d.donorsinproject(1);
            
             // d.searchprojectbymanager("ali");
            
            
            
  
   
    }
    
}
