
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
public class ProgrammingExercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robot to live in
        City kw = new City();
        
        // make robot to live in city
        Robot karel = new Robot (kw, 0, 2, Direction.SOUTH);
        Robot tina = new Robot (kw, 0, 2, Direction.SOUTH);
        
        // make walls within city
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        new Wall(kw, 4, 0, Direction.WEST);
        new Wall(kw, 5, 0, Direction.WEST);
        new Wall(kw, 6, 0, Direction.WEST);
        new Wall(kw, 7, 0, Direction.WEST);
        new Wall(kw, 8, 0, Direction.WEST);
        new Wall(kw, 9, 0, Direction.WEST);
        new Wall(kw, 0, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 2, 1, Direction.EAST);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 5, 1, Direction.EAST);
        new Wall(kw, 6, 1, Direction.EAST);
        new Wall(kw, 7, 1, Direction.EAST);
        new Wall(kw, 8, 1, Direction.EAST);
        new Wall(kw, 9, 1, Direction.EAST);
        new Wall(kw, 0, 2, Direction.EAST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.EAST);
        new Wall(kw, 2, 6, Direction.EAST);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 4, 3, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 6, 2, Direction.EAST);
        new Wall(kw, 7, 3, Direction.NORTH);
        new Wall(kw, 7, 4, Direction.NORTH);
        new Wall(kw, 7, 5, Direction.NORTH);
        new Wall(kw, 7, 6, Direction.NORTH);
        new Wall(kw, 7, 7, Direction.NORTH);
        new Wall(kw, 7, 7, Direction.EAST);
        new Wall(kw, 8, 7, Direction.EAST);
        new Wall(kw, 8, 7, Direction.SOUTH);
        new Wall(kw, 8, 6, Direction.SOUTH);
        new Wall(kw, 8, 5, Direction.SOUTH);
        new Wall(kw, 8, 4, Direction.SOUTH);
        new Wall(kw, 8, 3, Direction.SOUTH);
        new Wall(kw, 9, 2, Direction.EAST);
        new Wall(kw, 9, 2, Direction.SOUTH);
        
        // make things for the robots to pick up
        new Thing(kw, 1, 2); 
        new Thing(kw, 2, 2);
        new Thing(kw, 4, 2);
        new Thing(kw, 7, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 6);
        new Thing(kw, 4, 3);
        new Thing(kw, 4, 4);
        new Thing(kw, 7, 3);
        new Thing(kw, 8, 3);
        new Thing(kw, 8, 4);
        new Thing(kw, 8, 6);
        new Thing(kw, 7, 7);
        new Thing(kw, 0, 3);
        new Thing(kw, 0, 4);
        new Thing(kw, 0, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 3, 6);
        new Thing(kw, 3, 4);
        new Thing(kw, 4, 6);
        new Thing(kw, 4, 7);
        new Thing(kw, 5, 7);
        new Thing(kw, 5, 5);
        new Thing(kw, 6, 4);
        new Thing(kw, 6, 6);
        new Thing(kw, 9, 3);
        new Thing(kw, 9, 4);
        new Thing(kw, 9, 6);
        new Thing(kw, 0, 1);
        new Thing(kw, 1, 0);
        new Thing(kw, 2, 0);
        new Thing(kw, 3, 0);
        new Thing(kw, 4, 0);
        new Thing(kw, 3, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 7, 0);
        new Thing(kw, 7, 1);
        new Thing(kw, 8, 1);
        new Thing(kw, 9, 0);
        new Thing(kw, 9, 1);
        
        // move karel from street 0 to street 9, clean each street of snow
        while(karel.getStreet() != 9)
        {
            // turn left to allow karel to examine the street or avenue 
            // to his left, if it's clear then move in that direction
            // if not then move forward and repeat
            karel.turnLeft();
                        
            // make karel check if his front is clear and move 
            // however only allow karel to move provided he is not 
            // going north, to ensure he is moving toward street 9
            if(karel.frontIsClear() )
            {
                karel.move();
                
            // if not, make karel turn left three times to face forward 
            // and move in that direction if clear
            }  else
            {
                karel.turnLeft();
                karel.turnLeft();
            }
             
            // make karel drop the snow in his back pack if he is on the sidewalk (avenue 2) 
            // otherwise if on driveway, then pick up the snow and put it in his backpack
            if(karel.getAvenue() == 2 && karel.countThingsInBackpack() > 0)
            {
                // make karel put down things if he has things
                while(karel.countThingsInBackpack() > 0)
                {
                    karel.putThing();
                }
            // if not, then on driveway, make karel pick things
            }else if(karel.getAvenue() != 2 && karel.canPickThing() == true)
            {
                karel.pickThing();
            }
        }
        
        // make tina do something if she is not on street 9
        while(tina.getStreet() != 9)
        {
            // make tina pick up things along avenue 2
            if(tina.canPickThing())
            {
            tina.pickThing();
            //if not make tina move forward
            }else
            {
                tina.move();
            }
        }
        
        // if tina is on street 9 make her put down things
        while(tina.getStreet() == 9 && tina.countThingsInBackpack() > 0)
        {
            tina.putThing();
        }
   }
}
