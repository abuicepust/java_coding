public class array2D{
    public static void main(String[] args){
        System.out.println("This is 2D array");
        String arr[][] = new String[3][3];
        arr[0][0] = "A";
        arr[0][1] = "B";
        arr[0][2] = "U";
        arr[1][0] = "A";
        arr[1][1] = "B";
        arr[1][2] = "U";
        arr[2][0] = "A";
        arr[2][1] = "B";
        arr[2][2] = "U";
        //System.out.print(arr[0][0]+" "+arr[0][1]+" "+arr[0][2]);
        // System.out.print(arr[0][1]);
        // System.out.print(arr[0][2]);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
                  
            }
            System.out.println();  
        }
    }
}