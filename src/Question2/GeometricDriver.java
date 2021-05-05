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
public class GeometricDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer to Question2: Tejaswi Reddy Nallavolu");
        GeometricObject[] geometricArray = new GeometricObject[5];
        Square gObj1 = new Square(false, 10, "1stSquare", 4);
        Square gObj2 = new Square(true, 6, "2ndSquare", 4);
        GeometricObject gObj3 = new Square(false, 3.7, "3rdSquare", 4);
        GeometricObject gObj4 = new Square(true, 5, "4thSquare", 4);
        GeometricObject gObj5 = new Square(false, 8.2, "5thSquare", 4);
        geometricArray[0] = gObj3;
        geometricArray[1] = gObj1;
        geometricArray[2] = gObj4;
        geometricArray[3] = gObj5;
        geometricArray[4] = gObj2;

        for (GeometricObject geo : geometricArray) {
            Square sq = (Square) (geo);
            if (sq.isColorable()) {
                sq.howToColor();
                System.out.println("The Area of " + sq.getGeoName() + " is " + Math.round(sq.calcArea() * 100) / 100.0);
            } else {
                System.out.println(geo);

            }
        }

    }

}
