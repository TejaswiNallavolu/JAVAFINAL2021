/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9Ex2;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class PayChequeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer to Question9Ex2: Tejaswi Reddy Nallavolu");
        try {
            PayCheque p = new PayCheque();

            //int amt=50;
            int amt = 500;

            if (amt > 100) {
                throw new IllegalArgumentException("Amount should be less than $100");
            } else {
                System.out.println(p.depositCheque(100));
            }
        } catch (ArithmeticException Ex) {
            System.out.println(Ex.getMessage());
        } catch (RuntimeException Ex) {
            System.out.println(Ex.getMessage());
        }
    }

}
