package work_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Human collector = new Human("Victor", "collector", 25);
		String[] menu1 = {"strawberry", "bilberry", "cherry"};
		Menu menuCollector = new Menu(menu1);
		collector.setMenu(menuCollector);
		collector.showMenu();
		collector.getType();
		collector.checkUserChoice();
		
//		Human hunter = new Human("Olya", "hunter", 24);
//		String[] menu2 = {"strawberry", "bilberry", "cherry"};
//		Menu menuHunter = new Menu(menu2);
//		hunter.setMenu(menuHunter);
//		hunter.showMenu();
//		hunter.getType();
//		hunter.checkUserChoice();
	}

}
