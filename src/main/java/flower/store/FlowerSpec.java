package flower.store;

public class FlowerSpec {
    private FlowerColor color;
    private FlowerType flowerType;

    public FlowerSpec(FlowerColor color, FlowerType flowerType) {
        this.color = color;
        this.flowerType = flowerType;
    }
    
    public boolean matches(FlowerSpec other) {
        if (this.color != other.color && this.color != null && other.color != null) {
            return false;
        }
        if (this.flowerType != other.flowerType && this.flowerType != null && other.flowerType != null) {
            return false;
        }
        return true;
    }
}