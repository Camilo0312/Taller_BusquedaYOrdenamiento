
import java.util.Random;

public class Matriz {

    static int[][] matrix = null;

    public static void main(String[] args) {

        Random Aleatorio = new Random();

        for(int x = 0; x<100; x++){
         matrix = tamano(matrix);
            int target = 1 + Aleatorio.nextInt(10000);

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                 matrix[i][j] = 1+ Aleatorio.nextInt(10000);
                }
            }
            
            ordenar();
            
            boolean r = searchMatrix(matrix, target);

            String respuesta = "";
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    respuesta = respuesta + " " + matrix[i][j];
                }
                 respuesta = respuesta + "\n";
             }
     
            System.out.println(respuesta);
            System.out.println(target);
            System.out.println(r);
        }

    }

    public static int[][] tamano(int[][] x) {

        Random Aleatorio = new Random();

        int n = 1 + Aleatorio.nextInt(100);
        int m = 1 + Aleatorio.nextInt(100);

        x = new int[n][m];
        return x;
    }
    
    public static void ordenar(){
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                for(int k=0; k<matrix.length; k++){
                    for(int l=0; l<matrix[i].length; l++){
                        if(matrix[i][j]<matrix[k][l]){
                            int t = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = t;
                        }
                    }
                }   
            }
        }
        
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0) {
            return false;
        }

        int n = matrix.length;
        int m = matrix[0].length;

        int lo = 0;
        int hi = (n * m) - 1;

        while (lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if (matrix[mid / m][mid % m] == target) {
                return true;
            }
            if (matrix[mid / m][mid % m] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }

}
