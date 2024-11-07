// Concrete factory for creating a Party style outfit
public class PartyOutfitFactory implements OutfitFactory {
    // Creates a Party Top
    public Top createTop() {
        return new PartyTop();
    }

    // Creates a Party Pant
    public Pant createPant() {
        return new PartyPant();
    }

    // Creates a Party Shoe
    public Shoe createShoe() {
        return new PartyShoe();
    }
}
