package Commands;

import Logger.Logger;
import Saver.Saver;

import java.util.ArrayList;
import java.util.List;

public class Derevatuv {
  static List<Saver> savers = new ArrayList();

  public Derevatuv() {

  }

  public static void add(Saver t) {
    savers.add(t);

    Logger.log("В дереватив було додано " + t.toString());
  }

  public static void delete(int t) {
    try {
      Saver saver = savers.get(t);

      savers.remove(t);

      Logger.log("З дереватива було видалено " + saver);
    } catch (IndexOutOfBoundsException e) {
     Logger.error("В деревативі не існує " + t + "-ого елемента");
      }
  }

  public static void show(){
    savers.stream().forEach(e -> System.out.println(e));

    Logger.log("Був виведений список");
  }

  public static ArrayList<Saver> getSaver(){
        return  (ArrayList<Saver>) savers;
    }

  public static void setSavers(ArrayList<Saver> toSet){
      savers = toSet;

      Logger.log("Дереватив було оновлено на: ");

      savers.stream().forEach(e -> Logger.log("            " + e.toString()));
  }

  public static void deleteAll(){
      savers = new ArrayList<>();

      Logger.log("Дереватив було видалено");
  }
}
