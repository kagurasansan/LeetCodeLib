package easy;

public class Problem807 {
    /*
       [[8, 4, 8, 7],
        [7, 4, 7, 7],
        [9, 4, 8, 7],
        [3, 3, 3, 3]]
     */
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] l = new int[grid.length]; //竖着
        int[] v = new int[grid.length]; //横着
        for(int i= 0;i < grid.length;i ++){
            l[i] = findMax(grid[i]);
            //System.out.print(l[i] + "");
        }
        //System.out.println();
        for (int i = 0;i < grid[0].length;i++){
            int max = grid[0][i];
            for(int j = 0;j < grid.length;j++){
                if(grid[j][i] > max){
                    max = grid[j][i];
                }
            }
            v[i] = max;
            //System.out.print(v[i] + "");
        }
        //System.out.println();
        int sum = 0;
        for(int i = 0;i < grid.length;i++){
            for (int j = 0;j < grid[i].length;j++){
                //System.out.println(grid[i][j] +"::"+ l[i] + "::" + v[j]);
                if(grid[i][j] < Math.min(l[i],v[j])){
                    //System.out.println(grid[i][j] +"::"+ Math.min(l[i],v[j]));
                    sum = sum + Math.min(l[i],v[j]) - grid[i][j];
                }
            }
        }
        //System.out.println(sum);
        return sum;
    }

    public static int findMax(int[] data){
        int max = data[0];
        for(int i = 0;i < data.length;i++){
            if(data[i] > max){
                max = data[i];
            }
        }
        return max;
    }

   // The skyline viewed from top or bottom is: [9, 4, 8, 7]
   // The skyline viewed from left or right is: [8, 7, 9, 3]
    public static void main(String[] args){
        int[][] grid= {
                 //9 4 8 7
              //59 88 51
                {59,88,44},//88
                {3,18,38}, //38
                {21,26,51} //51
        };
        maxIncreaseKeepingSkyline(grid);
    }
}
