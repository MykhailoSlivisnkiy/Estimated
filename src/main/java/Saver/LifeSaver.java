package Saver;


import java.util.Objects;

public class LifeSaver implements Saver{
    static private final String NAME = "document for save Life";
    private final int levelDamage = 6;
    private int price;
    private int count;

    public LifeSaver(int count) {
        this.count = count;
        this.price = count * levelDamage * 10;
    }

    public LifeSaver() {
    }

    @Override
    public  String getName() {
        return NAME;
    }

    @Override
    public int getLevelDamage() {
        return levelDamage;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LifeSaver lifeSaver = (LifeSaver) o;
        return levelDamage == lifeSaver.levelDamage &&
                price == lifeSaver.price &&
                count == lifeSaver.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levelDamage, price, count);
    }

    @Override
    public String toString() {
        return "LifeSaver{" +
                "levelDamage=" + levelDamage +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
