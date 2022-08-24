package inheritance;

import java.util.ArrayList;

public class Restaurant extends Business {

    // Constructor

    public Restaurant(String name, String price){
        super(name,price);
    }
    @Override
    public String toString(){
        return "Restaurant Name: " + name + ", Price: " + price;
    }

}
