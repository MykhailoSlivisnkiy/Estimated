package Saver;

public interface Saver extends Comparable<Saver>{
    int getLevelDamage();
    int getPrice();
    String getName();

    @Override
    public default int compareTo(Saver o) {
        return this.getLevelDamage() - o.getLevelDamage();
    }
}
