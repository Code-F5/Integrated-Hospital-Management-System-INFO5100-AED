/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HomelessPeople;


import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class HomelessPeopleDirectory {
    private ArrayList<HomelessPeople> homelessPeopleDirectory;
      public HomelessPeopleDirectory(){
          homelessPeopleDirectory=new ArrayList<HomelessPeople>();
      }

    public ArrayList<HomelessPeople> getDonorDirectory() {
        return homelessPeopleDirectory;
    }

    public void setDonorDirectory(ArrayList<HomelessPeople> donorDirectory) {
        this.homelessPeopleDirectory = homelessPeopleDirectory;
    }
    public HomelessPeople addDonor(){
         HomelessPeople v = new HomelessPeople();
        homelessPeopleDirectory.add(v);
        return v;
    }
    public void removeDonor(HomelessPeople d) {
        homelessPeopleDirectory.remove(d);
    }
}
