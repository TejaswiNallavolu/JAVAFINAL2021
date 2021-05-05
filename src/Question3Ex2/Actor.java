/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3Ex2;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class Actor extends Webseries{
    private String series;
    
    public Actor(String name, int year, String series) {
        super(name, year);
        this.series=series;
    }

    @Override
    public String toString() {
        return super.toString()+ " He also acted in another series named  " + series ;
    }
    
    
}
