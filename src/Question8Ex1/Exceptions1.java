/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class Exceptions1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question8Ex1: Tejaswi Reddy Nallavolu");
        try {
            // TODO code application logic here
            Scanner scan = new Scanner(new File("input1.txt"));
        } 
        catch (FileNotFoundException Ex) {
            System.out.println("this is a File not found exception");
        }

    }
    
}
