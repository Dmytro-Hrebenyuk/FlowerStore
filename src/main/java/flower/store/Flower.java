package flower.store;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public void copyFrom(Flower flower) { 
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;}

    @Override
    public String toString() {
        return "Flower{" +
                "sepalLength=" + sepalLength +
                ", color=" + color +
                ", price=" + price +
                ", flowerType=" + flowerType +
                '}';
    }
    public FlowerSpec getFlowerSpec() {
        return new FlowerSpec(color, flowerType);
    }
    
    public String getColor() {
        return color.toString();
    }
}

class Tulip extends Flower {
    public Tulip() {
        super(0.0, FlowerColor.YELLOW, 0.0, FlowerType.TULIP);
    }
}

class Rose extends Flower {
    public Rose() {
        super(0.0, FlowerColor.RED, 0.0, FlowerType.TULIP);
    }
}

class Chamomile extends Flower{
    public Chamomile() {
        super(0.0 , FlowerColor.WHITE , 0.0 , FlowerType.CHAMOMILE);
    }
}