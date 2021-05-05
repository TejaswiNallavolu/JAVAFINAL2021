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
        recSearch(a, 0, a.length-1, key);
   }

    public static void recSearch(int[] a, int startIndex, int len, int key) {
        
     if (startIndex == len){
        System.out.println(key + " doesn't exist in array.");   
     }
     else{
         if (a[startIndex] == key) 
         {
           System.out.println(key+" is present at location "+(startIndex+1));
          
         }
         else{
             recSearch(a, startIndex+1, len, key);
         }
    }
    }
}