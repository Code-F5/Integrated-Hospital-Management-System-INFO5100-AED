/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Food;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.util.Date;


public class WorkRequest {

    private String message;
    private Customer customer;
    private DeliveryMan deliverMan;
    private Restaurant restaurant;
    private String status;
    private Food food;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryMan getDeliverMan() {
        return deliverMan;
    }

    public void setDeliverMan(DeliveryMan deliverMan) {
        this.deliverMan = deliverMan;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString(){
        return this.customer.getName();
    }
}
