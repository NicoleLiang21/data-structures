import java.util.Stack;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    private Pair pair;
    private Stack<Pair> unfilled = new Stack<>();

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int col)
    {
        pair = new Pair(row, col);
        unfilled.push(pair);

        int count = 1;
        while (unfilled.size() > 0)
        {
            pair = unfilled.pop();

            if (pixels[pair.getRow()][pair.getColumn()] == 0)
            {
                pixels[pair.getRow()][pair.getColumn()] = count;
                count++;
            }

            // North
            if (pair.getRow() != 0 && pixels[pair.getRow() - 1][pair.getColumn()] == 0)
              unfilled.push(new Pair(pair.getRow() - 1, pair.getColumn()));

            // East
            if (pair.getColumn() != 9 && pixels[pair.getRow()][pair.getColumn() + 1] == 0)
              unfilled.push(new Pair(pair.getRow(), pair.getColumn() + 1));

            // South
            if (pair.getRow() != 9 && pixels[pair.getRow() + 1][pair.getColumn()] == 0)
              unfilled.push(new Pair(pair.getRow() + 1, pair.getColumn()));

            // West
            if (pair.getColumn() != 0 && pixels[pair.getRow()][pair.getColumn() - 1] == 0)
              unfilled.push(new Pair(pair.getRow(), pair.getColumn() - 1));
        }
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
