This was a project for teaching a student about recursive methods.

There are two Main.java files. In the one inside the main package are recursive methods that calculate the factorial of a number and the nth term of the fibonacci sequence.

In this file, the main method runs a program that let's you play the Hanoi Tower game. You have 3 options and running the program explains them.

In this Hanoi Tower game, are 3 columns that are represented by the indexes 0, 1 and 2. It's implemented with arrays by student request.

To move a disk from one column to another, you must do the following:

1. Choose the option 2
2. Type the column from which you want to move (initial) 
3. Type the column where you want to put it in (final).

In case the initial column is empty it throws an exception. The same ocurrs if the final column has on top a disk smaller than the disk you are intending to move.


In the other Main class, there is a recursive method that solves the Hanoi Tower game printing in each step the movement that was made so it's easy to follow the movements.

This project took about 1:30 hs and was not intended to make it bigger, but just to explain how recursive methods work.