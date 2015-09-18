
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
 * @author kulla6503
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city for the Robot to live in
        City NYC = new City(); 
        
        Robot karel = new Robot(NYC, 1, 1, Direction.EAST); 
        
        new Thing(NYC, 1, 2); 
        new Thing(NYC, 1, 3); 
        new Thing(NYC, 1, 4); 
        new Thing(NYC, 1, 5); 
        new Thing(NYC, 1, 6); 
        new Thing(NYC, 1, 7); 
        new Thing(NYC, 1, 8); 
        new Thing(NYC, 1, 9); 
        new Thing(NYC, 1, 10); 
        new Thing(NYC, 1, 11); 
        
        karel.move();
        while(true) {
       if(karel.countThingsInBackpack() <7 ) {
           karel.pickThing();
           karel.move();
       }else{
           break; 
       }
       
        
        
    }
         karel.move();
        karel.move();
        karel.move();
}
} 

 

