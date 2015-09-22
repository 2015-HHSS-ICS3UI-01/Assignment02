
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //City for Robot to live in
        City kw = new City();

        //New walls
        new Wall(kw, 0, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 6, 1, Direction.WEST);
        new Wall(kw, 7, 1, Direction.WEST);
        new Wall(kw, 8, 1, Direction.WEST);
        new Wall(kw, 9, 1, Direction.WEST);
        new Wall(kw, 0, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 6, 2, Direction.EAST);
        new Wall(kw, 7, 2, Direction.EAST);
        new Wall(kw, 8, 2, Direction.EAST);
        new Wall(kw, 9, 2, Direction.EAST);
        new Wall(kw, 0, 3, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.NORTH);
        new Wall(kw, 1, 7, Direction.NORTH);
        new Wall(kw, 1, 7, Direction.EAST);
        new Wall(kw, 2, 7, Direction.EAST);
        new Wall(kw, 2, 7, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.SOUTH);
        new Wall(kw, 4, 6, Direction.NORTH);
        new Wall(kw, 4, 6, Direction.EAST);
        new Wall(kw, 4, 6, Direction.SOUTH);
        new Wall(kw, 5, 3, Direction.EAST);
        new Wall(kw, 6, 3, Direction.EAST);
        new Wall(kw, 7, 4, Direction.NORTH);
        new Wall(kw, 7, 5, Direction.NORTH);
        new Wall(kw, 7, 6, Direction.NORTH);
        new Wall(kw, 7, 7, Direction.NORTH);
        new Wall(kw, 7, 8, Direction.NORTH);
        new Wall(kw, 7, 8, Direction.EAST);
        new Wall(kw, 8, 8, Direction.EAST);
        new Wall(kw, 8, 8, Direction.SOUTH);
        new Wall(kw, 8, 7, Direction.SOUTH);
        new Wall(kw, 8, 6, Direction.SOUTH);
        new Wall(kw, 8, 5, Direction.SOUTH);
        new Wall(kw, 8, 4, Direction.SOUTH);
        new Wall(kw, 9, 3, Direction.EAST);
        new Wall(kw, 9, 3, Direction.SOUTH);

        //Things(snow) for robot to pick up
        new Thing(kw, 0, 2);
        new Thing(kw, 1, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 4, 1);
        new Thing(kw, 5, 2);
        new Thing(kw, 7, 1);
        new Thing(kw, 7, 2);
        new Thing(kw, 8, 2);
        new Thing(kw, 9, 1);
        new Thing(kw, 9, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 2, 7);
        new Thing(kw, 2, 5);
        new Thing(kw, 2, 3);
        new Thing(kw, 4, 3);
        new Thing(kw, 4, 4);
        new Thing(kw, 4, 5);
        new Thing(kw, 7, 3);
        new Thing(kw, 7, 4);
        new Thing(kw, 7, 8);
        new Thing(kw, 8, 7);
        new Thing(kw, 8, 5);
        new Thing(kw, 8, 4);
        new Thing(kw, 0, 4);
        new Thing(kw, 0, 5);
        new Thing(kw, 0, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 3, 5);
        new Thing(kw, 3, 7);
        new Thing(kw, 4, 7);
        new Thing(kw, 4, 8);
        new Thing(kw, 5, 6);
        new Thing(kw, 5, 8);
        new Thing(kw, 6, 5);
        new Thing(kw, 6, 7);
        new Thing(kw, 9, 4);
        new Thing(kw, 9, 5);
        new Thing(kw, 9, 7);

        //Robots lo live in City
        Robot karel = new Robot(kw, 0, 3, Direction.SOUTH);
        Robot tina = new Robot(kw, 0, 3, Direction.SOUTH);

        //karel starts to shovel snow
        while (karel.frontIsClear()) {
           //karel picks up things(snow) only from driveway 
            while (karel.isBesideThing(IPredicate.aWall)) {
                if (karel.canPickThing()) {
                    karel.pickThing();
                }
                //karel moves if front is clear
                if (karel.frontIsClear()) {
                    karel.move();
                }
                //if he can't then he turns around
                else {
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                }
            }
            //karel turns left if he isnt beside a wall
            if (!karel.isBesideThing(IPredicate.aWall)) {
                karel.turnLeft();
                karel.move();
            }
        }
        //karel puts thing(snow) at end
        karel.putThing();

        //tina moves if front is clear
        while (tina.frontIsClear()) {
            tina.move();
            //tina picks up things(snow) from side walk
            if (tina.canPickThing()) {
                tina.pickThing();
            }
            //tina drops off things(snow) if front isn't clear
            if (!tina.frontIsClear()) {
                tina.putThing();
            }
        }

    }
}
