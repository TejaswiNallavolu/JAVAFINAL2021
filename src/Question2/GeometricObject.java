/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class GeometricObject {
    private String geoName;
    private int numOfSides;

    public GeometricObject(String geoName, int noOfSides) {
        this.geoName = geoName;
        this.numOfSides = numOfSides;
    }

    public String getGeoName() {
        return geoName;

}
    public int getNoOfSides() {
        return numOfSides;
    }
    
    @Override
    public String toString() {
        return "The geometric object is " + this.geoName
                + " and "+ this.getGeoName() +" is not colorable.";
    }

}