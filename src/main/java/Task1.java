/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Satyam Kumar
 * Assignment 4
 */
public class Task1 {
   
 
    
        void countDown(int num)

 {

      if (num == 0) // test

                  System.out.println("Blastoff!");

       else {

                  System.out.println("...");

                    countDown(num-1); // recursive call

             } 

}
     

/**
 If we call "CountDown" Function with the argument5 the output will be:
 * 6 Blastoff!
 * 
 To modify the function to print only the even numbers, we can add a conditional statement to check if 'num' is even before printing it. 

* Modify COde
       
      
*/



void countDownEven(int num) {
    if (num == 0) {
        System.out.println("Blastoff!");
    } else {
        if (num % 2 == 0) {
            System.out.println(num);
        }
        countDownEven(num - 1);
    }
}


}