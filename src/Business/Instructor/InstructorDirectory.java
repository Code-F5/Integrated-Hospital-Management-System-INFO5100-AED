/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Instructor;

import java.util.ArrayList;


public class InstructorDirectory {
   
      private ArrayList<Instructor> instructorDirectory;
      public InstructorDirectory(){
          instructorDirectory=new ArrayList<Instructor>();
      }

    public ArrayList<Instructor> getInstructorDirectory() {
        return instructorDirectory;
    }

    public void setInstructorDirectory(ArrayList<Instructor> instructorDirectory) {
        this.instructorDirectory = instructorDirectory;
    }
    public ArrayList<Instructor> addInstructor(Instructor instructor){
        
        instructorDirectory.add(instructor);
        return instructorDirectory;
    }
    public void removeInstructor(Instructor i) {
        instructorDirectory.remove(i);
    }
       
}