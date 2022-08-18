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

    public static String tempNotSeen(int[][] temperatureArray){
        //use HashSet type int to track unique temperatures
        HashSet<Integer> tempSet = new HashSet<>();

        //iterate through temperatureArray to find min and max
        int min = 150;
        int max = 0;
        for (int i = 0; i < temperatureArray.length; i++){
            int [] dailyTemps = temperatureArray[i];
            for (int j = 0; j < dailyTemps.length; j++) {
                int currentTemp = dailyTemps[j];
                if (currentTemp > max) {
                    max = currentTemp;
                }
                if (currentTemp < min) {
                    min = currentTemp;
                }
                //add unique temp to Hash Set
                if (!tempSet.contains(dailyTemps[j])){
                    tempSet.add(dailyTemps[j]);
                }
            }
        }
        String tempsNotFound = "High: " + max + " Low: " + min + " ";
        for (int i = min; i <= max; i++) {
            if (!tempSet.contains(i)) {
                tempsNotFound = tempsNotFound + ("Never saw temperature: " + i + " ");
            }
        }
            //return String result
            return new String (tempsNotFound.toString());
    }

    public static String tally (List<String> votes){
        //create Hash Map to hold voting options (key) & vote count (value)
        HashMap<String, Integer> voteTally = new HashMap<>();
        //iterate over Array List
        for (String ballot : votes) {
            int voteCount = voteTally.containsKey(ballot) ? voteTally.get(ballot) : 0;
            voteTally.put(ballot, voteCount += 1);
        }
        int mostVotes = 0;
        String winner = "";
        for(Map.Entry<String, Integer> voteMap : voteTally.entrySet()){
            int totalVotes = voteMap.getValue();
            if (totalVotes > mostVotes) {
                mostVotes = totalVotes;
                winner = voteMap.getKey();
            }
        }
        System.out.println(winner);
        return winner + " received the most votes!";

    };
}
