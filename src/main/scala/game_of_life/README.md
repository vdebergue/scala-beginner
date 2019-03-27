# Game of Life

## Rules

The World is viewed as a 2D orthogonal grid. To simplify we will say that it's a square grid of size n.
The square cells of the grid can be in either one of two cases:
  - Alive (populated)
  - Dead (unpopulated)

Every cell interacts with its 8 neighbours. At each step of time the following transition occurs for each cell:
  1. Any live cell with fewer than two live neighbours dies, as if caused by under-population
  2. Any live cell with two or three live neighbours lives on to the next generation
  3. Any live cell with more than three live neighbours dies, as if by over-population
  4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction

The initial pattern constitutes the seed of the system. The first generation is created by applying the above rules simultaneously to every cell in the seed—births and deaths occur simultaneously, and the discrete moment at which this happens is sometimes called a tick (in other words, each generation is a pure function of the preceding one). The rules continue to be applied repeatedly to create further generations.


## Instructions

Make a program that will display the evolution of a world from a seed world.

## Steps

- Start by creating models to represent your objects
- Create a function to represent a World (convert a World to an Image)
- Have a function to get the neighbours of a cell
- Have a function that will decide from the neighbours and the state of the cell, its next state
- Implement the function `World#next` that from its current state calculate its next state
- Put all together to see your world evolve

## Bonus

- Clean the code
- Make a random world at creation
- Change the rules (see [wikipedia](https://www.wikiwand.com/en/Life-like_cellular_automaton))
- How could we extract the rules from the program so that we can change them easily ?
- Implement your solution
- Export a runnable version of the program