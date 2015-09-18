
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Make City
        City A2Q4 = new City();

        //Make Robot
        Robot karel = new Robot(A2Q4, 0, 1, Direction.EAST);

        //Make Walls
        new Wall(A2Q4, 1, 1, Direction.EAST);
        new Wall(A2Q4, 1, 1, Direction.SOUTH);
        new Wall(A2Q4, 1, 1, Direction.WEST);
        new Wall(A2Q4, 1, 1, Direction.NORTH);

        new Wall(A2Q4, 4, 1, Direction.EAST);
        new Wall(A2Q4, 4, 1, Direction.SOUTH);
        new Wall(A2Q4, 4, 1, Direction.WEST);
        new Wall(A2Q4, 4, 1, Direction.NORTH);

        new Wall(A2Q4, 4, 4, Direction.EAST);
        new Wall(A2Q4, 4, 4, Direction.SOUTH);
        new Wall(A2Q4, 4, 4, Direction.WEST);
        new Wall(A2Q4, 4, 4, Direction.NORTH);

        new Wall(A2Q4, 1, 4, Direction.EAST);
        new Wall(A2Q4, 1, 4, Direction.SOUTH);
        new Wall(A2Q4, 1, 4, Direction.WEST);
        new Wall(A2Q4, 1, 4, Direction.NORTH);

        new Wall(A2Q4, 3, 2, Direction.WEST);
        new Wall(A2Q4, 2, 2, Direction.WEST);

        new Wall(A2Q4, 2, 2, Direction.NORTH);
        new Wall(A2Q4, 2, 3, Direction.NORTH);

        new Wall(A2Q4, 2, 3, Direction.EAST);
        new Wall(A2Q4, 3, 3, Direction.EAST);

        new Wall(A2Q4, 3, 3, Direction.SOUTH);
        new Wall(A2Q4, 3, 2, Direction.SOUTH);

        while (true) {
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            if (karel.frontIsClear()) {

                karel.move();
            } else if (!karel.frontIsClear()) {
                karel.turnLeft();
                if( karel.frontIsClear() ){
                    karel.move();
                }else{
                    karel.turnLeft();
                }

            }
        }
        
































    }
}
