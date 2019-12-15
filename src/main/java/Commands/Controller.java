package Commands;


public class Controller {

  CommandBase command;

  public Controller() {
  }

  public void setCommand(CommandBase command) {
    this.command = command;
    buttonWasPressed();
  }

  private void buttonWasPressed() {
    command.execute();
  }
}
