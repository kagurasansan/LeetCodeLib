package easy;

public class Captures {

    /**
     * [['.','.','.','.','.','.','.','.'],
     * ['.','.','.','p','.','.','.','.'],
     * ['.','.','p','p','.','.','.','.'],
     * ['.','p','p','R','.','p','.','p'],
     * ['.','.','.','p','.','.','.','.'],
     * ['.','.','.','.','.','p','.','.'],
     * ['.','.','.','p','.','.','.','.'],
     * ['.','.','.','.','.','.','.','.']]
     * @param board
     * @return
     */
    public int numRookCaptures(char[][] board) {
        int x = 0,y = 0;
        for (int i = 0; i < 8;i++) {
            for(int j = 0;j < 8;j++){
                if(board[i][j] == 'R'){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        int count = 0;
        //left
        for(int i = x;i >= 0;i --){
            if(board[x][i] =='B'){
                break;
            }
            if(board[x][i] == 'p'){
                count ++;
                break;
            }
        }
        //System.out.println('left' + count);
        //right
        for(int i = x;i < 8;i ++){
            if(board[x][i] =='B'){
                break;
            }
            if(board[x][i] == 'p'){
                count ++;
                break;
            }
        }
        //System.out.println('right' + count);
        //down
        for(int i = y;i < 8;i ++){
            if(board[i][y] =='B'){
                break;
            }
            if(board[i][y] == 'p'){
                count ++;
                break;
            }
        }
        //System.out.println('down' + count);
        //up
        for(int i = y;i >= 0;i --){
            if(board[i][y] =='B'){
                break;
            }
            if(board[i][y] == 'p'){
                count ++;
                break;
            }
        }
       // System.out.println("up" + count);
        return count;
    }

    public static void main(String[] args){
        char[][] test ={
        {'.','.','.','.','.','.','.','.'},
        {'.','.','.','p','.','.','.','.'},
        {'.','.','.','p','.','.','.','.'},
        {'.','p','p','R','.','p','.','p'},
        {'.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.'},
        {'.','.','.','p','.','.','.','.'},
        {'.','.','.','.','.','.','.','.'}};

      // numRookCaptures(test);
    }
}
