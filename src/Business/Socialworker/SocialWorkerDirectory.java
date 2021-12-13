/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SocialWorker;

import java.util.ArrayList;


public class SocialWorkerDirectory {
   
      private ArrayList<SocialWorker> socialworkerDirectory;
      public SocialWorkerDirectory(){
          socialworkerDirectory=new ArrayList<SocialWorker>();
      }

    public ArrayList<SocialWorker> getSocialWorkerDirectory() {
        return socialworkerDirectory;
    }

    public void setSocialWorkerDirectory(ArrayList<SocialWorker> socialworkerDirectory) {
        this.socialworkerDirectory = socialworkerDirectory;
    }
    public SocialWorker addSocialWorker(){
         SocialWorker v = new SocialWorker();
        socialworkerDirectory.add(v);
        return v;
    }
    public void removeSocialWorker(SocialWorker sw) {
        socialworkerDirectory.remove(sw);
    }
       
}