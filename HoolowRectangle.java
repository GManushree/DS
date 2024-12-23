public class HoolowRectangle {
    public static void hollowRect(int TotalRows,int TotalCols) {
       for(int i=1;i<=TotalRows;i++){
          for(int j=1;j<=TotalCols;j++){
                if(i==1||i==TotalRows||j==1||j==TotalCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
           }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        hollowRect(4,5);
       
    }
}
