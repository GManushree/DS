public class PracticeQues_2dArrays {
    public static int count_7(int array[][]) {
        int count=0;
    for(int i=0;i<array.length;i++){
       for(int j=0;j<array[0].length;j++){
           if(array[i][j]==7){
               count++;
           }
       }
   }
    return count;
}
    public static int rowSum(int nums[][]) {
        int sum=0;
        for(int j=0;j<nums[0].length;j++){
            sum+=nums[1][j];
    }
        return sum;
}
    public static void printMatrix(int matrix[][]) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
}
  public static void main(String[] args) {
      
   //1.
      int[][] array={{4,7,8},{8,8,7}};
      //Print no of 7s in 2d array
      System.out.println("The number of 7s in 2d array is:"+count_7(array));//o/p:2
              
      //2.
      //print sum of nums in 2nd row
      int[][] nums={{1,4,9},{11,4,3},{2,2,3}};
      System.out.println("The sum of 2nd row in 2d array is "+rowSum(nums));
      //3.Transpose of a matrix
      int matrix[][]={{1,2,3},{4,5,6}};
      //original matrix
      printMatrix(matrix);
      System.out.println();
      //transpose
      int row=2,col=3;
      int transpose[][]=new int[col][row];
      for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
              transpose[j][i]=matrix[i][j];
          }
      }
      printMatrix(transpose);
}
  
}
