/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1Ex2;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class SriKanya extends Restaurant implements RestaurantInterface {

    public SriKanya(String restaurantName) {
        super(restaurantName);
    }

    @Override
    public String getRestType() {
        return "cuisine";
    }

    @Override
    public String getLocation() {
       return "Hyderabad";
    }

    @Override
    public int getEstYear() {
        return 1996;
    }
    public String getResName()
    {
        return super.getRestaurantName();
    }    
    
}
