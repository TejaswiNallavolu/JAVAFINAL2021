/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11Ex1;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class HospitalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Anser for Question11Ex1: Tejaswi Reddy Nallavolu");
        // TODO code application logic here
        Hospital Patient1 = new Hospital("Rithu", 23);
        Hospital Patient2 = new Hospital("Rithu", 32);
        if (Patient1.hashCode() == Patient2.hashCode()) {

            if (Patient1.equals(Patient2)) {
                System.out.println("Both Patients are same. ");
            } else {
                System.out.println("Both Patients are not same. ");
            }

        } else {
            System.out.println("Both Patients are not same. ");
        }
    }
}
