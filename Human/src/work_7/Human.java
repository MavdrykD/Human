package work_7;

import java.util.Scanner;

public class Human {
	private String name;
	private String type;
	private int age;
	private Menu menu;
	
	
	
	
	public Human(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public Menu getMenu() {
		return menu;
	}



	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public void typeOfHuman(){
		if(getType().equals("collector")){
			System.out.println("type of human is: "+getType());
		}
		if(getType().equals("hunter")){
			System.out.println("type of human is: "+getType());
		}
	}
	public void showMenu(){

			System.out.println("choose what you like:");
			for (int i = 0; i < menu.getMenu().length; i++) {
				System.out.println(i+1 + ". "+menu.getMenu()[i]);	
			}
		System.out.println("write that you would eat");
	}



	public void checkUserChoice(){
		Scanner userChoice = new Scanner(System.in);
		String scannerData = "";
		scannerData = userChoice.nextLine();
		for (int i = 0; i < menu.getMenu().length; i++) {
			if(scannerData.equals(menu.getMenu()[i])){
				System.out.println(getName()+" eat " + (int)(Math.random() * 10)+"kg "+scannerData);
				break;
			}
		}
		System.out.println("here "+scannerData+". enjoy you meal");
		userChoice.close();
		}

	@Override
	public String toString() {
		return "Human [name=" + name + ", type=" + type + ", age=" + age + "]";
	}

	
	
	
}
