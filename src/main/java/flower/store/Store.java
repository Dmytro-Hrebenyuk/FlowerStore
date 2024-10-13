package flower.store;

import lombok.Getter;

public class Store {
    private FlowerBucket flowerBucket;

    public Store() {
        this.flowerBucket = new FlowerBucket();
    }

    public Store(FlowerBucket flowerBucket) {
        this.flowerBucket = flowerBucket;
    }

    public FlowerPack[] search(FlowerSpec searchSpec) {
        FlowerPack[] results = new FlowerPack[flowerBucket.getFlowerBucket().length];
        int index = 0;

        for (FlowerPack pack : flowerBucket.getFlowerBucket()) {
            if (pack.getFlower().getFlowerSpec().matches(searchSpec)) {
                results[index++] = pack;
            }
        }

        // Trim results array to the size of found items
        FlowerPack[] trimmedResults = new FlowerPack[index];
        System.arraycopy(results, 0, trimmedResults, 0, index);
        return trimmedResults;
    }
}