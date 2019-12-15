package Commands;

import Logger.Logger;
import Saver.Saver;

public class Price implements CommandBase {
    @Override
    public void execute() {
            int count = 0;
            for (Saver s : Derevatuv.getSaver()) {
                count += s.getPrice();
            }

            System.out.println("Price of derevatuv is " + count);

        Logger.log("Була знайдена ціна всього дереватива " + count);
    }
}
