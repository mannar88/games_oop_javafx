package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
//        throw new ImpossibleMoveException(
//                String.format("Could not way by diagonal from %s to %s", position, dest)
//        );
        int size = Math.abs(dest.getX() - position.getX());
    Cell [] rsl = new Cell[size];
    int dx = dest.getX()>position.getX()? 1: -1;
    int dy = dest.getY() > position.getY()? 1: -1;
    int count = 1;
    for (int i = 0; i < size; i++) {
int x = position.getX() + count * dx;
int y = position.getY() + count * dy;
count++;
rsl [i] = Cell.findBy(x, y);
        }
    return  rsl;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        if (Math.abs(dest.getX() - source.getX()) == Math.abs(dest.getY() - source.getY())) {
return  true;
        }
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
