/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author moore3607
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //made a new city called kw
        City kw = new City();
        
        //made a new robot called metalguy
        Robot metalguy = new Robot(kw,1,1,Direction.EAST);
        //made things
        new Thing(kw,1,2);
        new Thing(kw,1,3);
        new Thing(kw,1,4);
        new Thing(kw,1,5);
        new Thing(kw,1,6);
        new Thing(kw,1,7);
        new Thing(kw,1,8);
        new Thing(kw,1,9);
        new Thing(kw,1,10);
        new Thing(kw,1,11);
        
        metalguy.move();
        //will execute the following commands 
        //if metalguy is standing on a thing
        while(metalguy.canPickThing()){ 
            
            metalguy.pickThing();
            metalguy.move();
        //will execute the following commands if metalguy has 7 or more items
        if(metalguy.countThingsInBackpack()>=7){  
                   metalguy.move();
                   metalguy.move();
                   metalguy.move();}}
        
        
                 

 
    
    }
}
    
