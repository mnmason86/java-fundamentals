package basics;



public class Main {
  public static void main(String[] args) {
    System.out.println(pluralize("dog", 5));
    System.out.println(pluralize("dog", 0));
    System.out.println(pluralize("dog", 1));
    flipNHeads(6);

  }

  private static String pluralize (String word, int number) {
    if ( number > 1 || number == 0) {
      return word + "s";
    } else {
      return word;
    }
  }

  private static void flipNHeads (int n){
    int flips = 0;
    int numberOfHeads = 0;
    while (numberOfHeads < n) {
      double randomNum = Math.random();
      if (randomNum >= 0.5){
        System.out.println("heads");
        ++numberOfHeads;
        ++flips;
      } else if (randomNum < 0.5) {
        System.out.println("tails");
        numberOfHeads = 0;
        ++flips;
      } 
    }
    System.out.println("It took " + flips + " flips to flip " + n + " heads in a row");
  }
}