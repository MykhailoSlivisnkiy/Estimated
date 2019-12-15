package Saver;

import java.util.Objects;

public class Invenstution implements Saver{
    static private final String NAME = "document for save from bad investution";
    private final int levelDamage = 3;
    private int price;
    private int count;

    public Invenstution(int count) {
        this.count = count;
        this.price = count * levelDamage * 10;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getLevelDamage() {
        return levelDamage;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invenstution that = (Invenstution) o;
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
        return "Invenstution{" +
                "levelDamage=" + levelDamage +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
