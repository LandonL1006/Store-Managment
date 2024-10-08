public class RecordShop {
    // Instance variables
    private String name;
    private String description;
    private double price;

    // No-argument constructor
    public RecordShop() {
        this.name = "Unknown Item";
        this.description = "No description";
        this.price = 0.0;
    }

    // Parameterized constructor
    public RecordShop(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method
    public String toString() {
        return "Item: " + name + " || Description: " + description + " || Price: $" + price;
    }
}