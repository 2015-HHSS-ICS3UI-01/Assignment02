
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vickj2854
 */
public class A2Q1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        
        City kw = new City();
        
       // make karel the robot
        
        Robot karal = new Robot(kw, 1,1, Direction.EAST);
        
        // make things 
        
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
        
        // make jim move
        
        while( true){
                
     if(karel.canPickThing())
     { karel.move();
     }else{
     
          
        
        
       
        
           }
    }
}
}
    



    
    