
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City eep = new City();
        
        //make castle towers
        new Wall (eep, 1, 1, Direction.NORTH);
        new Wall (eep, 1, 1, Direction.EAST);
        new Wall (eep, 1, 1, Direction.SOUTH);
        new Wall (eep, 1, 1, Direction.WEST);
        
        new Wall (eep, 1, 4, Direction.NORTH);
        new Wall (eep, 1, 4, Direction.EAST);
        new Wall (eep, 1, 4, Direction.SOUTH);
        new Wall (eep, 1, 4, Direction.WEST);
        
        new Wall (eep, 4, 1, Direction.NORTH);
        new Wall (eep, 4, 1, Direction.EAST);
        new Wall (eep, 4, 1, Direction.SOUTH);
        new Wall (eep, 4, 1, Direction.WEST);
        
        new Wall (eep, 4, 4, Direction.NORTH);
        new Wall (eep, 4, 4, Direction.EAST);
        new Wall (eep, 4, 4, Direction.SOUTH);
        new Wall (eep, 4, 4, Direction.WEST);
        
        //make castle
        new Wall (eep, 2, 2, Direction.WEST);
        new Wall (eep, 2, 2, Direction.NORTH);
        new Wall (eep, 2, 3, Direction.NORTH);
        new Wall (eep, 2, 3, Direction.EAST);
        new Wall (eep, 3, 2, Direction.WEST);
        new Wall (eep, 3 ,2, Direction.SOUTH);
        new Wall (eep, 3, 3, Direction.SOUTH);
        new Wall (eep, 3, 3, Direction.EAST);
        
        //make guard named jimbo
        Robot jimbo = new Robot(eep, 0, 0, Direction.EAST);
        
        //make jimbo patrol castle
        while (true){
            if (jimbo.frontIsClear());{
                jimbo.move();
                jimbo.move();
                jimbo.turnLeft();
                jimbo.turnLeft();
                jimbo.turnLeft();
                jimbo.move();
        }if(!jimbo.frontIsClear());{
                jimbo.turnLeft();
                jimbo.move();
                jimbo.turnLeft();
                jimbo.move();
                jimbo.turnLeft();
                jimbo.turnLeft();
                jimbo.turnLeft();
                jimbo.move();
                jimbo.move();
                jimbo.turnLeft();
                jimbo.turnLeft();
                jimbo.turnLeft();
            }
        }
    }
}
