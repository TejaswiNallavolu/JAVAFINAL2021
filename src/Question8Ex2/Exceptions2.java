/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8Ex2;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class Exceptions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Answer for Question8Ex1: Tejaswi Reddy Nallavolu");
      
        try {
            Scanner scan = new Scanner(new File("Input.txt"));
            
                String s = scan.nextLine();
                if(!scan.hasNext()){
                    throw new EOFException("End of file exception");
                }
            
        } 
        catch(EOFException Ex){
            System.out.println(Ex);
        }
    }
}
    
    

