[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=21590303)
# Programming Languages

## Programming Problems for HW04

### Setup

No setup needed for this code because you are only writing Java and Python code,
and won't need any unit tests. There is **no autograding**.

### Java Concurency

Write a short Java program that uses threads in the following way. There will be one shared 
array that is initialized at the start of the program to hold the integers from 0 to 99. 
There is also a shared global integer index that starts at 0. You will start two identical 
threads, one named A and one named B. Each one will use the `synchronized` keyword to control 
access to the array and the index. Each thread loops, and the synchronized portion checks 
if the array index is still in bounds. If it is in bounds, the thread prints its name followed 
by the array value, then sets the array value to -1, and finally increments the index. 
Afterward, the thread puts itself to sleep with `this.sleep(1)`. Once the index is out of bounds, 
the loop/thread exits/terminates. The `main` method should use the `join()` method of the threads 
to wait for them to finish. Then, at the end of the `main` method, use a loop to compute the sum 
of the array values and print that sum to the console (should be -100). You can define your thread 
class by extending `Thread` with a static class defined inside of `Concurrency.java`.
 
It is important to note that concurrent programs often exhibit non-deterministic behavior, and
that should be the case with this program. However, that means that there is **no autograding** for
this coding problem. Example possible output is below, but human inspection will determine
whether your code is actually correct.

```
A:0
A:1
B:2
B:3
A:4
... and so on ...
B:97
A:98
A:99
Sum = -100
```

Note that it is entirely possible for one thread to completely monopolize the array on a particular run, but if you code this right, then you should see the threads taking turns at least sometimes.

### Python Concurrency

Write a Python program that repeatedly takes console input from the user.
If the user provides an input of `quit` then the program exits. For any
other input, the program spawns a new `threading.Thread` that will repeat
the given input as output to the console forever, with a 2 second pause
between each output. Use `time.sleep` for this pause. The program will 
continue to accept user input, and therefore there could be multiple
threads periodically outputting their given string to the console.

Add code to the provided file `concurrency.py`.

There is **no autograding** for this coding problem. 
Human inspection will determine whether your code 
is actually correct.
