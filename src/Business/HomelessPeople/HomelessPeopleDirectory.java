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
    private ArrayList<HomelessPerson> homelessPeopleDirectory;
      public HomelessPeopleDirectory(){
          homelessPeopleDirectory=new ArrayList<HomelessPerson>();
      }

    public ArrayList<HomelessPerson> getHomelessDirectory() {
        return homelessPeopleDirectory;
    }

    public void setHomelessDirectory(ArrayList<HomelessPerson> donorDirectory) {
        this.homelessPeopleDirectory = homelessPeopleDirectory;
    }
    public HomelessPerson add(){
         HomelessPerson v = new HomelessPerson();
        homelessPeopleDirectory.add(v);
        return v;
    }
    public void remove(HomelessPerson d) {
        homelessPeopleDirectory.remove(d);
    }
}
