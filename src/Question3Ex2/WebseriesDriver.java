/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3Ex2;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class WebseriesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question3Ex2: Tejaswi Reddy Nallavolu");
        int m=(int)5.5;
        System.out.println("rating of the webseries: "+m);
        Webseries w= new Webseries("Bates Motel",2013);
        System.out.println("My one of the favourite characters is Dylan Masset.");
        Actor a= new Actor("Bates Motel", 2013, "House at the end of the street.");
        w=a;
        a=(Actor)w;
        System.out.println(a);
        
    }
    
}
