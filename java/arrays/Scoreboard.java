package java.arrays;

public class Scoreboard {
    private GameEntry[] board;
    private int numEntries = 0;
    
    public Scoreboard(int limit) {
        this.board = new GameEntry[limit];    
    }

    public void add(GameEntry entry){
        int newScore = entry.getScore();

        if(numEntries < board.length || newScore > board[numEntries - 1].getScore()){
            if(numEntries < board.length){
                numEntries++;
            }

            int j = numEntries - 1;

            while(j > 0 && board[j - 1].getScore() < newScore){
                board[j] = board[j-1];
                j--;
            }

            board[j] = entry;
        }
    }

    public GameEntry remove(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        GameEntry temp = board[index];

        for(int j = index; j < (numEntries - 1); j++){
            board[j] = board[j + 1];
        }

        board[numEntries - 1] = null;
        numEntries--;

        return temp;
    }

}