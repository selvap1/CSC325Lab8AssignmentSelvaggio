// Abstract factory interface for creating a complete outfit
public interface OutfitFactory {
    // Method to create a top
    Top createTop();
    
    // Method to create a pant
    Pant createPant();
    
    // Method to create a shoe
    Shoe createShoe();
}
