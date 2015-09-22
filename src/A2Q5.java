/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author moore3607
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //made a new grid in which to place things on
       City kw = new City();
       //made two new robots in which to command
       Robot beep = new Robot(kw,3,3,Direction.SOUTH);
       Robot tina = new Robot(kw,3,3,Direction.SOUTH);
       
       //made walls
       
       new Wall(kw,3,2,Direction.EAST);
       new Wall(kw,4,2,Direction.EAST);
       new Wall(kw,5,2,Direction.EAST);
       new Wall(kw,6,2,Direction.EAST);
       new Wall(kw,7,2,Direction.EAST);
       new Wall(kw,8,2,Direction.EAST);
       new Wall(kw,9,2,Direction.EAST);
       new Wall(kw,10,2,Direction.EAST);
       new Wall(kw,11,2,Direction.EAST);
       new Wall(kw,12,2,Direction.EAST);
       new Wall(kw,3,1,Direction.WEST);
       new Wall(kw,4,1,Direction.WEST);
       new Wall(kw,5,1,Direction.WEST);
       new Wall(kw,6,1,Direction.WEST);
       new Wall(kw,7,1,Direction.WEST);
       new Wall(kw,8,1,Direction.WEST);
       new Wall(kw,9,1,Direction.WEST);
       new Wall(kw,10,1,Direction.WEST);
       new Wall(kw,11,1,Direction.WEST);
       new Wall(kw,12,1,Direction.WEST);
       new Wall(kw,3,3,Direction.EAST);
       new Wall(kw,4,4,Direction.NORTH);
       new Wall(kw,4,5,Direction.NORTH);
       new Wall(kw,4,6,Direction.NORTH);
       new Wall(kw,4,7,Direction.NORTH);
       new Wall(kw,4,7,Direction.EAST);
       new Wall(kw,5,4,Direction.SOUTH);
       new Wall(kw,5,5,Direction.SOUTH);
       new Wall(kw,5,6,Direction.SOUTH);
       new Wall(kw,5,7,Direction.SOUTH);
       new Wall(kw,5,7,Direction.EAST);
       new Wall(kw,6,3,Direction.EAST);
       new Wall(kw,7,4,Direction.SOUTH);
       new Wall(kw,7,4,Direction.NORTH);
       new Wall(kw,7,5,Direction.NORTH);
       new Wall(kw,7,5,Direction.SOUTH);
       new Wall(kw,7,6,Direction.NORTH);
       new Wall(kw,7,6,Direction.SOUTH);
       new Wall(kw,7,6,Direction.EAST);
       new Wall(kw,8,3,Direction.EAST);
       new Wall(kw,9,3,Direction.EAST);
       new Wall(kw,10,4,Direction.NORTH);
       new Wall(kw,10,5,Direction.NORTH);
       new Wall(kw,10,6,Direction.NORTH);        
       new Wall(kw,10,7,Direction.NORTH); 
       new Wall(kw,10,8,Direction.NORTH); 
       new Wall(kw,10,8,Direction.EAST); 
       new Wall(kw,11,4,Direction.SOUTH);
       new Wall(kw,11,5,Direction.SOUTH);
       new Wall(kw,11,6,Direction.SOUTH);
       new Wall(kw,11,7,Direction.SOUTH);
       new Wall(kw,11,8,Direction.SOUTH);
       new Wall(kw,11,8,Direction.EAST);
       new Wall(kw,12,3,Direction.EAST);
       new Wall(kw,12,3,Direction.SOUTH);
       
       
       //added things
       new Thing(kw,3,2);
       new Thing(kw,4,1);
       new Thing(kw,5,1);
       new Thing(kw,6,1);
       new Thing(kw,7,1);
       new Thing(kw,6,2);
       new Thing(kw,8,2);
       new Thing(kw,10,2);
       new Thing(kw,10,1);
       new Thing(kw,11,2);
       new Thing(kw,12,2);
       new Thing(kw,12,1);
       new Thing(kw,4,3);
       new Thing(kw,5,3);
       new Thing(kw,7,3);
       new Thing(kw,10,3);
       new Thing(kw,3,4);
       new Thing(kw,4,4);
       new Thing(kw,7,4);
       new Thing(kw,10,4);
       new Thing(kw,11,4);
       new Thing(kw,12,4);
       new Thing(kw,3,5);
       new Thing(kw,4,5);
       new Thing(kw,5,5);
       new Thing(kw,6,5);
       new Thing(kw,7,5);
       new Thing(kw,9,5);
       new Thing(kw,11,5);
       new Thing(kw,12,5);
       new Thing(kw,4,6);
       new Thing(kw,8,6);
       new Thing(kw,3,7);
       new Thing(kw,5,7);
       new Thing(kw,6,7);
       new Thing(kw,7,7);
       new Thing(kw,9,7);
       new Thing(kw,11,7);
       new Thing(kw,12,7);
       new Thing(kw,4,8);
       new Thing(kw,7,8);
       new Thing(kw,8,8);
       new Thing(kw,10,8);
       
       while(true){
           //if beep is on the given location, he does the command below
           if(beep.getStreet()==4){
               if(beep.getAvenue()==3){
                   beep.turnLeft();
               }
           }
         if(beep.getStreet()==7){
             if(beep.getAvenue()==3){
                 beep.turnLeft();
             }
         }  
         if(beep.getStreet()==10){
             if(beep.getAvenue()==3){
                 beep.turnLeft();
             }
         }
         if(beep.canPickThing()){
               beep.pickThing();}
         
         if(beep.getStreet()==5){
             if(beep.getAvenue()==3){
                 while(beep.countThingsInBackpack()>0){
                 beep.putThing();}
             }
         }
         if(beep.getStreet()==7){
             if(beep.getAvenue()==3){
                 while(beep.countThingsInBackpack()>0){
                 beep.putThing();}
                 
             }
         }
         if(beep.getStreet()==11){
             if(beep.getAvenue()==3){
                 while(beep.countThingsInBackpack()>0){
                 beep.putThing();}
                
             }
         }
         if(beep.getStreet()==12){
             //breaks the program out of the while loop
             break;
         }  
           
        
        //if beep is facing the given direction, he does the following command
        if(beep.getDirection()==Direction.WEST){
               if(!beep.frontIsClear()){
                   beep.turnLeft();
               }
                   
           }
        //if beep's front is not clear, he executes the command below
        if(!beep.frontIsClear()){
            
            
            beep.turnLeft();
                beep.turnLeft();
                beep.turnLeft();}
        
//if beep's front is clear, he executes the command below
           if(beep.frontIsClear()){
               beep.move();}
           
           
           
           
       }
       //tina will execute this command no matter what
       while(true){
           tina.move();
           
           //if tina can pick up a thing (is standing on it), she will execute the command below
           while(tina.canPickThing()){
               tina.pickThing();
           }
           //if tina is standing on this spot, she will execute the following command
           if(tina.getStreet()==12){
               while(tina.countThingsInBackpack()>0){
                 tina.putThing();}
               
               //this will break the program out of the while loop
               break;
           }
       }
       
    }
}
