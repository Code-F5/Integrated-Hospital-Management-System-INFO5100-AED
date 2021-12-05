/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Caretaker;

import java.util.ArrayList;


public class CaretakerDirectory {
   
      private ArrayList<Caretaker> caretakerDirectory;
      public CaretakerDirectory(){
          caretakerDirectory=new ArrayList<Caretaker>();
      }

    public ArrayList<Caretaker> getCaretakerDirectory() {
        return caretakerDirectory;
    }

    public void setCaretakerDirectory(ArrayList<Caretaker> caretakerDirectory) {
        this.caretakerDirectory = caretakerDirectory;
    }
    public Caretaker addCaretaker(){
         Caretaker v = new Caretaker();
        caretakerDirectory.add(v);
        return v;
    }
    public void removeCaretaker(Caretaker ct) {
        caretakerDirectory.remove(ct);
    }
       
}