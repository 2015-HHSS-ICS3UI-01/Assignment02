
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class ProgrammingExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robot to live in
        City kw = new City();
        
        // make robot to live in city
        Robot karel = new Robot (kw, 8, 8, Direction.EAST);

        // move karel along the street until he reaches avenue 0
        while(karel.getAvenue() != 0 )
        {
            // point karel west based on his current direction
            // if he is pointed north, turn him west
            if(karel.getDirection() == Direction.NORTH)
            {
                karel.turnLeft();
            
            // if he is pointed east, turn him west
            } else if(karel.getDirection() == Direction.EAST)
            {
                karel.turnLeft();
                karel.turnLeft();

            // if he is pointed south, turn him west
            }else if(karel.getDirection() == Direction.SOUTH)
            {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
        
            // karel is pointing west toward street 0, move him west
            karel.move();
        }
        
        // make karel move along the avenue until he reaches street 0
        while(karel.getStreet() != 0 )
        {
            // point karel north based on his current direction
            if(karel.getDirection() == Direction.EAST)
            {
                karel.turnLeft();

            // if he is pointing south, turn him north
            }else if(karel.getDirection() == Direction.SOUTH)
            {
                karel.turnLeft();
                karel.turnLeft();

            // if he is pointing west, turn him north
            }else if(karel.getDirection() == Direction.WEST)
            {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            } 

            // if he is pointing north toward street 0, move him north
            karel.move();
        }
    }
}
