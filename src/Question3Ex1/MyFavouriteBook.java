/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3Ex1;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class MyFavouriteBook {
    private String name;
    private int age;

    public MyFavouriteBook(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "author name= " + name + ", author age= " + age ;
    }
    
}
