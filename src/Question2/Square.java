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
public class Square extends GeometricObject implements Colorable{
    private final boolean colorable;
    private final double sidelength;

public Square(boolean colorable, double sidelength, String geoName, int numOfSides) {
        super(geoName, numOfSides);
        this.sidelength = sidelength;
        this.colorable = colorable;
    }
public boolean isColorable() {
        return colorable;
    }

    public double getsidelength() {
        return sidelength;
    }

    public double calcArea() {
        return Math.pow(sidelength, 2);
                
    }
    
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

}

    

