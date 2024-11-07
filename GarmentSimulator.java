// Driver class to test the garment simulator
public class GarmentSimulator {
    public static void main(String[] args) {
        // Test a Professional style outfit
        testOutfit(new ProfessionalOutfitFactory());

        // Test a Casual style outfit
        testOutfit(new CasualOutfitFactory());

        // Test a Party style outfit
        testOutfit(new PartyOutfitFactory());
    }

    // Method to test an outfit by creating and displaying each garment's style
    public static void testOutfit(OutfitFactory factory) {
        // Create a top using the provided factory
        Top top = factory.createTop();
        
        // Create a pant using the provided factory
        Pant pant = factory.createPant();
        
        // Create a shoe using the provided factory
        Shoe shoe = factory.createShoe();

        // Print out the styles of the created garments
        System.out.println("Outfit:");
        System.out.println("Top: " + top.getStyle());
        System.out.println("Pant: " + pant.getStyle());
        System.out.println("Shoe: " + shoe.getStyle());
        System.out.println();
    }
}
