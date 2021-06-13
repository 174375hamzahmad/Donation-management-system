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
public class Donations 
{
    int p_id;
    int donor_id;
    int amountdonated;
    String type;

    public Donations(int p_id, int donor_id, int amountdonated, String type) {
        this.p_id = p_id;
        this.donor_id = donor_id;
        this.amountdonated = amountdonated;
        this.type = type;
    }

   

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getDonor_id() {
        return donor_id;
    }

    public void setDonor_id(int donor_id) {
        this.donor_id = donor_id;
    }

    public int getAmountdonated() {
        return amountdonated;
    }

    public void setAmountdonated(int amountdonated) {
        this.amountdonated = amountdonated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }   
  
}