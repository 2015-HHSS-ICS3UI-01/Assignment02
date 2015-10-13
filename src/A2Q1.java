
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
 * @author ramli8368
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City kw = new City();

        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);



        Robot commando = new Robot(kw, 1, 1, Direction.EAST);

        commando.move();


        while (commando.canPickThing()) {
            commando.pickThing();
        }
        commando.move();

        while (true) {
            if (commando.frontIsClear()) {
                commando.pickThing();
                commando.move();
            } 
            
            if (commando.countThingsInBackpack() == 7) {
                break;
            }

        }
    if(commando.frontIsClear())
        commando.move();
        commando.move();
        commando.move();
        
    
    }
}
