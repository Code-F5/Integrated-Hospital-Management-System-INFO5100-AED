/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import java.util.ArrayList;


public class DonorDirectory {
   
      private ArrayList<Donor> donorDirectory;
      public DonorDirectory(){
          donorDirectory=new ArrayList<Donor>();
      }

    public ArrayList<Donor> getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(ArrayList<Donor> donorDirectory) {
        this.donorDirectory = donorDirectory;
    }
    public Donor addDonor(){
         Donor v = new Donor();
        donorDirectory.add(v);
        return v;
    }
    public void removeDonor(Donor d) {
        donorDirectory.remove(d);
    }
       
}