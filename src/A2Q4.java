
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
 * @author kulla6503
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city for the Robot to live in
        City NYC = new City();

        Robot karel = new Robot(NYC, 0, 0, Direction.EAST);

        new Wall(NYC, 1, 1, Direction.SOUTH);
        new Wall(NYC, 1, 1, Direction.NORTH);
        new Wall(NYC, 1, 1, Direction.EAST);
        new Wall(NYC, 1, 1, Direction.WEST);
        new Wall(NYC, 1, 4, Direction.SOUTH);
        new Wall(NYC, 1, 4, Direction.NORTH);
        new Wall(NYC, 1, 4, Direction.EAST);
        new Wall(NYC, 1, 4, Direction.WEST);
        new Wall(NYC, 4, 1, Direction.SOUTH);
        new Wall(NYC, 4, 1, Direction.NORTH);
        new Wall(NYC, 4, 1, Direction.EAST);
        new Wall(NYC, 4, 1, Direction.WEST);
        new Wall(NYC, 4, 4, Direction.SOUTH);
        new Wall(NYC, 4, 4, Direction.NORTH);
        new Wall(NYC, 4, 4, Direction.EAST);
        new Wall(NYC, 4, 4, Direction.WEST);
        new Wall(NYC, 2, 2, Direction.WEST);
        new Wall(NYC, 3, 2, Direction.WEST);
        new Wall(NYC, 3, 2, Direction.SOUTH);
        new Wall(NYC, 3, 3, Direction.SOUTH);
        new Wall(NYC, 3, 3, Direction.EAST);
        new Wall(NYC, 2, 3, Direction.EAST);
        new Wall(NYC, 2, 2, Direction.NORTH);
        new Wall(NYC, 2, 3, Direction.NORTH);

while(true)
{
        while (karel.frontIsClear()) {
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
        }
        if (karel.frontIsClear()) {
            karel.move();
        } else {
            karel.turnLeft();
            karel.move();
        }

        if (karel.frontIsClear()) {
            karel.move();
        } else {
            karel.turnLeft();
            karel.move();
        }
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        
        
}

                
                
                
                
                
                
                
    }
}
