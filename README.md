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
	GUI based game:
	1. Open homepage.java, ConwaysGame.java, GridButton.java and Game.java in a texteditor.
	2. In your command line: Compile the four files using javac
	3. In your command line: Run homepage.java using: java homepage
	4. The GUI frame shown below will be visible: 

<img width="250" alt="p1" src="https://user-images.githubusercontent.com/48881424/105154219-fea91e80-5b11-11eb-96f2-e58f3c8bd160.PNG"> 	

	5. Enter the number of rows and columns and click on "create". 
	6. The frame below will appear:
<img width="249" alt="p2" src="https://user-images.githubusercontent.com/48881424/105154275-0f599480-5b12-11eb-8809-f3f34415574f.PNG">	

	7. Click on the grid to place your blocks and click on "start".
	8. A button labeled "next" will appear. This will allow you to view the next iteration.
	9. Click on "Exit" if you wish to close the game.

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

### Credits: Done by Suvana Rohanlal - 20/01/2021
