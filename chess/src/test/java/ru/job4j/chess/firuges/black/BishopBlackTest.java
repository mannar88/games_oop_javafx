package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void thenPosition() {
BishopBlack bishopBlack = new  BishopBlack(Cell.A1);
        assertThat(bishopBlack.position(), is(Cell.findBy(0, 7)));
    }

    @Test
    public  void  thenCopy () {
BishopBlack   bishopBlack = new BishopBlack(Cell.A8);
    assertThat(bishopBlack.copy(Cell.D3).position(), is(Cell.findBy(3, 5)));
    }

    @Test
    public  void  thenWay () {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
Cell[] expert = new  Cell[] {
        Cell.D2,
            Cell.E3,
                Cell.F4,
            Cell.G5
};
assertThat(bishopBlack.way(Cell.G5), is(expert));
    }

    @Test
    public  void thenIsDiagonalC1G5True() {
    BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Assert.assertTrue(bishopBlack.isDiagonal(bishopBlack.position(), Cell.G5));
    }

    @Test
    public  void  thenIsDiagonalC1B2True(){
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Assert.assertTrue(bishopBlack.isDiagonal(bishopBlack.position(), Cell.B2));
    }

    @Test
    public  void thenIsDiagonalC1E5False () {
        BishopBlack b = new BishopBlack(Cell.C1);
        Assert.assertFalse(b.isDiagonal(b.position(), Cell.D5));
    }

    @Test
    public  void thenIsDiagonalC1A1False () {
        BishopBlack b = new BishopBlack(Cell.C1);
        Assert.assertFalse(b.isDiagonal(b.position(), Cell.A1));
    }


}