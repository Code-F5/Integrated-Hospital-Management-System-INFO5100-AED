/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Counselor;

import java.util.ArrayList;


public class CounselorDirectory {
   
      private ArrayList<Counselor> counselorDirectory;
      public CounselorDirectory(){
          counselorDirectory=new ArrayList<Counselor>();
      }

    public ArrayList<Counselor> getCounselorDirectory() {
        return counselorDirectory;
    }

    public void setCounselorDirectory(ArrayList<Counselor> counselorDirectory) {
        this.counselorDirectory = counselorDirectory;
    }
    public ArrayList<Counselor> addCounselor(Counselor counselor){
        
        counselorDirectory.add(counselor);
        return counselorDirectory;
    }
    public void removeCounselor(Counselor c) {
        counselorDirectory.remove(c);
    }
       
}