public class Pair
{
    private final int row;
    private final int col;
    private int order;

    public Pair(int row, int col)
    {
        this.row = row;
        this.col = col;
        this.order = -1;
    }

    public int getRow()
    {
        return row;
    }

    public int getColumn()
    {
        return col;
    }
}
