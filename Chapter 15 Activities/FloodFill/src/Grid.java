import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    private Scanner in = new Scanner(System.in);
    private int row, col, count = 0;
    private Pair pair;
    private Stack<Pair> unfilled = new Stack<>();
    private int[][] array;

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        System.out.print("What is the row number? ");
        row = in.nextInt();
        in.next();

        System.out.print("What is the column number? ");
        col = in.nextInt();

        pair = new Pair(row, col);
        unfilled.push(pair);

        while (unfilled.size() > 0)
        {
            pair = unfilled.pop();

            Pair north = 
            
            if (array[pair.getRow() - 1][pair.getColumn()] == 0) // North
                unfilled.push
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
