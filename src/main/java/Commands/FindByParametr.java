package Commands;

import Logger.Logger;

public class FindByParametr implements CommandBase {
    private int countMin;
    private int countMax;
    private String name;

    @Override
    public void execute() {
        if(countMax != 0 && countMin != 0){
            System.out.println("Find save between " + countMin + " and " + countMax);
            Derevatuv.getSaver().stream().filter(x -> x.getPrice() > countMin && x.getPrice() < countMax).
                    forEach(x -> System.out.println(x.toString()));

            Logger.log("Був виведений список, ціна між " + countMin + " і " + countMax);
        }else {
            System.out.println("Find by " + name);
            Derevatuv.getSaver().stream().filter(x -> x.getName().equals(name)).
                    forEach(x -> System.out.println(x.toString()));

            Logger.log("Був виведений список, елементи якого називаються " + name);
        }

    }



    public FindByParametr(int countMin, int countMax) {
        this.countMin = countMin;
        this.countMax = countMax;
    }

    public FindByParametr(String name) {
        this.name = name;
    }
}
