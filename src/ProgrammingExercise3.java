
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

        // Move karel along the street until he reaches Avenue 0
        while(karel.getAvenue() != 0 )
        {
            // Point karel West based on his current direction
            // if he is pointed North, turn him West
            if(karel.getDirection() == Direction.NORTH)
            {
                karel.turnLeft();
            
            // if he is pointed East, turn him West
            } else if(karel.getDirection() == Direction.EAST)
            {
                karel.turnLeft();
                karel.turnLeft();

            // if he is pointed South, turn him West
            }else if(karel.getDirection() == Direction.SOUTH)
            {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
        
            // karel is pointing West toward 0 Street, move him West
            karel.move();
        }
        
        // make karel move along the avenue until he reaches 0 street
        while(karel.getStreet() != 0 )
        {
            // point karel North based on his current direction
            if(karel.getDirection() == Direction.EAST)
            {
                karel.turnLeft();

            // if he is pointing South, turn him North
            }else if(karel.getDirection() == Direction.SOUTH)
            {
                karel.turnLeft();
                karel.turnLeft();

            // pointing West, turn him North
            }else if(karel.getDirection() == Direction.WEST)
            {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            } 

            // karel is pointing North toward 0 Street, move him North
            karel.move();
        }
    }
}
