import threading
import time
import os

"""
    Write a Python program that repeatedly takes console input from the user.
    If the user provides an input of "quit" then the program exits. For any
    other input, the program spawns a new threading.Thread that will repeat
    the given input as output to the console forever, with a 2 second pause
    between each output. Use time.sleep for this pause. The program will 
    continue to accept user input, and therefore there could be multiple
    threads periodically outputting their given string to the console.

    There is no autograding for this coding problem. 
    Human inspection will determine whether your code 
    is actually correct.
"""

PAUSE_BETWEEN = 2 # 2 seconds

# TODO: Define thread function here

if __name__ == "__main__":
    quit = False
    while not quit:
        value = input()
        if value == "quit":
            quit = True

        # TODO: Launch threads in this loop

    # Exits main thread and any other threads that are running
    os._exit(0)