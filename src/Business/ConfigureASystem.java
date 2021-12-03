package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.Restaurant.Food;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
      
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole());
        UserAccount ur1 = system.getUserAccountDirectory().createUserAccount("restaurant1", "restaurant1", new AdminRole());
        UserAccount uc1 = system.getUserAccountDirectory().createUserAccount("customer1", "customer1", new CustomerRole());
        UserAccount ud1 = system.getUserAccountDirectory().createUserAccount("deliveryMan1", "deliveryMan1", new DeliverManRole());
        Customer c1=system.getCustomerDirectory().addCustomer();
        c1.setName("customer1");
        DeliveryMan d1=system.getDeliveryManDirectory().addDeliveryMan();
        d1.setName("deliveryMan1");
        Restaurant r1=system.getRestaurantDirectory().addRestaurant();
        r1.setName("restaurant1");
        Menu m1=new Menu();
        Food f1=m1.addFood();
        f1.setName("food1");
        f1.setPrice(9.99);
        Food f2=m1.addFood();
        f2.setName("food2");
        f2.setPrice(10.99);
        r1.setMenu(m1);
        WorkRequest w1=system.getWorkQueue().addWorkRequest();
        w1.setCustomer(c1);
        w1.setDeliverMan(d1);
        w1.setRestaurant(r1);
        w1.setFood(f1);
        w1.setMessage("nice");
        w1.setStatus("complete");
        for(WorkRequest workRequest:system.getWorkQueue().getWorkRequestList()){
            for(Customer customer:system.getCustomerDirectory().getCustomerDirectory()){
                if(customer.equals(workRequest.getCustomer())){
                    if(customer.getWorkQueue()==null){
                
                        customer.setWorkQueue(new WorkQueue());
                    }
                   customer.getWorkQueue().addWorkRequest(workRequest);
                }
            }
        for(DeliveryMan deliveryMan:system.getDeliveryManDirectory().getDeliveryManDirectory()){
              if(deliveryMan.equals(workRequest.getDeliverMan())){
                    if(deliveryMan.getWorkQueue()==null){
                        deliveryMan.setWorkQueue(new WorkQueue());
                    }
                   deliveryMan.getWorkQueue().addWorkRequest(workRequest);
                }
            }
             for(Restaurant restaurant:system.getRestaurantDirectory().getRestaurantList()){
              if(restaurant.equals(workRequest.getRestaurant())){
                    if(restaurant.getWorkQueue()==null){
                        restaurant.setWorkQueue(new WorkQueue());
                    }
                   restaurant.getWorkQueue().addWorkRequest(workRequest);
                }
            }
        }
        return system;
    }
    
}
