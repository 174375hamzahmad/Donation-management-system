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
public class person 
{
    
  int p_id;
    String p_name;
    String p_age;
    String p_cnic;
    String p_numb;
  

    public person(int p_id, String p_name, String p_age, String p_cnic, String p_numb
            ) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_age = p_age;
        this.p_cnic = p_cnic;
        this.p_numb = p_numb;
       
    }

 
    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_age() {
        return p_age;
    }

    public void setP_age(String p_age) {
        this.p_age = p_age;
    }

    public String getP_cnic() {
        return p_cnic;
    }

    public void setP_cnic(String p_cnic) {
        this.p_cnic = p_cnic;
    }

    public String getP_numb() {
        return p_numb;
    }

    public void setP_numb(String p_numb) {
        this.p_numb = p_numb;
    }
    
    
    
}
