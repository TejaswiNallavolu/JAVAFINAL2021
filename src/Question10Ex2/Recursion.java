/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10Ex2;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer to Question10Ex2: Tejaswi Reddy Nallavolu");
int n,key=9;
      int a[]={1,4,7,9,10};     
      for (n= 0; n < a.length; n++)
      {
         if (a[n] == key) 
         {
           System.out.println(key+" is present at location "+(n+1));
           break;
         }
      }
      if (n== a.length)
        System.out.println(key + " doesn't exist in array.");
   }

}

    
