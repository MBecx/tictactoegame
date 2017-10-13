package com.udacity;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by asser on 6/6/16.
 */

public class GameTest {

    private Game game;

    @Before
    public void setUp(){
        game = new Game();
    }

    @Test
    public void horizontal_x_win_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid = {   {'-', 'o', 'x'},
                            {'o', 'x', 'x'},
                            {'-', 'o', 'x'}};
        char turn = 'x';
        int freeSpots = 2;
        assertTrue("x horizontal win fail", game.checkGameWinner(grid,turn,freeSpots).equalsIgnoreCase("x wins"));
    }

    @Test
    public void horizontal_x_win_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'x', '-', '-'},
                            {'x', 'x', 'o'},
                            {'x', 'o', 'o'}};
        char turn2 = 'x';
        int freeSpots2 = 2;
        assertTrue("x horizontal win fail", game.checkGameWinner(grid2,turn2,freeSpots2).equalsIgnoreCase("x wins"));
    }
    @Test
    public void horizontal_x_win_case3() {
        // Note that horizontal here is vertical in UI and vise versa
        char [][] grid3 = { {'-','x','-'},
                            {'o','x','o'},
                            {'x','x','o'}};
        char turn3 = 'x';
        int freeSpots3 = 1;
        assertTrue( "x horizontal win fail", game.checkGameWinner(grid3,turn3,freeSpots3).equalsIgnoreCase("x wins"));
    }

    @Test
    public void horizontal_o_win_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid = {   {'-', 'o', 'x'},
                            {'x', 'o', '-'},
                            {'-', 'o', 'x'}};
        char turn = 'o';
        int freeSpots = 2;
        assertTrue("o horizontal win fail", game.checkGameWinner(grid,turn,freeSpots).equalsIgnoreCase("o wins"));
    }

    @Test
    public void horizontal_o_win_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'x', 'x', 'o'},
                            {'-', 'x', 'o'},
                            {'x', 'o', 'o'}};
        char turn2 = 'o';
        int freeSpots2 = 1;
        assertTrue("o horizontal win fail", game.checkGameWinner(grid2,turn2,freeSpots2).equalsIgnoreCase("o wins"));
    }
    @Test
    public void horizontal_o_win_case3() {
        // Note that horizontal here is vertical in UI and vise versa
        char [][] grid3 = { {'o','x','-'},
                            {'o','-','x'},
                            {'o','x','-'}};
        char turn3 = 'o';
        int freeSpots3 = 3;
        assertTrue("o horizontal win fail", game.checkGameWinner(grid3,turn3,freeSpots3).equalsIgnoreCase("o wins"));
    }


    @Test
    public void vertical_x_win_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid = {   {'-', 'o', 'x'},
                            {'x', 'x', 'x'},
                            {'-', 'o', 'o'}};
        char turn = 'x';
        int freeSpots = 1;
        assertTrue("x vertical win fail", game.checkGameWinner(grid,turn,freeSpots).equalsIgnoreCase("x wins"));
    }

    @Test
    public void vertical_x_win_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'x', 'o', 'o'},
                            {'-', '-', 'o'},
                            {'x', 'x', 'x'}};
        char turn2 = 'x';
        int freeSpots2 = 2;
        assertTrue("x vertical win fail", game.checkGameWinner(grid2,turn2,freeSpots2).equalsIgnoreCase("x wins"));
    }
    @Test
    public void vertical_x_win_case3() {
        // Note that horizontal here is vertical in UI and vise versa
        char [][] grid3 = { {'x','x','x'},
                            {'o','-','o'},
                            {'x','-','o'}};
        char turn3 = 'x';
        int freeSpots3 = 2;
        assertTrue("x vertical win fail", game.checkGameWinner(grid3,turn3,freeSpots3).equalsIgnoreCase("x wins"));
    }

    @Test
    public void vertical_o_win_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid = {   {'o', 'o', 'o'},
                            {'x', 'x', '-'},
                            {'x', 'o', 'x'}};
        char turn = 'o';
        int freeSpots = 1;
        assertTrue("o vertical win fail", game.checkGameWinner(grid,turn,freeSpots).equalsIgnoreCase("o wins"));
    }

    @Test
    public void vertical_o_win_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'x', 'x', 'o'},
                            {'o', 'o', 'o'},
                            {'x', 'o', 'x'}};
        char turn2 = 'o';
        int freeSpots2 = 0;
        assertTrue("o vertical win fail", game.checkGameWinner(grid2,turn2,freeSpots2).equalsIgnoreCase("o wins"));
    }
    @Test
    public void vertical_o_win_case3() {
        // Note that horizontal here is vertical in UI and vise versa
        char [][] grid3 = { {'x','x','-'},
                            {'x','-','x'},
                            {'o','o','o'}};
        char turn3 = 'o';
        int freeSpots3 = 2;
        assertTrue("o vertical win fail", game.checkGameWinner(grid3,turn3,freeSpots3).equalsIgnoreCase("o wins"));
    }


    @Test
    public void diagonal_x_win_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'x', 'o', 'o'},
                            {'-', 'x', 'o'},
                            {'x', '-', 'x'}};
        char turn2 = 'x';
        int freeSpots2 = 2;
        assertTrue( "x diagonal win fail", game.checkGameWinner(grid2,turn2,freeSpots2).equalsIgnoreCase("x wins"));
    }
    @Test
    public void diagonal_x_win_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char [][] grid3 = { {'x','-','x'},
                            {'-','x','o'},
                            {'x','o','o'}};
        char turn3 = 'x';
        int freeSpots3 = 2;
        assertTrue("x diagonal win fail", game.checkGameWinner(grid3,turn3,freeSpots3).equalsIgnoreCase("x wins"));
    }

    @Test
    public void diagonal_o_win_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid = {   {'x', '-', 'o'},
                            {'x', 'o', 'x'},
                            {'o', 'o', 'x'}};
        char turn = 'o';
        int freeSpots = 1;
        assertTrue("o diagonal win fail", game.checkGameWinner(grid,turn,freeSpots).equalsIgnoreCase("o wins"));
    }

    @Test
    public void diagonal_o_win_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'o', 'x', '-'},
                            {'x', 'o', 'x'},
                            {'x', 'o', 'o'}};
        char turn2 = 'o';
        int freeSpots2 = 1;
        assertTrue("o diagonal win fail", game.checkGameWinner(grid2,turn2,freeSpots2).equalsIgnoreCase("o wins"));
    }

    @Test
    public void tie_game_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'o', 'x', 'o'},
                            {'x', 'o', 'x'},
                            {'x', 'o', 'x'}};
        char turn2 = 'x';
        int freeSpots2 = 0;
        assertTrue("tie game failed", game.checkGameWinner(grid2,turn2,freeSpots2).equalsIgnoreCase("tie"));
    }

    @Test
    public void tie_game_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'o', 'x', 'o'},
                            {'o', 'x', 'x'},
                            {'x', 'o', 'x'}};
        char turn2 = 'x';
        int freeSpots2 = 0;
        assertTrue("tie game failed", game.checkGameWinner(grid2,turn2,freeSpots2).equalsIgnoreCase("tie"));
    }

    @Test
    public void tie_game_case3() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'x', 'o', 'o'},
                            {'o', 'x', 'x'},
                            {'x', 'o', 'o'}};
        char turn2 = 'x';
        int freeSpots2 = 0;
        assertTrue( "tie game failed", game.checkGameWinner(grid2,turn2,freeSpots2).equalsIgnoreCase("tie"));
    }


    @Test
    public void no_winner_case1() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'o', 'x', '-'},
                            {'o', 'x', 'x'},
                            {'x', 'o', 'x'}};
        char turn2 = 'x';
        int freeSpots2 = 1;
        assertTrue("game no supposed to end", game.checkGameWinner(grid2,turn2,freeSpots2).equalsIgnoreCase("none"));
    }

    @Test
    public void no_winner_case2() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'o', 'x', '-'},
                            {'o', 'x', 'x'},
                            {'-', 'o', 'x'}};
        char turn2 = 'x';
        int freeSpots2 = 2;
        assertTrue("game no supposed to end", game.checkGameWinner(grid2,turn2,freeSpots2).equalsIgnoreCase("none"));
    }

    @Test
    public void no_winner_case3() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'-', '-', '-'},
                            {'-', 'x', 'o'},
                            {'-', '-', 'x'}};
        char turn2 = 'x';
        int freeSpots2 = 6;
        assertTrue("game no supposed to end", game.checkGameWinner(grid2,turn2,freeSpots2).equalsIgnoreCase("none"));
    }

    @Test
    public void no_winner_case4() {
        // Note that horizontal here is vertical in UI and vise versa
        char[][] grid2 = {  {'-', '-', '-'},
                            {'-', 'x', '-'},
                            {'-', '-', '-'}};
        char turn2 = 'o';
        int freeSpots2 = 8;
        assertTrue("game no supposed to end", game.checkGameWinner(grid2,turn2,freeSpots2).equalsIgnoreCase("none"));
    }
}
