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
class BankAccount {
        public int deposit(int amount) {
        if (amount <= 1000) {
            throw new ArithmeticException("Amount should be atleast $1000 in order to deposit into your bank account.");

        } else {
            return 1;
        }
    }

}
