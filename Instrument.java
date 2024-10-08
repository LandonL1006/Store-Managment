public class Instrument extends RecordShop {
    private String type;
    private String material;

    // No-argument constructor
    public Instrument() {
        super();
        this.type = "Unknown";
        this.material = "Unknown";
    }

    // Parameterized constructor
    public Instrument(String name, String description, double price, String type, String material) {
        super(name, description, price);
        this.type = type;
        this.material = material;
    }

    // Accessor and mutator methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // toString method
    public String toString() {
        return super.toString() + " || Type: " + type + " || Material: " + material;
    }
}