package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int xx = Math.abs(x1 - x2);
        int yy = Math.abs(y1 - y2);
        if (x1 >= 0 && x1 < 8 && x2 >= 0 && x2 < 8 && y1 >= 0 && y1 < 8 && y2 >= 0 && y2 < 8) {
            if (xx == yy) {
                rsl = Math.abs(x1 - x2);
                rsl = rsl == 0 ? Math.abs(y1 - y2) : rsl;
            }
        }
        return rsl;
    }
}
