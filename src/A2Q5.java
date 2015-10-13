
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
 * @author agott2059
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // create city, robots,things and environment
        
        City thomas = new City();
        
        Robot tom = new Robot(thomas, 0,2, Direction.SOUTH);
        tom.setLabel("T");
        
        Robot jerry = new Robot(thomas, 0,2, Direction.SOUTH);
        jerry.setLabel("J");
        
         new Wall(thomas, 0, 0, Direction.WEST);
         new Wall(thomas, 1, 0, Direction.WEST);
         new Wall(thomas, 2, 0, Direction.WEST);
         new Wall(thomas, 3, 0, Direction.WEST);
         new Wall(thomas, 4, 0, Direction.WEST);
         new Wall(thomas, 5, 0, Direction.WEST);
         new Wall(thomas, 6, 0, Direction.WEST);
         new Wall(thomas, 7, 0, Direction.WEST);
         new Wall(thomas, 8, 0, Direction.WEST);
         new Wall(thomas, 9, 0, Direction.WEST);
         new Wall(thomas, 0, 1, Direction.EAST);
         new Wall(thomas, 1, 1, Direction.EAST);
         new Wall(thomas, 2, 1, Direction.EAST);
         new Wall(thomas, 3, 1, Direction.EAST);
         new Wall(thomas, 4, 1, Direction.EAST);
         new Wall(thomas, 5, 1, Direction.EAST);
         new Wall(thomas, 6, 1, Direction.EAST);
         new Wall(thomas, 7, 1, Direction.EAST);
         new Wall(thomas, 8, 1, Direction.EAST);
         new Wall(thomas, 9, 1, Direction.EAST);
         new Wall(thomas, 0, 2, Direction.EAST);
         new Wall(thomas, 1, 3, Direction.NORTH);
         new Wall(thomas, 1, 4, Direction.NORTH);
         new Wall(thomas, 1, 5, Direction.NORTH);
         new Wall(thomas, 1, 6, Direction.NORTH);
         new Wall(thomas, 1, 6, Direction.EAST);
         new Wall(thomas, 2, 6, Direction.EAST);
         new Wall(thomas, 2, 6, Direction.SOUTH);
         new Wall(thomas, 2, 5, Direction.SOUTH);
         new Wall(thomas, 2, 4, Direction.SOUTH);
         new Wall(thomas, 2, 3, Direction.SOUTH);
         new Wall(thomas, 3, 2, Direction.EAST);
         new Wall(thomas, 4, 3, Direction.NORTH);
         new Wall(thomas, 4, 4, Direction.NORTH);
         new Wall(thomas, 4, 5, Direction.NORTH);
         new Wall(thomas, 4, 5, Direction.EAST);
         new Wall(thomas, 4, 5, Direction.SOUTH);
         new Wall(thomas, 4, 3, Direction.SOUTH);
         new Wall(thomas, 4, 4, Direction.SOUTH);
         new Wall(thomas, 5, 2, Direction.EAST);
         new Wall(thomas, 6, 2, Direction.EAST);
         new Wall(thomas, 7, 3, Direction.NORTH);
         new Wall(thomas, 7, 4, Direction.NORTH);
         new Wall(thomas, 7, 5, Direction.NORTH);
         new Wall(thomas, 7, 6, Direction.NORTH);
         new Wall(thomas, 7, 7, Direction.NORTH);
         new Wall(thomas, 7, 7, Direction.EAST);
         new Wall(thomas, 8, 7, Direction.EAST);
         new Wall(thomas, 8, 7, Direction.SOUTH);
         new Wall(thomas, 8, 6, Direction.SOUTH);
         new Wall(thomas, 8, 5, Direction.SOUTH);
         new Wall(thomas, 8, 4, Direction.SOUTH);
         new Wall(thomas, 8, 3, Direction.SOUTH);
         new Wall(thomas, 9, 2, Direction.EAST);
         new Wall(thomas, 9, 2, Direction.SOUTH);
                 
         new Thing(thomas,1,2);
         new Thing(thomas,2,2);
         new Thing(thomas,1,3);
         new Thing(thomas,1,4);
         new Thing(thomas,1,5);
         new Thing(thomas,2,4);
         new Thing(thomas,2,6);
         new Thing(thomas,4,2);
         new Thing(thomas,4,3);
         new Thing(thomas,4,4);
         new Thing(thomas,7,2);
         new Thing(thomas,7,3);
         new Thing(thomas,7,7);
         new Thing(thomas,8,3);
         new Thing(thomas,8,4);
         new Thing(thomas,8,6);
         new Thing(thomas,1,2);
         new Thing(thomas,1,2);
         new Thing(thomas,1,2);

        tom.move();
        tom.turnLeft();

        //loop program until end of sidewalk reached
        while (true) {
            //check if front is clear and pick things along the way
            if (tom.frontIsClear()) {
                tom.move();
                if (tom.canPickThing()) {
                    tom.pickThing();
                }
                //if the front isn't clear, end of driveway reached, turn around, while picking things on intersection
            } else {
                if (tom.canPickThing()) {
                    tom.pickThing();
                }
                tom.turnLeft();
                tom.turnLeft();
                //keep moving until sidewalk reached
                while (tom.frontIsClear()) {
                    tom.move();
                }
                //drop things (snow) until backpack empty
                while ((tom.countThingsInBackpack() != 0)) {
                    tom.putThing();
                }
                //proceed to next driveway
                tom.turnLeft();
                //check if end of sidewalk is reached
                if (tom.frontIsClear()) {
                    tom.move();
                } else {
                    //end loop if end of sidewalk reached
                    break;
                }
                tom.turnLeft();
                //pick things and move along driveway(loop until end of driveway reached)
                while (tom.frontIsClear()) {
                    tom.move();
                    if (tom.canPickThing()) {
                        tom.pickThing();
                    }
                }
                //go back to sidewalk
                tom.turnLeft();
                tom.turnLeft();
                while (tom.frontIsClear()) {
                    tom.move();
                }
                //empty snow
                while ((tom.countThingsInBackpack() != 0)) {
                    tom.putThing();
                }
                //proceed to next driveway
                tom.turnLeft();
                tom.move();
                tom.turnLeft();

            }

        }
//jerry goes along sidewalk picking up rest of snow
        while (jerry.frontIsClear()) {
            jerry.move();
            while (jerry.canPickThing()) {
                jerry.pickThing();
            }
        }

    }
}
         

             

             



    


