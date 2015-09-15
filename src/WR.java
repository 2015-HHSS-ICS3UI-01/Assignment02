//QUESTION 1
//The robot is at intersection (1, 5) facing North. There is a wall immediately in front of it. 




//a. this.getAvenue() > 0   False
//b. this.getAvenue() <= 5  True
//c. this.getStreet() != 1  False
//d. !(this.getStreet() == 1) False 
//e. this.frontIsClear()  True
//f. !this.frontIsClear()  False
//g. !!this.frontIsClear()  True
//h. this.frontIsClear() == False

//QUESTION 2
//No they do not behave the same.

//if(karel.canPickThing())                                    
//{                                                        
//    karel.turnRight();                               
//} else {                                                   
//    karel.turnLeft();                                
//}                                                          

//In the situation of if statement 1, if karel.canpickthing is true, karel will
//turn riight. If false, karel will turn left.

//If Statement 2
//
//if(!karel.canPickThing())
//{                                                                          
//    karel.turnLeft();
//} else {                                                                                                                          
//    karel.turnRight();
//}     

//In the situation of if statement 2, if karel.canpickthing is true, karel will 
//turn left. if false, karel will turn right

//therefore, they behave differently whether or not its true or false.