package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        double price = RANDOM_GENERATOR.nextDouble() * MAX_PRICE;
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice(), 0.01);
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
    }

    @Test
    public void testSepalLength() {
        double sepalLength = RANDOM_GENERATOR.nextDouble() * 10; // Assuming sepal length is between 0 and 10
        flower.setSepalLength(sepalLength);
        Assertions.assertEquals(sepalLength, flower.getSepalLength(), 0.01);
    }

    @Test
    public void testFlowerType() {
        FlowerType flowerType = FlowerType.TULIP;
        flower.setFlowerType(flowerType);
        Assertions.assertEquals(flowerType, flower.getFlowerType());
    }

    @Test
    public void testCopyFrom() {
        Flower anotherFlower = new Flower(5.0, FlowerColor.YELLOW, 20.0, FlowerType.ROSE);
        flower.copyFrom(anotherFlower);
        Assertions.assertEquals(5.0, flower.getSepalLength(), 0.01);
        Assertions.assertEquals(20.0, flower.getPrice(), 0.01);
        Assertions.assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }

    @Test
    public void testDefaultValues() {
        Assertions.assertEquals(0.0, flower.getSepalLength(), 0.01);
        Assertions.assertEquals(0.0, flower.getPrice(), 0.01);
        Assertions.assertNull(flower.getFlowerType());
    }
}