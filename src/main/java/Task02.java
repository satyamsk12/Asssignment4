/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Task02 {
    int gcd(int x, int y) {

      if (x % y == 0) { //base case

             return y;

             else{

             return gcd(y, x % y);
    
}
    
    
    /**
 If we call the function 'gcd' with the arguments 24 and 18, the output will be 6.

To modify the function to find the gcd using subtraction, we can replace the line 'return gcd(y, x % y);' with the following code:

    
    
 */
    
    
    while (y != 0) {
    int temp = y;
    y = x - y;
    x = temp;
}
return x;
   

/**
 * Homework:

1. Here's a recursive function that prints "Hello World" n times:


void helloWorld(int n) {
    if (n > 0) {
        System.out.println("Hello World");
        helloWorld(n - 1);
    }
}
 2. Here's a recursive function that returns the sum of all multiples of 7 between n1 and n2:


int sumMultiplesOf7(int n1, int n2) {
    if (n1 > n2) {
        return 0;
    } else if (n1 % 7 == 0) {
        return n1 + sumMultiplesOf7(n1 + 7, n2);
    } else {
        return sumMultiplesOf7(n1 + (7 - n1 % 7), n2);
    }
}

  Here's a recursive function that implements the binary search algorithm:

int binarySearch(int[] arr, int left, int right, int target) {
if (left > right) {
return -1;
}
int mid = left + (right - left) / 2;
if (arr[mid] == target) {
return mid;
} else if (arr[mid] < target) {
return binarySearch(arr, mid + 1, right, target);
} else {
return binarySearch(arr, left, mid - 1, target);
}
}



 */
    
