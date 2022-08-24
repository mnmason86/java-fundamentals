package inheritance;

import java.util.ArrayList;

public class Shop extends Business{
    private String description;

    public Shop (String name, String description, String price){
        super(name, price);
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    @Override
    public String toString(){
        return "Shop Name: " + name + ", Description: " + description + ", Price: " + price;
    }
}
