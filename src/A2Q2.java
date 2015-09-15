
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
 * @author whitb0039
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make new city
        City kw = new City();
        
        Robot karel = new Robot(kw, 2, 0, Direction.EAST);
        
        //make thing
        new Thing(kw, 2, 8);
        
        //make walls
        new Wall (kw, 2, 0, Direction.SOUTH);
        new Wall (kw, 2, 0, Direction.EAST);
        new Wall (kw, 2, 1, Direction.SOUTH);
        new Wall (kw, 2, 1, Direction.EAST);
        new Wall (kw, 2, 2, Direction.SOUTH);
        new Wall (kw, 2, 3, Direction.SOUTH);
        new Wall (kw, 2, 3, Direction.EAST);
        new Wall (kw, 2, 4, Direction.SOUTH);
        new Wall (kw, 2, 5, Direction.SOUTH);
        new Wall (kw, 2, 6, Direction.SOUTH);
        new Wall (kw, 2, 6, Direction.EAST);
        new Wall (kw, 2, 7, Direction.SOUTH);
        new Wall (kw, 2, 8, Direction.SOUTH);
        
        if(!karel.frontIsClear())
        {
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        }
        if(karel.frontIsClear())
        {
        karel.move();
        }
        if(!karel.frontIsClear())
        {
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        }
        if(karel.frontIsClear())
        {
        karel.move();
        }
        if(karel.frontIsClear())
        {
        karel.move();
        }
        if(!karel.frontIsClear())
        {
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        }
        if(karel.frontIsClear())
        {
        karel.move();
        }
        if(karel.frontIsClear())
        {        
            karel.move();
        }
        if(!karel.frontIsClear())
        {
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        }
        if(karel.frontIsClear())
        {
        karel.move();
        if(karel.canPickThing())
        {        
            karel.pickThing();
        }
        
    }
    }
}
