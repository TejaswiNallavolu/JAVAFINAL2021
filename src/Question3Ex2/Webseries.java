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
public class Webseries {
    private String name;
    private int year;

    public Webseries(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return  "Dylan Masset acted in  " + name + ", released in the year " + year +",";
    }

   
}
