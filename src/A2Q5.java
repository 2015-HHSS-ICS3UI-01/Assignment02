
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
 * @author moraj0721
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Making a City for the Robot to live in
        City Eadieville = new City();
        

        //Make a cap Robot to live in the City
        Robot Liam = new Robot(Eadieville, 0, 1, Direction.SOUTH);
        Liam.setLabel("L");

        //Make a Wall
        new Wall(Eadieville, 0, 1, Direction.WEST);
        new Wall(Eadieville, 1, 1, Direction.WEST);
        new Wall(Eadieville, 2, 1, Direction.WEST);
        new Wall(Eadieville, 3, 1, Direction.WEST);
        new Wall(Eadieville, 4, 1, Direction.WEST);
        new Wall(Eadieville, 5, 1, Direction.WEST);
        new Wall(Eadieville, 6, 1, Direction.WEST);
        new Wall(Eadieville, 7, 1, Direction.WEST);
        new Wall(Eadieville, 8, 1, Direction.WEST);
        new Wall(Eadieville, 9, 1, Direction.WEST);
        new Wall(Eadieville, 9, 1, Direction.SOUTH);
        new Wall(Eadieville, 9, 1, Direction.EAST);
        new Wall(Eadieville, 8, 2, Direction.SOUTH);
        new Wall(Eadieville, 8, 3, Direction.SOUTH);
        new Wall(Eadieville, 8, 4, Direction.SOUTH);
        new Wall(Eadieville, 8, 5, Direction.SOUTH);
        new Wall(Eadieville, 8, 6, Direction.SOUTH);
        new Wall(Eadieville, 8, 6, Direction.EAST);
        new Wall(Eadieville, 7, 6, Direction.EAST);
        new Wall(Eadieville, 7, 6, Direction.NORTH);
        new Wall(Eadieville, 7, 5, Direction.NORTH);
        new Wall(Eadieville, 7, 4, Direction.NORTH);
        new Wall(Eadieville, 7, 3, Direction.NORTH);
        new Wall(Eadieville, 7, 3, Direction.NORTH);
        new Wall(Eadieville, 7, 2, Direction.NORTH);
        new Wall(Eadieville, 6, 1, Direction.EAST);
        new Wall(Eadieville, 5, 1, Direction.EAST);
        new Wall(Eadieville, 4, 2, Direction.SOUTH);
        new Wall(Eadieville, 4, 3, Direction.SOUTH);
        new Wall(Eadieville, 4, 4, Direction.SOUTH);
        new Wall(Eadieville, 4, 4, Direction.EAST);
        new Wall(Eadieville, 4, 4, Direction.NORTH);
        new Wall(Eadieville, 4, 3, Direction.NORTH);
        new Wall(Eadieville, 4, 2, Direction.NORTH);
        new Wall(Eadieville, 3, 1, Direction.EAST);
        new Wall(Eadieville, 2, 2, Direction.SOUTH);
        new Wall(Eadieville, 2, 3, Direction.SOUTH);
        new Wall(Eadieville, 2, 4, Direction.SOUTH);
        new Wall(Eadieville, 2, 5, Direction.SOUTH);
        new Wall(Eadieville, 2, 5, Direction.EAST);
        new Wall(Eadieville, 1, 5, Direction.EAST);
        new Wall(Eadieville, 1, 5, Direction.NORTH);
        new Wall(Eadieville, 1, 4, Direction.NORTH);
        new Wall(Eadieville, 1, 3, Direction.NORTH);
        new Wall(Eadieville, 1, 2, Direction.NORTH);
        new Wall(Eadieville, 0, 1, Direction.EAST);

        //Make a new Thing
        new Thing(Eadieville, 1, 1);
        new Thing(Eadieville, 1, 2);
        new Thing(Eadieville, 1, 3);
        new Thing(Eadieville, 1, 4);
        new Thing(Eadieville, 2, 5);
        new Thing(Eadieville, 2, 3);
        new Thing(Eadieville, 2, 1);
        new Thing(Eadieville, 4, 1);
        new Thing(Eadieville, 4, 2);
        new Thing(Eadieville, 4, 3);
        new Thing(Eadieville, 7, 1);
        new Thing(Eadieville, 7, 2);
        new Thing(Eadieville, 7, 6);
        new Thing(Eadieville, 8, 2);
        new Thing(Eadieville, 8, 3);
        new Thing(Eadieville, 8, 5);


        Liam.move();


        while (Liam.frontIsClear()) {
            if (Liam.canPickThing()) {
                Liam.pickThing();
            }

            Liam.turnLeft();

            // clean driveway


            while (true) {
                if (Liam.frontIsClear()) {
                    Liam.move();
                }

                if (Liam.canPickThing()) {
                    Liam.pickThing();
                }

                if (!Liam.frontIsClear()) {
                    Liam.turnLeft();
                    Liam.turnLeft();


                    break;

                }

            }

            while (Liam.frontIsClear()) {
                Liam.move();

            }
            while (Liam.countThingsInBackpack() > 0) {
                Liam.putThing();
            }
            Liam.turnLeft();
            Liam.move();
        }
        
        //Make Tina
        Robot Tina = new Robot(Eadieville, 0, 1, Direction.SOUTH);
        Tina.setLabel("T");
        
        while (Tina.frontIsClear()) {
            Tina.move();
        
            while (Tina.canPickThing()) 
                Tina.pickThing();
            }
        
        
          
                
            
          
            
            
        
       
        
        
        
        
    }
}
