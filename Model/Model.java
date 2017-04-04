package Model;
import View.ConsoleView;

public class Model {

	public void print()
	{
		String newStr = "";
		ConsoleView view = new ConsoleView();
		newStr = "Printed from Model";
		view.printMenu(newStr);
	}
}
