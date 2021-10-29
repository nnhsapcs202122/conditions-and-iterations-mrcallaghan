import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Game of Life starter code.
 * 
 * @author gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;

    // the number of rows and columns in the game and, therefore, the grid
    private int rows;
    private int cols;

    /**
     * Constructor for objects of class GameOfLife
     * 
     * @param   initialRows the number of rows in the grid for the game
     * @param   initialCols the number of columns in the grid for the game
     * @post    the game will have a new grid associated with it
     * 
     */
    public GameOfLife(int initialRows, int initialCols)
    {
        this.rows = initialRows;
        this.cols = initialCols;

        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = this.makeNewGrid(this.rows, this.cols);

        // create a world based on the grid
        this.world = new ActorWorld(grid);
    }

    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *      according to the sample pattern
     *
     * @pre     the grid has been created and associated with this game
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    public void populateSampleGame()
    {
        // constants for the location of the three cells initially alive
        final int ROCK_1_ROW = 0, ROCK_1_COL = 2;
        final int ROCK_2_ROW = 2, ROCK_2_COL = 0;
        final int ROCK_3_ROW = 2, ROCK_3_COL = 1;
        final int ROCK_4_ROW = 2, ROCK_4_COL = 2;
        
        // get the grid currently associated with this game
        Grid<Actor> initialGrid = this.getCurrentGrid();

        // add live cells to the three intial locations
        this.addLiveCellToGrid(initialGrid, ROCK_1_ROW, ROCK_1_COL);
        this.addLiveCellToGrid(initialGrid, ROCK_2_ROW, ROCK_2_COL);
        this.addLiveCellToGrid(initialGrid, ROCK_3_ROW, ROCK_3_COL);
        this.addLiveCellToGrid(initialGrid, ROCK_4_ROW, ROCK_4_COL);
        
        // display the newly constructed and populated world
        this.world.show();
    }

    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    public void populateGame()
    {
        /*
         * !!! create your initial pattern here (use the previous method as an example)
         */ 
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     *      associated with the game
     *
     * @pre     the game has been initialized
     * @post    the game has been updated with a grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /* You will need to read the documentation for this class and invoke various methods
         *      in order to implement the Game of Life algorithm.
         */

        // get the grid currently associated with this game
        Grid<Actor> grid = this.getCurrentGrid();

        /*
         * !!! insert your Game of Life algorithm here...
         */ 
        

    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return this.rows;
    }

    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return this.cols;
    }

    /**
     * Returns a reference to the grid currently associated with this game.
     *  Not intended to be invoked from other classes;
     *      only public to enable unit testing.
     *
     * @return    reference to the grid currently associated with this game.
     */
    public Grid<Actor> getCurrentGrid()
    {
        return this.world.getGrid();
    }

    /**
     * Sets the grid currently associated with this gameto the specified grid.
     *
     * @param the grid to make the current grid for this game
     */
    private void setCurrentGrid(Grid<Actor> newGrid)
    {
        this.world.setGrid(newGrid);
    }
    
    /**
     * Returns a reference to a new (empty) grid based on the specified number of
     *      rows and cols.
     *
     * @param   rows the number of rows in the new grid
     * @param   colsthe number of columns in the new grid
     * @return    reference to a new (empty) grid
     */
    private static Grid<Actor> makeNewGrid(int rows, int cols)
    {
        return new BoundedGrid<Actor>(rows, cols);
    }

    /**
     * Returns true if the cell at the specified row and column in the specified grid is alive.
     *  Otherwise, returns false.
     *  Not intended to be invoked from other classes;
     *      only public to enable unit testing.
     *
     * @param   grid the grid in which to check for a live cell
     * @param   row the row (zero-based index) of the cell to check
     * @param   col the column (zero-based index) of the cell to check
     * @return  true if the cell at the specified row and column is alive
     */
    public static boolean isCellAliveInGrid(Grid<Actor> grid, int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = grid.get(loc);
        return (actor != null);
    }
    
    /**
     * Adds a live cell to the specified grid at the specified row and col.
     *
     * @param   grid the grid in which to add the live cell
     * @param   row the row (zero-based index) at which to add the live cell
     * @param   col the column (zero-based index) at which to add the live cell
     */
    private static void addLiveCellToGrid(Grid<Actor> grid, int row, int col)
    {
        Rock liveCell = new Rock();
        Location loc = new Location(row, col);
        grid.put(loc, liveCell);
    }
    
    /**
     * Returns the number of live cells that are adjacent to the specified row and column
     *      in the specified grid.
     *
     * @param   grid the grid in which to count adjacent live cells
     * @param   row the row (zero-based index) at which to check for adjacent live cells
     * @param   col the column (zero-based index) at which to check for adjacent live cells
     * @return  the number of live cells that are adjacent to the specified row and column in
     *              the specified grid
     */
    private static int getNumAdjacentLiveCells(Grid<Actor> grid, int row, int col)
    {
        Location loc = new Location(row, col);
        return (grid.getOccupiedAdjacentLocations(loc)).size();
    }

    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        /*
         * !!! adjust the number of rows and columns to match your pattern
         */
        GameOfLife game = new GameOfLife(6 /* rows */, 6 /* columns */);

        // populate the game
        game.populateGame();

        /*
         * !!! Create a loop to repeatedly invoke the createNextGeneration method.
         *      Have the game pause for 1 second between each generation using this code:
         *          Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
         */ 
        
    }

}
