// Concrete factory for creating a Professional style outfit
public class ProfessionalOutfitFactory implements OutfitFactory {
    // Creates a Professional Top
    public Top createTop() {
        return new ProfessionalTop();
    }

    // Creates a Professional Pant
    public Pant createPant() {
        return new ProfessionalPant();
    }

    // Creates a Professional Shoe
    public Shoe createShoe() {
        return new ProfessionalShoe();
    }
}
