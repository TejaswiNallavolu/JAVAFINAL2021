/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11Ex1;

import java.util.Objects;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class Hospital {

    public String patientName;
    public int patientId;

    public Hospital(String patientName, int patientId) {
        this.patientName = patientName;
        this.patientId = patientId;
    }

    @Override
    public int hashCode() {

        // We are returning the Geek_id as a hashcode value. we can also return some 
        // other calculated value or may be memory address of the Object on which it is invoked. 
        // it depends on how you implement hashCode() method.
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.patientName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        // checking if both the object references are 
        // referring to the same object or not.
        if (this == obj) {
            // it checks if the argument is of the type Geek by comparing the classes 
            // of the passed argument and this object.
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hospital other = (Hospital) obj;
        // comparing the state of argument with 
        // the state of 'this' Object.
        if (!Objects.equals(this.patientName, other.patientName)) {
            return false;
        }
        return true;
    }

}
