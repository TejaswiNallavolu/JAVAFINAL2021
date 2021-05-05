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
public class MyBookDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Answer for Question3Ex1: Tejaswi Reddy Nallavolu");
        double p=6;
        System.out.println("price of the book: " +p);
        int r=(int)3.5;
        System.out.println("rating of the book: "+r);
        MyFavouriteBook a= new MyFavouriteBook("Chetan Bhagat", 47);
       Author authoress=new Author("Preethi Shenoy", 49  , " It happens for a Reason ");
       a=authoress;
       authoress=(Author)a;
        System.out.println(authoress);
        
        
    }
    
}
