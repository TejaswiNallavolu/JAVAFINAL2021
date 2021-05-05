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
public abstract class Restaurant {
    private String restaurantName;

    public Restaurant(String restaurantName) {
        this.restaurantName=restaurantName;
        
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    @Override
    public String toString() {
        return "One of the top-notch restaurants in hyderabad is "  + restaurantName;
    }
    
    
    
}
