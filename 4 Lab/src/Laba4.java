import java.util.Arrays;

public class Laba4 {

    public static double findUnique(double arr[]) {
    	
        if(arr.length <= 2)
            return 0;

        double unique = 0;
        Arrays.sort(arr);
        if(arr[0] != arr[1])
            unique = arr[0];
        else if (arr[arr.length-1] != arr[1])
            unique = arr[arr.length-1];

        return unique;
    }

    public static strictfp void sortArray(double arr[]) {
    	
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%2 != 0) {
            	
                for(int j = i; j < arr.length; j++) {
                    if(arr[j]%2 != 0 && arr[i] > arr[j]) {
                        double t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
    	
        double unique_num = findUnique(new double[]{0.55, 1, 1, 1, 1, 1, 1});
        double ar[] = new double[]{5, 3, 2, 8, 1, 4};
        sortArray(ar);
    }
}
