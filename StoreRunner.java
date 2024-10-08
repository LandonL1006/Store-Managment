// StoreRunner.java

public class StoreRunner {
    public static void main(String[] args) {

        // Creating instances of VinylRecord and Instrument
        VinylRecord v1 = new VinylRecord("Die Lit", "Playboi Carti", 19.99, 2016, "Rap");
        System.out.println(v1);

        Instrument i1 = new Instrument("Guitar", "Fender Stratocaster", 499.99, "Electric", "Wood");
        System.out.println(i1);

        // You can add more instances as needed
    }
}
