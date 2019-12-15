package Saver;

import java.util.Objects;

public class HealthAndSick implements Saver  {
    static private final String NAME = "document for save from problem with health";
    private final int levelDamage = 4;
    private int price;
    private int count;

    public HealthAndSick(int count) {
        this.count = count;
        this.price = count * levelDamage * 10;
    }

    public int getCount() {
        return count;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getLevelDamage() {
        return levelDamage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthAndSick that = (HealthAndSick) o;
        return levelDamage == that.levelDamage &&
                price == that.price &&
                count == that.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levelDamage, price, count);
    }

    @Override
    public String toString() {
        return "HealthAndSick{" +
                "levelDamage=" + levelDamage +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}

