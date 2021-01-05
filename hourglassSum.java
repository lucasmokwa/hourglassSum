import java.util.*;


public class hourglassSum {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem; 
            }
        }
        
        int sum = maxHourglassSum(arr);
        System.out.println(sum);
         
        scanner.close();
    }
    
    public static int maxHourglassSum(int [][] arr){
        int dim1 = arr.length;
        int dim2 = arr[0].length;
        int innerSum;
        int sum =0;
        
        for(int i =0; i<dim1 -2;i++){
            for(int j = 0;j<dim2-2;j++){
                innerSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j]+ arr[i+2][j+1]+arr[i+2][j+2];
                
                if((i==j && i==0) || innerSum > sum) sum = innerSum;
            }
        }
        
    return sum;
    }
}
