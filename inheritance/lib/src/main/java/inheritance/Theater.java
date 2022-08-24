package inheritance;

import java.util.ArrayList;

public class
Theater extends Business{
    private ArrayList<String> marquee;

    public Theater(String name, String price){
        super(name, price);
        marquee = new ArrayList<>();
    }

    public void addMovie(String title) {
        if (!marquee.contains(title)){
            marquee.add(title);
        }
    }
    public void removeMovie(String title){
        marquee.remove(title);
    }

    @Override
    public String toString(){
        return "Theater name: " + name + ", Price: " + price + ", Rating: " + getStarRating() + ", Now Showing: " + marquee;
    }
}
