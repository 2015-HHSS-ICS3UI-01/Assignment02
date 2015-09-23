
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
 * @author mitrm7692
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a City
        City kw=new City();
        // Make a Wall
        new Wall(kw,2,0,Direction.SOUTH);
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,2,3,Direction.SOUTH);
        new Wall(kw,2,4,Direction.SOUTH);
        new Wall(kw,2,0,Direction.EAST);
        new Wall(kw,2,1,Direction.EAST);
        new Wall(kw,2,3,Direction.EAST);
        new Wall(kw,2,6,Direction.EAST);
        new Wall(kw,2,5,Direction.SOUTH);
        new Wall(kw,2,6,Direction.SOUTH);
        new Wall(kw,2,7,Direction.SOUTH);
        new Wall(kw,2,8,Direction.SOUTH);
        //Make a Thing
        new Thing(kw,2,8);
        // Make a Robot
        Robot Karel=new Robot (kw,2,0,Direction.EAST);
        if(!Karel.frontIsClear())
        {Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        }
        if(!Karel.frontIsClear())
        {Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        }
        if (Karel.frontIsClear())
        {
         Karel.move();
        }
        if(!Karel.frontIsClear())
        {Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        }
        while (Karel.frontIsClear())
        {
         Karel.move();
        }
        if(!Karel.frontIsClear())
        {Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.move();
        Karel.pickThing();
        Karel.move();
        }
        }
    }
