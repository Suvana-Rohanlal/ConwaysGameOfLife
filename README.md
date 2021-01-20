## Project name: Conway's Game of Life

## Description: 
This is a java implementation of Conway's Game of Life. There are two versions, one with a GUI and one using the command line. 

## Table of Contents: 
	1. Installation
	2. Usage
	3. Rules of the Game.
	4. Credits

## Installation: 
	1. Download the zip version of the repository.
	2. Alternatively, pull the repository using the following line;
		
 
## Usage: 
	GUI based game:'
	1. Open homepage.java, ConwaysGame.java, GridButton.java and Game.java in a texteditor.
	2. In your command line: Compile the four files using javac
	3. In your command line: Run homepage.java using: java homepage
	4. The GUI frame shown below will be visible:
	5. Enter the number of rows and columns and click on "create". 
	6. The frame below will appear:
	7. Click on the grid to place your blocks and click on "start".
	8. Click on "Exit" if you wish to close the game.

	Command line based:
	1. Open Test.java and Game.java
	2. In your command line: Compile the two files using javac
	3. In your command line: Run Test.java using: java Test
	4. You will be prompted to enter the rows and columns
	5. The grid will be generated with random figures and run 3 iterations.

## Rules of the Game:
	For a filled cell:
	1. Each cell with one or no neighbour dies.
	2. Each cell with four or more neighbours dies.
	3. Each cell with two or three neighbours survives.

	For an empty space:
	1. Each cell with three neighbours becomes populated.

Credits: Done by Suvana Rohanlal
	 20/01/2021
