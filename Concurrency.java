/**
 * Write a short Java program that uses threads in the following way. There will be one shared 
 * array that is initialized at the start of the program to hold the integers from 0 to 99. 
 * There is also a shared global integer index that starts at 0. You will start two identical 
 * threads, one named A and one named B. Each one will use the synchronized keyword to control 
 * access to the array and the index. Each thread loops, and the synchronized portion checks 
 * if the array index is still in bounds. If it is in bounds, the thread prints its name followed 
 * by the array value, then sets the array value to -1, and finally increments the index. 
 * Afterward, the thread puts itself to sleep with this.sleep(1). Once the index is out of bounds, 
 * the loop/thread exits/terminates. The main method should use the join() method of the threads 
 * to wait for them to finish. Then, at the end of the main method, use a loop to compute the sum 
 * of the array values and print that sum to the console (should be -100). You can define your thread 
 * class by extending Thread with a static class defined inside of the file below.
 * 
 * It is important to note that concurrent programs often exhibit non-deterministic behavior, and
 * that should be the case with this program. However, that means that there is no autograding for
 * this coding problem. Example possible output is in the README, but human inspection will determine
 * whether your code is actually correct.
 */

public class Concurrency  {

    // TODO

}