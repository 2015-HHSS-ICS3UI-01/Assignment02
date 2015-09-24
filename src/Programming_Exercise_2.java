
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class Programming_Exercise_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City starbucks = new City();
        
        new Wall (starbucks,1,1,Direction.EAST);
        new Wall (starbucks,1,2,Direction.EAST);
        new Wall (starbucks,1,4,Direction.EAST);
        new Wall (starbucks,1,7,Direction.EAST);
        
        new Thing (starbucks,1,9);
        
        Robot java = new Robot(starbucks,1,1,Direction.EAST);
        
        while(!java.canPickThing()){
            if (java.frontIsClear()) {
                java.move();
            }
            if (!java.frontIsClear()) {
                java.turnLeft();
                java.move();
                java.turnLeft();
                java.turnLeft();
                java.turnLeft();
                java.move();
                java.turnLeft();
                java.turnLeft();
                java.turnLeft();
                java.move();
                java.turnLeft();
            }
        }


                
        
        
                
    }
    
}
