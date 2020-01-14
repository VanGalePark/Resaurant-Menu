package restaurant;

public class MenuItem {

    private String itemName;
    private double price;
    private String description;
    private String category;

    public MenuItem(String itemName, String description, String category, double price) {
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory() {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice() {
        this.price = price;
    }

    public String toString() {
        return itemName + "\n " + description + "\n " + "$" + price;
    }
}
