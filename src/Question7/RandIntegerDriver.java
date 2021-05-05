/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class RandIntegerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question7: Tejaswi Reddy Nallavolu");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter index of array: ");
        int ind = s.nextInt();
        int array[] = new int[99];
        for (int i = 0; i < 99; i++) {
            array[i] = (int) (100 * Math.random());
        }
        if (ind > 99 || ind < 0) {
            System.out.println("Out of Bounds");
        } else {
            System.out.println("The corresponding element value is  " + array[ind]);
        }

    }

}
