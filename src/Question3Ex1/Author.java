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
public class Author extends MyFavouriteBook {

    private String bookName;

    public Author(String name, int age, String bookName) {
        super(name, age);
        this.bookName=bookName;
       
    }

       

    @Override
    public String toString() {
        return super.toString() + ", bookName= " + bookName ;
    }
    

}
