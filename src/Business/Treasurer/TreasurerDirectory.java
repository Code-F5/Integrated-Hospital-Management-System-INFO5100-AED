/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Treasurer;

import java.util.ArrayList;


public class TreasurerDirectory {
   
      private ArrayList<Treasurer> treasurerDirectory;
      public TreasurerDirectory(){
          treasurerDirectory=new ArrayList<Treasurer>();
      }

    public ArrayList<Treasurer> getTreasurerDirectory() {
        return treasurerDirectory;
    }

    public void setTreasurerDirectory(ArrayList<Treasurer> treasurerDirectory) {
        this.treasurerDirectory = treasurerDirectory;
    }
    public Treasurer addTreasurer(){
         Treasurer v = new Treasurer();
        treasurerDirectory.add(v);
        return v;
    }
    public void removeTreasurer(Treasurer t) {
        treasurerDirectory.remove(t);
    }
       
}