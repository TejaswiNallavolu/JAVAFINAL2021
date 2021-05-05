/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10Ex1;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class FindFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer to Question10Ex1: Tejaswi Reddy Nallavolu");
        // TODO code application logic here
        long nFact = factorial(12);
        System.out.println("The factorial of 12 is: " + nFact);

    }

    public static long factorial(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

}
