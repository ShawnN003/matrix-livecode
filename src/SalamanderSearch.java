import java.util.ArrayList;
import java.util.List;

public class SalamanderSearch {
    public static void main(String[] args) {
        char[][] enclosure1 = {
            {'.','.','.','.','.','.'},
            {'W','.','W','W','.','.'},
            {'.','.','W','.','.','W'},
            {'f','W','.','.','W','.'},
            {'W','.','W','s','.','.'},
        };

        char[][] enclosure2 = {
            {'.','.','.','.','.','.'},
            {'W','W','W','W','s','.'},
            {'.','.','W','.','.','W'},
            {'f','W','.','.','W','.'},
            {'W','.','W','.','.','.'},
        };
    }

    /**
     * Returns whether a salamander can reach the food in an enclosure.
     * 
     * The enclosure is represented by a rectangular char[][] that contains
     * ONLY the following characters:
     * 
     * 's': represents the starting location of the salamander
     * 'f': represents the location of the food
     * 'W': represents a wall
     * '.': represents an empty space the salamander can walk through
     * 
     * The salamander can move one square at a time: up, down, left, or right.
     * It CANNOT move diagonally.
     * It CANNOT move off the edge of the enclosure.
     * It CANNOT move onto a wall.
     * 
     * This method should return true if there is any sequence of steps that
     * the salamander could take to reach food.
     * 
     * @param enclosure
     * @return whether the salamander can reach the food
     * @throws IllegalArgumentException if the enclosure does not contain a salamander
     */
    public static boolean canReach(char[][] enclosure) {
        return false;
    }

    public static List<int[]> possibleMoves(char[][] enclosure, int[] current)
    {
        List<int[]> moves = new ArrayList<>();

        int curR = current[0];
        int curC = current[1];

        //UP
        int newRow = curR-1;
        int newCol = curC;

        if(newRow >= 0 && enclosure[newRow][newCol] != 'W')
        {
            moves.add(new int[]{newRow,newCol});
        }
        //DOWN
        newRow = curR+1;
        newCol = curC;
    
        if(newRow < enclosure.length && enclosure[newRow][newCol] != 'W')
        {
            moves.add(new int[]{newRow,newCol});
        }
        //LEFT
        newRow = curR;
        newCol = curC-1;
        if(newCol >= 0 && enclosure[newRow][newCol] != 'W')
        {
            moves.add(new int[]{newRow,newCol});
        }

        //RIGHT
        newRow = curR;
        newCol = curC+1;
        if(newCol < enclosure[newRow].length && enclosure[newRow][newCol] != 'W')
        {
            moves.add(new int[]{newRow,newCol});
        }
        return moves;
    }
    //O(n*m):
    //n = # of cols 
    //m = # of rows
    public static int[] salamanderLocation(char[][] enclosure)
    {
        for(int row = 0; row < enclosure.length; row++)
        {
            for(int col = 0; col < enclosure[0].length; col++)
            {
                if(enclosure[row][col] == 's')
                {
                    int[] location = new int[] {row,col};
                    return location;
                }
            }
        }
        throw new IllegalArgumentException("No salamander present");
    }
}
