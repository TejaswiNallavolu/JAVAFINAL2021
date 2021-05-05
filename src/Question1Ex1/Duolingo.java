/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1Ex1;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class Duolingo extends Languages implements English{
    
    public Duolingo(String name) {
        super(name);
    }

    @Override
    public int marks() {
       return 320;
    }
    
    
}
