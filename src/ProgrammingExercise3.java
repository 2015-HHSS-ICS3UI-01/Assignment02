
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this license header, choose License Headers in Project Properties.
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
        
        // make robot do something if he is not on street 0
        while(karel.getStreet() != 0 )
        {
            // make robot move straight if he is facing north
            if(karel.getDirection() == Direction.NORTH)
            {
                karel.move();
            // make robot turn left once if he is facing east
            }else if(karel.getDirection() == Direction.EAST)
            {
                karel.turnLeft();
            // make robot turn left twice if he is facing south
            }else if(karel.getDirection() == Direction.SOUTH)
            {
                karel.turnLeft();
                karel.turnLeft();
            // make robot turn left three times if he is facing west
            }else if(karel.getDirection() == Direction.WEST)
            {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
        }
        
        //make robot do something if he is not on avenue 0
        while(karel.getAvenue() != 0 )
        {
            // make robot turn left once if he is faced north
            if(karel.getDirection() == Direction.NORTH)
            {
                karel.turnLeft();
            // make robot move if he is not faced north
            }else
            {
                karel.move();
            }
        }
    }
    
}
