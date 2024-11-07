// Concrete factory for creating a Casual style outfit
public class CasualOutfitFactory implements OutfitFactory {
    // Creates a Casual Top
    public Top createTop() {
        return new CasualTop();
    }

    // Creates a Casual Pant
    public Pant createPant() {
        return new CasualPant();
    }

    // Creates a Casual Shoe
    public Shoe createShoe() {
        return new CasualShoe();
    }
}
