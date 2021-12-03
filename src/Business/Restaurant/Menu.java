/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author yaopeixinmac
 */
public class Menu {
        private ArrayList<Food> menu;
        
           public Menu() {
        menu = new ArrayList<Food>();
    }

    public ArrayList<Food> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Food> menu) {
        this.menu = menu;
    }
    public Food addFood(){
         Food f = new Food();
        menu.add(f);
        return f;
    }
    public void removeFood(Food f) {
        menu.remove(f);
    }
    
}
