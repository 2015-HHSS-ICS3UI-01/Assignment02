
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class a2q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City a2q3 = new City();
        Robot lali = new Robot(a2q3, 17, 11, Direction.SOUTH);
        //find direction

        while (lali.getDirection() != Direction.NORTH) {
            lali.turnLeft();





        }
         while(lali.getStreet()!=0){
             lali.move();
         } lali.turnLeft();
         
         while(lali.getAvenue()!=0){
             lali.move();
         }
        {

         
        }
    }
}
