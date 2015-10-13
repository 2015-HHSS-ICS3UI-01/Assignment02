
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City r = new City();

        //make robot
        Robot ironman = new Robot(r, 1, 1, Direction.EAST);

        //make items
        new Thing(r, 1, 2);
        new Thing(r, 1, 3);
        new Thing(r, 1, 4);
        new Thing(r, 1, 5);
        new Thing(r, 1, 6);
        new Thing(r, 1, 7);
        new Thing(r, 1, 8);
        new Thing(r, 1, 9);
        new Thing(r, 1, 10);
        new Thing(r, 1, 11);

        //make loop
        ironman.move();

        while (true) {
         if (ironman.countThingsInBackpack() < 7)
         {
         ironman.pickThing();
            ironman.move();
        }else{
       break;
         }
        
              
    }ironman.move();
        ironman.move();
        ironman.move();
}
}