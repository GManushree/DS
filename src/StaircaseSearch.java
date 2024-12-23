/*public class StaircaseSearch {
    public static boolean search(int matrix[][],int key) {
        int row=0;
        int col=matrix[0].length-1;//start from right most element in first row 
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at (" + row + "," + col + ")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
}
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=33;
        search(matrix,key);
        }
}*/
//Considering key aS 30
//starting from lastrow left most corner
public class StaircaseSearch{
    public static boolean Search(int matrix[][],int key) {
        int row=matrix.length-1;int col=0;
        while(col<matrix[0].length && row>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
      int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=30;
        Search(matrix,key);  
    }
}

