package Commands;

import Logger.Logger;

import java.util.Collections;

public class Sort implements  CommandBase {
    @Override
    public void execute() {
        Collections.sort(Derevatuv.getSaver());

        Derevatuv.setSavers(Derevatuv.getSaver());

        Logger.log("Дереватив було відсортовано до зниженю урону");
    }
}
