/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
      private ArrayList<DeliveryMan> deliveryManDirectory;
      public DeliveryManDirectory(){
          deliveryManDirectory=new ArrayList<DeliveryMan>();
      }

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
        public DeliveryMan addDeliveryMan(){
         DeliveryMan d = new DeliveryMan();
        deliveryManDirectory.add(d);
        return d;
    }
    public void removeDeliveryMan(DeliveryMan d) {
        deliveryManDirectory.remove(d);
    }
      
}
