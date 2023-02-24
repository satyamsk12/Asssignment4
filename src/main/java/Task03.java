/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15164
 */
public class Task03 {
    
   int fib(int n)

{

       if (n <= 0) // base case

            return 0;

      else if (n == 1) // base case

             return 1;

       else

             return fib(n – 1) + fib(n – 2);

} 
    
    /**The time complexity of the 'fib' function is exponential, O(2^n), because each recursive call results in two additional recursive calls. This leads to a tree-like recursion structure where the number of nodes doubles with each level, resulting in a total of 2^n nodes in the tree
    
    * /
}

