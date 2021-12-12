/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import java.util.ArrayList;


public class DonorDirectory {
   
      private ArrayList<Donor> donorList;
      public DonorDirectory(){
          donorList=new ArrayList<Donor>();
      }

    public ArrayList<Donor> getDonorList() {
        return donorList;
    }

    public void setDonorList(ArrayList<Donor> donorDirectory) {
        this.donorList = donorDirectory;
    }
    public ArrayList<Donor> addDonor(Donor donor){
         
        donorList.add(donor);
        return donorList;
    }
    public void removeDonor(Donor d) {
        donorList.remove(d);
    }
       
}