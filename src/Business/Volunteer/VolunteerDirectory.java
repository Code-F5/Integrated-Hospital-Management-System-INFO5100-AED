/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class VolunteerDirectory {
   
      private ArrayList<Volunteer> volunteerDirectory;
      public VolunteerDirectory(){
          volunteerDirectory=new ArrayList<Volunteer>();
      }

    public ArrayList<Volunteer> getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(ArrayList<Volunteer> volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }
    public Volunteer addVolunteer(){
         Volunteer v = new Volunteer();
        volunteerDirectory.add(v);
        return v;
    }
    public void removeVolunteer(Volunteer v) {
        volunteerDirectory.remove(v);
    }
       
}