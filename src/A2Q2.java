
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // make city
        City eep = new City();
        
        //make ground
        new Wall (eep, 2, 0, Direction.SOUTH);
        new Wall (eep, 2, 1, Direction.SOUTH);
        new Wall (eep, 2, 2, Direction.SOUTH);
        new Wall (eep, 2, 3, Direction.SOUTH);
        new Wall (eep, 2, 4, Direction.SOUTH);
        new Wall (eep, 2, 5, Direction.SOUTH);
        new Wall (eep, 2, 6, Direction.SOUTH);
        new Wall (eep, 2, 7, Direction.SOUTH);
        new Wall (eep, 2, 8, Direction.SOUTH);
        new Wall (eep, 2, 9, Direction.SOUTH);
        
        //make hurdles
        new Wall (eep, 2, 0, Direction.EAST);
        new Wall (eep, 2, 1, Direction.EAST);
        new Wall (eep, 2, 3, Direction.EAST);
        new Wall (eep, 2, 6, Direction.EAST);
        
        //make finish line
        new Thing (eep, 2, 9);
       
        //make robot
        Robot jimbo = new Robot (eep, 2, 0, Direction.EAST);
        
        //actions
        while (true){
        if (jimbo.frontIsClear()){
            jimbo.move();
        }else if (!jimbo.frontIsClear()){
                jimbo.turnLeft();
                        jimbo.move();
                        jimbo.turnLeft();
                        jimbo.turnLeft();
                        jimbo.turnLeft();
                        jimbo.move();
                        jimbo.turnLeft();
                        jimbo.turnLeft();
                        jimbo.turnLeft();
                        jimbo.move();
                        jimbo.turnLeft();              
                     }
        if (jimbo.canPickThing())
            jimbo.pickThing();
                 
             
        }
             
    }
} 
                

         
        

