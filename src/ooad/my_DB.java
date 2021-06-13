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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Fast
 */ 
public class my_DB 
{
    Connection con;
    Statement stmt;
    
    my_DB() //cons
    {
        try
        {
             String s = "jdbc:sqlserver://localhost:1433;databaseName=project4";
             con=DriverManager.getConnection(s,"hamza1","123");


            stmt =  con.createStatement(); 
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void displayAll()
    {
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from volunteer");
             while(rs.next())
             {
                 
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
    }
    
    void addneedy(needy n)
    {
        try
        {
        PreparedStatement rs= con.prepareStatement("insert into needy(n_id,n_name,n_age,n_cnic,n_numb,income,addresss,appliedin)"
                   + "values(?,?,?,?,?,?,?,?);");
       
           rs.setInt(1,n.getP_id());
           rs.setString(2,n.getP_name());
           rs.setString(3,n.getP_age());
           rs.setString(4,n.getP_cnic());
           rs.setString(5,n.getP_numb());
           rs.setInt(6,n.getIncome());
           rs.setString(7,n.getAddress());
           rs.setInt(8,n.getP_idd());
           
           rs.executeUpdate();
                
        }
         catch(Exception e)
        {
            System.out.println(e);
        }
    }
     void addvolunteermanagement(volunteermanagement vm)
    {
        try
        {
        PreparedStatement rs= con.prepareStatement("insert into volunteermanagement(teamid,workingon,vhead )"
                   + "values(?,?,?);");
       
        
           rs.setInt(1,vm.getTeamid());
           rs.setInt(2,vm.getProjectid());
           rs.setInt(3,vm.v1.getP_id());

           rs.executeUpdate();
           
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
    }
        void addvolunteer_in_team(volunteers_in_team vit)
    {
        try
        {
        PreparedStatement rs= con.prepareStatement("insert into  volunteers_in_team(volunteerid,teamid)"
                   + "values(?,?);");
       
        
           rs.setInt(1,vit.volunteerid);
           rs.setInt(2,vit.teamid);
          

           rs.executeUpdate();
           
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
    }
     
     void adddonor(donor v)
    {
        try
        {
        PreparedStatement rs= con.prepareStatement("insert into donor(d_id,d_name,d_age,d_cnic,v_numb) "
                   + "values(?,?,?,?,?);");
       
           rs.setInt(1,v.getP_id());
           rs.setString(2,v.getP_name());
           rs.setString(3,v.getP_age());
           rs.setString(4,v.getP_cnic());
           rs.setString(5,v.getP_numb());
           
           
           rs.executeUpdate();
           
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
    }
       void adddonation(Donations v)
    {
        try
        {
        PreparedStatement rs= con.prepareStatement("insert into donations(donated_to,donated_by,amountdonated,[Type]) "
                   + "values(?,?,?,?);");
       
           rs.setInt(1,v.getP_id());
           rs.setInt(2,v.getDonor_id());
           rs.setInt(3,v.getAmountdonated());
           rs.setString(4, v.getType());
      
           
           rs.executeUpdate();
           
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
    }
     
    void donate_donation(beneficiary b)
    {
         try
        {
        PreparedStatement rs= con.prepareStatement("insert into donatebeneficiary(needy_id,project_id,amountcollected) "
                   + "values(?,?,?);");
       
         rs.setInt(1,b.getNeedyid());
         rs.setInt(2,b.getProjectid());
         rs.setInt(3,b.getAmountcollected());
         rs.executeUpdate();
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
    }
    
    void addvolunteer(volunteer v)
    {
        try
        {
        PreparedStatement rs= con.prepareStatement("insert into volunteer(vid,vname,vage,vcnic,vnumb) "
                   + "values(?,?,?,?,?);");
       
           rs.setInt(1,v.getP_id());
           rs.setString(2,v.getP_name());
           rs.setString(3,v.getP_age());
           rs.setString(4,v.getP_cnic());
           rs.setString(5,v.getP_numb());
           
           rs.executeUpdate();
           
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
    }
    
    void addproject(project p)
    {
        try
        {
           PreparedStatement rs= con.prepareStatement("insert into project(pid,pname,pmanager,pdesc,reqbudget) "
                   + "values(?,?,?,?,?);");
           
           rs.setInt(1,p.getPid());
           rs.setString(2,p.getProjectname());
           rs.setString(3,p.getManager());
           rs.setString(4,p.getDescription());
           rs.setInt(5,p.getReqbudget());
           
           rs.executeUpdate();
           
  
          
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    void searchprojectbyname(String name)
    {
        int id=0;
        String s="";
        String s2="";
        String s3="";
        int budget=0;
        try
        {
         PreparedStatement rs= con.prepareStatement("select * from project where pname=?");
         rs.setString(1,name);
         ResultSet ps=rs.executeQuery();
          while(ps.next())
          {
              id=ps.getInt(1);
              s=ps.getString(2);
              s2=ps.getString(3);
              s3=ps.getString(4);
              budget=ps.getInt(5);
             // System.out.println(id+" "+s+" "+s2+" "+s3+" "+);
          }
          
          
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
       }
    void searchprojectbymanager(String name)
    {
        int id=0;
        String s="";
        String s2="";
        String s3="";
        try
        {
         PreparedStatement rs= con.prepareStatement("select * from project where pmanager=?");
         rs.setString(1,name);
          ResultSet ps=rs.executeQuery();
          while(ps.next())
          {
              id=ps.getInt(1);
              s=ps.getString(2);
              s2=ps.getString(3);
              s3=ps.getString(4);
          }
          
          System.out.println(id+" "+s+" "+s2+" "+s3);
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
       }
    void searchadonor(int id)
    {
        int sum=0;
        int count=0;
       
        try
        {
         PreparedStatement rs= con.prepareStatement("select sum(amountdonated),count(donated) from donor join\n" +
        "donations on donor.d_id=donations.donated_by\n" +
        "join project on donor.donated=project.pid where d_id=?");
         rs.setInt(1,id);
          ResultSet ps=rs.executeQuery();
          while(ps.next())
          {
              sum=ps.getInt(1);
              count=ps.getInt(2);
          }
          
          System.out.println("sum of donations is: "+sum+" "+"donated to: " + count +" projects");
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
      }
    
    void searchabeneficiary(int id)
    {
        int sum=0;
        int count=0;
       
        try
        {
         PreparedStatement rs= con.prepareStatement("");
         rs.setInt(1,id);
          ResultSet ps=rs.executeQuery();
          while(ps.next())
          {
              sum=ps.getInt(1);
              count=ps.getInt(2);
          }
          
          System.out.println("sum of donations is: "+sum+" "+"donated to: " + count +" projects");
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
       }
    
    void beneficiaryinproject(int id)
    {
        String s="";
        String s1="";
        String s2="";
        String s3="";
        int i=0;
                   
        try
        {
         PreparedStatement rs= con.prepareStatement("select * from needy \n" +
"join project on project.pid=needy.appliedin\n" +
"where pid=?");
         rs.setInt(1,id);
          ResultSet ps=rs.executeQuery();
          while(ps.next())
          {
               s= ps.getString(2);
              s1= ps.getString(3);
              s2= ps.getString(4);
              s3= ps.getString(5);
               i= ps.getInt(6);
               
            System.out.println(s+" "+s1+" "+s2+" "+s3+ " "+i);
             
          }
           
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
      }
    void donorsinproject(int id)
    {
        String s="";
        String s1="";
        String s2="";
        String s3="";
                   
        try
        {
         PreparedStatement rs= con.prepareStatement("select * from donor\n" +
            "join project on project.pid=donor.donated\n" +
            "where pid=?");
         rs.setInt(1,id);
          ResultSet ps=rs.executeQuery();
          while(ps.next())
          {
               s= ps.getString(2);
              s1= ps.getString(3);
              s2= ps.getString(4);
              s3= ps.getString(5);
              
               
            System.out.println(s+" "+s1+" "+s2+" "+s3);
             
          }
           
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
      }
    
    
    }

