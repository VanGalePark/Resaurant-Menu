package restaurant;

import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    public static void main(String[] args) {
        ArrayList<MenuItem> mainCourses = new ArrayList<>();
        ArrayList<MenuItem> appetizers = new ArrayList<>();
        ArrayList<MenuItem> desserts = new ArrayList<>();

        MenuItem hotdog = new MenuItem("Hotdog*",
                "Its a piece of meat in a bun!",
                "Main Course", 5.19);
        MenuItem hamburger = new MenuItem("Hamburger",
                "It's cow meat in between two buns and maybe some \n condiments if you want...",
                "Main Course", 6.51);
        MenuItem lasagna = new MenuItem("Lasagna*",
                "An italian dish, I think, with noodles and pasta \n sauce and cow meat! I honestly don't know \n too much about lasagna..",
                "Main Course", 8.47);
        MenuItem macAndCheese = new MenuItem("Mac & Cheese",
                "Noodles that are made to be the yummiest versions of \n themselves then covered in butter and cheese. Seriously \n the best quick meal known to man!",
                "Main Course", 15.99);

        mainCourses.add(hotdog);
        mainCourses.add(hamburger);
        mainCourses.add(lasagna);
        mainCourses.add(macAndCheese);

        MenuItem loadedPotatoes = new MenuItem("Loaded Baked Potato Soup",
                "It's potato soup, so like cheese, onions, potatoes,\n but with some bacon and other strange greens\n mixed in!!",
                "Appetizer", 3.18);
        MenuItem onionRings = new MenuItem("Onion Rings*",
                "They're onion rings but covered in breading and\n then fried. Probably bad for you,\n but really, really yummy.",
                "Appetizer", 2.89);

        appetizers.add(loadedPotatoes);
        appetizers.add(onionRings);

        MenuItem cake = new MenuItem("Cake",
                "I don't know much about cake but I do know\n it's yummy to a lot of people. Due to the fact\n that I don't like frosting I offer alternatives\n to that, such as pudding or whipped cream!",
                "Dessert", 6.66);
        MenuItem iceCream = new MenuItem("Ice Cream*",
                "Creamy goodness, but be careful it's really cold. We aren't responsible for your brain freezes!!!",
                "Dessert", 5.18);

        desserts.add(cake);
        desserts.add(iceCream);

        System.out.println("This is the menu for Vanessa's strangely priced food!\n-------------------------------------------------------\n");

        System.out.println("------------------\nAppetizers!\n------------------");
        for (MenuItem i : appetizers) {
            System.out.println(i.toString() + "\n");
        }

        System.out.println("------------------\nMain Courses!\n------------------");
        for (MenuItem i : mainCourses) {
            System.out.println(i.toString() + "\n");
        }

        System.out.println("------------------\nDesserts!\n------------------");
        for (MenuItem i : desserts) {
            System.out.println(i.toString() + "\n");
        }

        System.out.println("Any item with a * next to it is one of our new items!");
        System.out.println("The last time this menu was updated: " + LocalDate.now());
    }

}
