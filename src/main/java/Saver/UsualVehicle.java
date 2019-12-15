package Saver;

import java.util.Objects;

public class UsualVehicle implements Saver{
    static private final String NAME = "document for save from damage from usual vehicle";
    private final int levelDamage = 1;
    private int price;
    private int count;

    public UsualVehicle(int count) {
        this.count = count;
        this.price = count * levelDamage * 10;
    }

    public UsualVehicle() {
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int getLevelDamage() {
        return levelDamage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsualVehicle that = (UsualVehicle) o;
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
        return "UsualVehicle{" +
                "levelDamage=" + levelDamage +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
