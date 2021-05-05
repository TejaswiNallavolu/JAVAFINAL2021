/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question 5: Tejaswi Reddy Nallavolu");

        ComparableCircle circle1 = new ComparableCircle(10);

        ComparableCircle circle2 = new ComparableCircle(5);

        if (circle1.compareTo(circle2) > 0) {
            System.out.println("Circle2 is larger than Circle1 ");
        } else if (circle1.compareTo(circle2) < 0) {
            System.out.println("Circle1 is larger than Circle2");
        } else {
            System.out.println("The two circles are of same area.");
        }

    }

    }
    
