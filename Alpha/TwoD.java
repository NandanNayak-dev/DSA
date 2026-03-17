public class TwoD {
    static void spiral(int arr[][]){
        int startRow=0;
        int startCol=0;
        int endRow=arr.length-1;
        int endCol=arr[0].length-1;

        while(startRow<=endRow&&startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(" " +arr[startRow][j]);
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(" "+arr[i][endCol]);
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                System.out.print(" "+arr[endRow][j]);
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(" "+arr[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    static void spiralTest(int arr[][]){
        int startRow=0;
        int startCol=0;
        int endRow=arr.length-1;
        int endCol=arr[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //TOP
            for(int j=startCol;j<=endCol;j++){
                System.out.print(" "+arr[startRow][j]);
            }
            //RIGHT
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(" "+arr[i][endCol]);
            }
            //BOTTOM
            for(int j=endCol-1;j>=startCol;j--){
                System.out.print(" "+arr[endRow][j]);
            }
            //LEFT
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(" "+arr[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    
    static int diagonalSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
        }
        return sum;
    }
    
    static int ultaDiagonal(int arr[][]){
        int sum=0;
        for( int i=0;i<arr.length;i++){
            if(i==arr.length-1-i){
                continue;
            }
            sum+=arr[i][arr.length-1-i];
        }
        return sum;
    }

    //Search in sorted matrix
    static boolean search(int arr[][],int target){
        int i=0;
        int j=arr[0].length-1;
        while(i<arr.length && j>=0){
            if(target<arr[i][j]){
                j--;
            }
            else if(target>arr[i][j]){
                i++;
            }
            else if(arr[i][j]==target){
                return true;
            }
        }
        return false;
    }




    public static void main(String[] args) {
        // int n=4;
        // int a=0;
        // int matrix[][]=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         matrix[i][j]=a++;
        //         System.out.print(" "+matrix[i][j]);
        //     }System.out.println("");
        // }
        // System.out.println("");
        // System.out.println(ultaDiagonal(matrix)+diagonalSum(matrix));
        int arr[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        System.out.println(search(arr, 34));

    }
}
