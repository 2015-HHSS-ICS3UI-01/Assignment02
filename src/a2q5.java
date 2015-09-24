
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
 * @author lalim9800
 */
public class a2q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new City for robot 
        City a2q5 = new City();
        //make robots for city 
        Robot karl = new Robot(a2q5, 0, 2, Direction.SOUTH);
        Robot tina = new Robot(a2q5, 0, 2, Direction.SOUTH);


        //make walls left side of road 
        new Wall(a2q5, 1, 0, Direction.WEST);
        new Wall(a2q5, 2, 0, Direction.WEST);
        new Wall(a2q5, 3, 0, Direction.WEST);
        new Wall(a2q5, 4, 0, Direction.WEST);
        new Wall(a2q5, 5, 0, Direction.WEST);
        new Wall(a2q5, 6, 0, Direction.WEST);
        new Wall(a2q5, 7, 0, Direction.WEST);
        new Wall(a2q5, 8, 0, Direction.WEST);
        new Wall(a2q5, 9, 0, Direction.WEST);
        new Wall(a2q5, 0, 0, Direction.WEST);


        //make walls right side of road 
        new Wall(a2q5, 0, 1, Direction.EAST);
        new Wall(a2q5, 1, 1, Direction.EAST);
        new Wall(a2q5, 2, 1, Direction.EAST);
        new Wall(a2q5, 3, 1, Direction.EAST);
        new Wall(a2q5, 4, 1, Direction.EAST);
        new Wall(a2q5, 5, 1, Direction.EAST);
        new Wall(a2q5, 6, 1, Direction.EAST);
        new Wall(a2q5, 7, 1, Direction.EAST);
        new Wall(a2q5, 8, 1, Direction.EAST);
        new Wall(a2q5, 9, 1, Direction.EAST);

        new Wall(a2q5, 0, 2, Direction.EAST);

        new Wall(a2q5, 1, 3, Direction.NORTH);
        new Wall(a2q5, 1, 4, Direction.NORTH);
        new Wall(a2q5, 1, 5, Direction.NORTH);
        new Wall(a2q5, 1, 6, Direction.NORTH);

        new Wall(a2q5, 1, 6, Direction.EAST);
        new Wall(a2q5, 2, 6, Direction.EAST);

        new Wall(a2q5, 2, 3, Direction.SOUTH);
        new Wall(a2q5, 2, 4, Direction.SOUTH);
        new Wall(a2q5, 2, 5, Direction.SOUTH);
        new Wall(a2q5, 2, 6, Direction.SOUTH);

        new Wall(a2q5, 3, 2, Direction.EAST);


        new Wall(a2q5, 4, 3, Direction.NORTH);
        new Wall(a2q5, 4, 4, Direction.NORTH);
        new Wall(a2q5, 4, 5, Direction.NORTH);


        new Wall(a2q5, 4, 3, Direction.SOUTH);
        new Wall(a2q5, 4, 4, Direction.SOUTH);
        new Wall(a2q5, 4, 5, Direction.SOUTH);
        new Wall(a2q5, 4, 5, Direction.EAST);

        new Wall(a2q5, 5, 2, Direction.EAST);
        new Wall(a2q5, 6, 2, Direction.EAST);

        new Wall(a2q5, 7, 3, Direction.NORTH);
        new Wall(a2q5, 7, 4, Direction.NORTH);
        new Wall(a2q5, 7, 5, Direction.NORTH);
        new Wall(a2q5, 7, 6, Direction.NORTH);
        new Wall(a2q5, 7, 7, Direction.NORTH);

        new Wall(a2q5, 7, 7, Direction.EAST);
        new Wall(a2q5, 8, 7, Direction.EAST);

        new Wall(a2q5, 8, 3, Direction.SOUTH);
        new Wall(a2q5, 8, 4, Direction.SOUTH);
        new Wall(a2q5, 8, 5, Direction.SOUTH);
        new Wall(a2q5, 8, 6, Direction.SOUTH);
        new Wall(a2q5, 8, 7, Direction.SOUTH);

        new Wall(a2q5, 9, 2, Direction.EAST);
        new Wall(a2q5, 9, 2, Direction.SOUTH);



        new Thing(a2q5, 0, 1);
        new Thing(a2q5, 1, 0);
        new Thing(a2q5, 2, 0);
        new Thing(a2q5, 3, 0);
        new Thing(a2q5, 3, 1);
        new Thing(a2q5, 4, 0);
        new Thing(a2q5, 7, 0);
        new Thing(a2q5, 9, 0);
        new Thing(a2q5, 9, 1);
        new Thing(a2q5, 8, 1);
        new Thing(a2q5, 7, 1);
        new Thing(a2q5, 5, 1);
        new Thing(a2q5, 1, 2);
        new Thing(a2q5, 2, 2);
        new Thing(a2q5, 4, 2);
        new Thing(a2q5, 7, 2);
        new Thing(a2q5, 0, 3);
        new Thing(a2q5, 1, 3);
        new Thing(a2q5, 4, 3);
        new Thing(a2q5, 7, 3);
        new Thing(a2q5, 8, 3);
        new Thing(a2q5, 9, 3);
        new Thing(a2q5, 0, 4);
        new Thing(a2q5, 1, 4);
        new Thing(a2q5, 2, 4);
        new Thing(a2q5, 3, 4);
        new Thing(a2q5, 4, 4);
        new Thing(a2q5, 6, 4);
        new Thing(a2q5, 8, 4);
        new Thing(a2q5, 9, 4);
        new Thing(a2q5, 1, 5);
        new Thing(a2q5, 5, 5);
        new Thing(a2q5, 0, 6);
        new Thing(a2q5, 2, 6);
        new Thing(a2q5, 3, 6);
        new Thing(a2q5, 4, 6);
        new Thing(a2q5, 6, 6);
        new Thing(a2q5, 8, 6);
        new Thing(a2q5, 9, 6);
        new Thing(a2q5, 1, 7);
        new Thing(a2q5, 4, 7);
        new Thing(a2q5, 5, 7);
        new Thing(a2q5, 7, 7);
        // make robot clean drive way

        karl.move();
 
        while (karl.frontIsClear()) {
            karl.turnLeft();
            if (karl.frontIsClear()) {
                
                // clean driveway
                while (karl.frontIsClear()) {
                    karl.move();
                    if (karl.canPickThing()) {
                        karl.pickThing();

                    }
                }
                karl.turnLeft();
                karl.turnLeft();
                while (karl.frontIsClear()) {
                    karl.move();
                }
                while(karl.countThingsInBackpack()!=0){
                    karl.putThing();
                }
                karl.turnLeft();
            } else {
                karl.turnLeft();
                karl.turnLeft();
                karl.turnLeft();
            }
            karl.move();





        } 
       
      
         while(tina.frontIsClear()){
            tina.move();
            while (tina.canPickThing()){
                tina.pickThing();
        }
        } tina.putThing();

     
            
        
        

     
     


    }  
}
