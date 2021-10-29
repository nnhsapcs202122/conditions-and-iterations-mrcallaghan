Unit 3: Conditions and Iterations
============

*Standard 4 - Understand condition and iteration structures and apply to programs*

Your Game of Life Lab Requirements
----

!!! add your requirements here...



Game of Life Lab
----

# Introduction

The goal of this lab is to apply your understanding of decision and loop structures to implement a complex algorithm within the context of an unfamiliar and significant software framework (GridWorld). 

# Requirements

Write a program that plays[ Conway’s Game of Life](http://en.wikipedia.org/wiki/Conway%27s_Game_of_Life). Conway’s Game of Life is a cellular automaton ([example web app](https://www.compadre.org/osp/EJSS/3577/12.htm)). From Wikipedia:

*The universe of the Game of Life is an infinite two-dimensional orthogonal grid of square cells, each of which is in one of two possible states, alive or dead. Every cell interacts with its eight neighbours, which are the cells that are horizontally, vertically, or diagonally adjacent. At each step in time, the following transitions occur:*

* *Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.*

* *Any live cell with two or three live neighbours lives on to the next generation.*

* *Any live cell with more than three live neighbours dies, as if by overcrowding.*

* *Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.*

* *The initial pattern constitutes the seed of the system. The first generation is created by applying the above rules simultaneously to every cell in the seed—births and deaths occur simultaneously, and the discrete moment at which this happens is sometimes called a tick (in other words, each generation is a pure function of the preceding one). The rules continue to be applied repeatedly to create further generations.*

# Requirements:

* commit to GitHub, at least daily, with a meaningful commit message describing what you accomplished and what needs to be done next

* the program must be implemented in Java and utilize the GridWorld platform

* Don't use GridWorld’s execution engine to produce subsequent generations. That is, the Step, Run, and Stop buttons will not function.

* Follow the tasks enumerated below in the order specified; commit after each task as applicable. Implement the partially defined methods in the GameOfLife class

    * populateGame (refer to populeSampleGame as an example)

    * createNextGeneration

    * main

# Artifacts to Produce:

* Requirements Document: Below are requirements to include in the README file of your BlueJ project. You have to define some requirements based on the below questions in the README file as well.

    * Live cells are instances of the Rock class.

        * *Extension: custom subclass of Actor with custom image.*

    * Dead cells are empty (no Rock)

    * The time interval between generations is one second.

        * *Extension: Is the interval configurable by the user? In real-time?*

    * How large is the grid? It must be at least 6x6.

        * *Extension: make it boundless or wrap around*

    * What pattern is displayed?

        * *Extensions: Are multiple patterns available? Are patterns chosen in code, chosen randomly, chosen by user, loaded from a file? There are a **[ton of pattern*s](https://www.conwaylife.com/wiki/Category:Patterns)* documented for the Game of Life.*

    * How long does the game run? It must run at least three iterations. Does it run forever? Does it prompt the user to continue?

* Sample Grids: You must draw at least three generations of a grid (at least 6x6) with a sample pattern other than the one provided in the starter code. The purpose of drawing these grids is to manually work through the algorithm and experience all of the steps necessary to determine the next generation from the current. This will help you map these steps you performed manually to the algorithm for your lab. Ensure that your instructor reviews your grids and marks them as completed.

* GameOfLife class: You must produce a working class that meets the requirements and is verified and validated by your test plan.

# Tasks:

1. play with the Game of Life web app and learn rules and patterns

2. define your requirements and capture in README file

3. on paper, create grids (at least 6 x 6) of at least three generations starting with your seed pattern

4. implement populateGame method in GameOfLife.java

5. on paper, create algorithm to apply the rules of the Game of Life to Actors in a Grid

6. implement createNextGeneration method in GameOfLife.java

7. implement static main method in GameOfLife.java to create multiple generations with a time delay between each

# Extensions:

* Add custom icons for alive cells.

* Implement more sophisticated seed patterns. If you do, you can create another method similar to the populateGame method to preserve your original pattern.

* Implement support to read [RLE](https://www.conwaylife.com/wiki/Run_Length_Encoded) (run-length encoded) Game of Life files that specify the initial pattern.

* Add More Awesome.

# Submission:

* Ensure the following artifacts have been committed to GitHub in addition to your code:

    * requirements captured in README file

* Submit a link to your GitHub repository.
