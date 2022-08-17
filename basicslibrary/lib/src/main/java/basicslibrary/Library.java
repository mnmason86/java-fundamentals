package basicslibrary;

import java.util.*;
public class Library {

    public static int[] roll(int n){

        int [] rollArray = new int[n];

        for(int i = 1; i <= n; i++){
            Random rand = new Random();
            int randomNumber = rand.nextInt(1,7);
            rollArray[i-1] = randomNumber;
        }
        return rollArray;
    }
    public static boolean containsDuplicates(int[] array){
        boolean result = false;

        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    result = true;
                }
            }
        }
        return result;
    }
    public static double average(int [] array){
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static int[] lowestAverage(int [][] bigArray){
        int[] lowestArray = bigArray[0];
        for (int i = 0; i < bigArray.length; i++){
            if (average(bigArray[i]) < average(lowestArray)){
                lowestArray = bigArray[i];
            }
        }
        return lowestArray;
    }
}
