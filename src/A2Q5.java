
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
 * @author dawsr2694
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Make City
        City A2Q5 = new City();

        //MAKE WALLS

        //Left side of road
        new Wall(A2Q5, 0, 0, Direction.WEST);
        new Wall(A2Q5, 1, 0, Direction.WEST);
        new Wall(A2Q5, 2, 0, Direction.WEST);
        new Wall(A2Q5, 3, 0, Direction.WEST);
        new Wall(A2Q5, 4, 0, Direction.WEST);
        new Wall(A2Q5, 5, 0, Direction.WEST);
        new Wall(A2Q5, 6, 0, Direction.WEST);
        new Wall(A2Q5, 7, 0, Direction.WEST);
        new Wall(A2Q5, 8, 0, Direction.WEST);
        new Wall(A2Q5, 9, 0, Direction.WEST);

        //Right side of road
        new Wall(A2Q5, 0, 1, Direction.EAST);
        new Wall(A2Q5, 1, 1, Direction.EAST);
        new Wall(A2Q5, 2, 1, Direction.EAST);
        new Wall(A2Q5, 3, 1, Direction.EAST);
        new Wall(A2Q5, 4, 1, Direction.EAST);
        new Wall(A2Q5, 5, 1, Direction.EAST);
        new Wall(A2Q5, 6, 1, Direction.EAST);
        new Wall(A2Q5, 7, 1, Direction.EAST);
        new Wall(A2Q5, 8, 1, Direction.EAST);
        new Wall(A2Q5, 9, 1, Direction.EAST);

        //Right side of sidewalk
        new Wall(A2Q5, 0, 2, Direction.EAST);
        new Wall(A2Q5, 3, 2, Direction.EAST);
        new Wall(A2Q5, 5, 2, Direction.EAST);
        new Wall(A2Q5, 6, 2, Direction.EAST);
        new Wall(A2Q5, 9, 2, Direction.EAST);

        //End of sidewalk
        new Wall(A2Q5, 9, 2, Direction.SOUTH);

        //Driveway 1 (left side)
        new Wall(A2Q5, 1, 3, Direction.NORTH);
        new Wall(A2Q5, 1, 4, Direction.NORTH);
        new Wall(A2Q5, 1, 5, Direction.NORTH);
        new Wall(A2Q5, 1, 6, Direction.NORTH);

        //Driveway 1 (top)
        new Wall(A2Q5, 1, 6, Direction.EAST);
        new Wall(A2Q5, 2, 6, Direction.EAST);

        //Driveway 1 (right side)
        new Wall(A2Q5, 2, 3, Direction.SOUTH);
        new Wall(A2Q5, 2, 4, Direction.SOUTH);
        new Wall(A2Q5, 2, 5, Direction.SOUTH);
        new Wall(A2Q5, 2, 6, Direction.SOUTH);

        //Driveway 2 (left side)
        new Wall(A2Q5, 4, 3, Direction.NORTH);
        new Wall(A2Q5, 4, 4, Direction.NORTH);
        new Wall(A2Q5, 4, 5, Direction.NORTH);

        //Driveway 2 (top)
        new Wall(A2Q5, 4, 5, Direction.EAST);

        //Driveway 2 (right side)
        new Wall(A2Q5, 4, 3, Direction.SOUTH);
        new Wall(A2Q5, 4, 4, Direction.SOUTH);
        new Wall(A2Q5, 4, 5, Direction.SOUTH);

        //Driveway 3 (left side)
        new Wall(A2Q5, 7, 3, Direction.NORTH);
        new Wall(A2Q5, 7, 4, Direction.NORTH);
        new Wall(A2Q5, 7, 5, Direction.NORTH);
        new Wall(A2Q5, 7, 6, Direction.NORTH);
        new Wall(A2Q5, 7, 7, Direction.NORTH);

        //Driveway 3 (top)
        new Wall(A2Q5, 7, 7, Direction.EAST);
        new Wall(A2Q5, 8, 7, Direction.EAST);

        //Driveway 3 (right side)
        new Wall(A2Q5, 8, 3, Direction.SOUTH);
        new Wall(A2Q5, 8, 4, Direction.SOUTH);
        new Wall(A2Q5, 8, 5, Direction.SOUTH);
        new Wall(A2Q5, 8, 6, Direction.SOUTH);
        new Wall(A2Q5, 8, 7, Direction.SOUTH);

        //MAKE THINGS

        //Things for road
        new Thing(A2Q5, 0, 1);

        new Thing(A2Q5, 1, 0);
        new Thing(A2Q5, 2, 0);
        new Thing(A2Q5, 3, 0);
        new Thing(A2Q5, 3, 1);
        new Thing(A2Q5, 4, 0);

        new Thing(A2Q5, 5, 1);

        new Thing(A2Q5, 7, 0);
        new Thing(A2Q5, 7, 1);
        new Thing(A2Q5, 8, 1);
        new Thing(A2Q5, 9, 0);
        new Thing(A2Q5, 9, 1);

        //Things for sidewalk
        new Thing(A2Q5, 1, 2);
        new Thing(A2Q5, 2, 2);

        new Thing(A2Q5, 4, 2);

        new Thing(A2Q5, 7, 2);

        //Things for driveway 1
        new Thing(A2Q5, 1, 3);
        new Thing(A2Q5, 1, 4);
        new Thing(A2Q5, 1, 5);

        new Thing(A2Q5, 2, 2);
        new Thing(A2Q5, 2, 4);
        new Thing(A2Q5, 2, 6);

        //Things for driveway 2
        new Thing(A2Q5, 4, 3);
        new Thing(A2Q5, 4, 4);

        //Things for driveway 3
        new Thing(A2Q5, 7, 3);
        new Thing(A2Q5, 7, 7);

        new Thing(A2Q5, 8, 3);
        new Thing(A2Q5, 8, 4);
        new Thing(A2Q5, 8, 6);

        //Things miscellaneous
        new Thing(A2Q5, 0, 3);
        new Thing(A2Q5, 0, 4);
        new Thing(A2Q5, 0, 6);

        new Thing(A2Q5, 1, 7);

        //MAKE ROBOTS
        Robot karel = new Robot(A2Q5, 6, 2, Direction.SOUTH);
        Robot Tina = new Robot(A2Q5, 0, 2, Direction.SOUTH);

        //MAKE ROBOTS CLEAN SNOW
        karel.turnLeft();
        if (!karel.frontIsClear()) {
            karel.turnLeft(); //Right turn
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
        }







    }
}
