package task3;

import java.util.Arrays;

public class ComparisonFourArguments {

    public static int max(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static double average(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static int factorial(int arg){
        int result = 1;
        if(arg == 0 || arg == 1){
            return result;
        }
        result = arg * factorial(arg - 1);

        return result;
    }

}
