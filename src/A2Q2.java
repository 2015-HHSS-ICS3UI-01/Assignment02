
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
 * @author snowc4636
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city for the robot to live in
        City kw = new City();
        
        //Make a robot to live in the City
        Robot Carter = new Robot(kw, 1, 1, Direction.EAST);
        
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 1, 3, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 5, Direction.SOUTH);
        new Wall(kw, 1, 6, Direction.SOUTH);
        new Wall(kw, 1, 7, Direction.SOUTH);
        new Wall(kw, 1, 8, Direction.SOUTH);
        new Wall(kw, 1, 9, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 7, Direction.EAST);
        
        //Make a Thing
        new Thing(kw, 1, 9);
        
        while(true){
            
            if(!Carter.frontIsClear()){
                Carter.turnLeft();
                
                
            }else{
                Carter.move();
                
                if(Carter.frontIsClear()){
                    Carter.turnLeft();
                    Carter.turnLeft();
                    Carter.turnLeft();
                }
                
               
                
                
              
            }
        }
    }
}
