// StoreRunner.java

public class StoreRunner {
    public static void main(String[] args) {

        // Creating instances of VinylRecord and Instrument

        System.out.println("Vinyl");

        VinylRecord v1 = new VinylRecord("Die Lit", "Playboi Carti", 19.99, 2018, "Rap");
        System.out.println(v1);

        VinylRecord v2 = new VinylRecord("Blonde", "Frank Ocean", 24.99, 2016, "R&B");
        System.out.println(v2);
      
        VinylRecord v3 = new VinylRecord("This Is How Tomorrow Moves", "Beabadoobee", 28.99, 2024, "Rap");
        System.out.println(v3);

        System.out.println("Instruments");
      
        Instrument i1 = new Instrument("Guitar", "Fender Stratocaster", 499.99, "Electric", "Wood");
        System.out.println(i1);

        Instrument i2 = new Instrument("Trumpet", "Etude ETR-100", 269.99, "Bass", "brass");
        System.out.println(i2);

        Instrument i3 = new Instrument("Piano", "Kawai CR-45 Crystal", 1500.00, "Grand", "Crystal");
        System.out.println(i3);

    }
}
