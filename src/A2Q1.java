
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
 * @author sevcm7279
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City eep = new City();
        
        Robot jimbo = new Robot (eep, 1, 1, Direction.EAST);
        
        new Thing (eep, 1, 2);
        new Thing (eep, 1, 3);
        new Thing (eep, 1, 4);
        new Thing (eep, 1, 5);
        new Thing (eep, 1, 6);
        new Thing (eep, 1, 7);
        new Thing (eep, 1, 8);
        new Thing (eep, 1, 9);
        new Thing (eep, 1, 10);
        new Thing (eep, 1, 11);
   
        while (jimbo.countThingsInBackpack() <7){
            jimbo.move();
            jimbo.pickThing();
        
    }
        do { jimbo.move();
        }while (jimbo.canPickThing());
        
                }} 
    
 
    

