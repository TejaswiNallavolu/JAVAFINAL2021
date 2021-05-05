/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class CheckedException1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Answer to Question6Ex1: Tejaswi Reddy Nallavolu");
        // TODO code application logic here

        Scanner sc = new Scanner(new File("input.txt"));

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }

}


