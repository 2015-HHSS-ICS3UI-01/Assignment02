
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
 * @author richj0985
 */
public class ProgrammingExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robot to live in
        City kw = new City();
        
        // make robot to live in city
        Robot karel = new Robot (kw, 2, 1, Direction.EAST);
        
        //make finish line using thing
        new Thing (kw, 2, 9);
        
        //make walls within city
        new Wall (kw, 2, 1, Direction.SOUTH);
        new Wall (kw, 2, 2, Direction.SOUTH);
        new Wall (kw, 2, 3, Direction.SOUTH);
        new Wall (kw, 2, 4, Direction.SOUTH);
        new Wall (kw, 2, 5, Direction.SOUTH);
        new Wall (kw, 2, 6, Direction.SOUTH);
        new Wall (kw, 2, 7, Direction.SOUTH);
        new Wall (kw, 2, 8, Direction.SOUTH);
        new Wall (kw, 2, 9, Direction.SOUTH);
        new Wall (kw, 2, 1, Direction.EAST);
        new Wall (kw, 2, 2, Direction.EAST);
        new Wall (kw, 2, 4, Direction.EAST);
        new Wall (kw, 2, 7, Direction.EAST);
        
        // make robot hurdle over walls and make it to the finish line
        while(!karel.canPickThing())
        {
            // make robot move if there is nothing infront of him
            if(karel.frontIsClear())
            {
                karel.move();
            // make robot hurdle of the walls if they are in the way
            }else
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

        }
    }
}
