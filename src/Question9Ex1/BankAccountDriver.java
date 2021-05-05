/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9Ex1;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class BankAccountDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer to Question9Ex1: Tejaswi Reddy Nallavolu");
        try {
            BankAccount amt = new BankAccount();
            System.out.println(amt.deposit(2000));
            System.out.println(amt.deposit(50)); 
        } catch (ArithmeticException Ex) {
            System.out.println(Ex.getMessage());
        }
    }

}
    

