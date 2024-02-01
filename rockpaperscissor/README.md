# Rock Paper Scissors Game

## Overview

This is a simple Rock Paper Scissors game implemented in Java. The game allows the player to choose between Rock, Paper, and Scissors, and then randomly generates a choice for the computer. The winner is determined based on the traditional rules of Rock Paper Scissors.

## How to Play

1. Run the program.
2. Enter a number (1-3) to choose your option:
    - 1: Rock
    - 2: Paper
    - 3: Scissors
3. The computer will randomly generate its option.
4. The game will display the player's choice, the computer's choice, and the result of the round.
5. You can choose to play more rounds by entering 'y' for yes or 'n' for no.

## Rules

- Rock crushes Scissors
- Scissors cuts Paper
- Paper covers Rock

## Running the Game

Compile and run the `Main.java` file to start the game.

```bash
javac Main.java
java Main
```

## Example

```
Choose an Option:
   1) Rock
   2) Paper
   3) Scissors

Enter a number(1-3): 2

You choose: PAPER
Computer generated option: SCISSORS
<< !!! COMPUTER HAS WON THE GAME !!! >>

Want to play more(y/n)? y

Choose an Option:
   1) Rock
   2) Paper
   3) Scissors

Enter a number(1-3): 1

You choose: ROCK
Computer generated option: ROCK
<< !! NO WINNER, IT'S A TIE !!! >>

Want to play more(y/n)? n
```
