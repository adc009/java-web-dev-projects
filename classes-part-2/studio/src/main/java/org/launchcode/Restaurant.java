package launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {

        Date now = new Date();

        MenuItem Pizza = new MenuItem(3.00, "Pizza", "Main", true);
        MenuItem Burger = new MenuItem(2.50, "Burger", "Main", true);
        MenuItem Fries = new MenuItem(1.50, "Fries", "App", true);

        ArrayList<MenuItem> newItems = new ArrayList<MenuItem>();

        newItems.add(Pizza);
        newItems.add(Burger);
        newItems.add(Fries);

        Menu MyMenu = new Menu(now, newItems);

        System.out.print(MyMenu);





    }


}
