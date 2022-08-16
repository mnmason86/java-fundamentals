package basics;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
  public static void main(String[] args) {
    System.out.println(pluralize("dog", 5));
    System.out.println(pluralize("dog", 0));
    System.out.println(pluralize("dog", 1));
    flipNHeads(6);
    clock();

  }

  private static String pluralize (String word, int number) {
    if ( number > 1 || number == 0) {
      return word + "s";
    } else {
      return word;
    }
  }

  private static void flipNHeads (int n){
    Random randomNum = new Random();
    int flips = 0;
    int numberOfHeads = 0;
    while (numberOfHeads < n) {
      if (randomNum.nextDouble() >= 0.5){
        System.out.println("heads");
        ++numberOfHeads;
        ++flips;
      } else if (randomNum.nextDouble() < 0.5) {
        System.out.println("tails");
        numberOfHeads = 0;
        ++flips;
      } 
    }
    System.out.println("It took " + flips + " flips to flip " + n + " heads in a row");
  }

  private static void clock(){
    LocalDateTime now = LocalDateTime.now();
    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    System.out.println(time);
  }
}