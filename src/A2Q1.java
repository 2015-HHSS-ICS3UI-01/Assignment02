
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
 * @author dawsr2694
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //Make city
        City A2Q1 = new City();
        
        //Make Robot
        Robot karel = new Robot(A2Q1, 1, 1, Direction.EAST);
        
        //Make Things
        new Thing(A2Q1, 1, 2);
        new Thing(A2Q1, 1, 3);
        new Thing(A2Q1, 1, 4);
        new Thing(A2Q1, 1, 5);
        new Thing(A2Q1, 1, 6);
        new Thing(A2Q1, 1, 7);
        new Thing(A2Q1, 1, 8);
        new Thing(A2Q1, 1, 9);
        new Thing(A2Q1, 1, 10);
        new Thing(A2Q1, 1, 11);
        
        while( karel.countThingsInBackpack()<7){
            karel.move();
            karel.pickThing();
        }
        if( karel.countThingsInBackpack()>=7){
            karel.move();
            karel.move();
            karel.move();
            karel.move();
        }
        

            
        
        
        
        
        
        
        
        
    }
}
        