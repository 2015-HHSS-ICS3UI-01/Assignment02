
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
 * @author eadil1765
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   City L = new City();

        new Wall(L, 1, 1, Direction.EAST);
        new Wall(L, 1, 1, Direction.NORTH);
        new Wall(L, 1, 1, Direction.SOUTH);
        new Wall(L, 1, 1, Direction.WEST);

        new Wall(L, 1, 4, Direction.EAST);
        new Wall(L, 1, 4, Direction.NORTH);
        new Wall(L, 1, 4, Direction.SOUTH);
        new Wall(L, 1, 4, Direction.WEST);

        new Wall(L, 4, 1, Direction.EAST);
        new Wall(L, 4, 1, Direction.NORTH);
        new Wall(L, 4, 1, Direction.SOUTH);
        new Wall(L, 4, 1, Direction.WEST);

        new Wall(L, 4, 4, Direction.EAST);
        new Wall(L, 4, 4, Direction.NORTH);
        new Wall(L, 4, 4, Direction.SOUTH);
        new Wall(L, 4, 4, Direction.WEST);

        new Wall(L, 2, 2, Direction.WEST);
        new Wall(L, 2, 2, Direction.NORTH);
        new Wall(L, 3, 2, Direction.WEST);
        new Wall(L, 4, 4, Direction.NORTH);
        new Wall(L, 3, 3, Direction.EAST);
        new Wall(L, 2, 3, Direction.EAST);
        new Wall(L, 2, 3, Direction.NORTH);
        new Wall(L, 3, 2, Direction.SOUTH);
        new Wall(L, 3, 3, Direction.SOUTH);

        Robot liam = new Robot(L, 2, 1, Direction.NORTH);

       while (true)
       {
            if (!liam.frontIsClear()) 
                liam.turnLeft();
                liam.move();
                liam.turnLeft();
                liam.turnLeft();
                liam.turnLeft();
                liam.move();
                liam.move();
                liam.turnLeft();
                liam.turnLeft();
                liam.turnLeft();
                liam.move();
                liam.move();
                liam.turnLeft();
                liam.turnLeft();
                liam.turnLeft();
                liam.move();
                liam.turnLeft();
                liam.move();  
       }
}
}
