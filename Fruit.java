package inheritance;
import java.util.*;
public class Fruit {
	
	protected String name;

	public Fruit(String name) {//superclass-variable can be use in any subclass
		this.name = name;
		System.out.println(name + "\nFruit constructor is invoked");
      }
	
	public String getName() {
		return name;
	}

}

class Kiwi extends Fruit{//subclass of fruit - inherits state and behavior from superclass
	Scanner scan = new Scanner(System.in);
    private String colour,comment;
	private int option;
	public Kiwi(String name) {
		super(name);
		
		}
	
	public void hasSeed() {
		do {
			System.out.print("Enter option (1. Yes , 2. No):");
			this.option = scan.nextInt();
			
			if(option==1) {
				this.comment = "That's good for your heatlh rich of nutritional ";break;
				}
			else if(option==2) {
				this.comment = ".";break;
				}
			else { 
				System.out.println("Invalid input.");
			}
			
			}while(option != 1||option != 2);
		}
	
	
	public String getcomment() {
		return this.comment;
	}
	
	public void calculatinCarbohydrate(int Carbohydrate,double fiber) {//overloading in same class(can also be in dif class)
		double total = Carbohydrate-fiber;
		System.out.println("Total Carbohydrate is "+ Carbohydrate + " kiwi :" + total + "fiber.");
	}
	
	public String toString() { //overriding method-dif classes
		return "Fruit name        :" + super.getName() +
			   "\n" + "Colour            :Colour of Kiwi is Green "
			   +"\nComment           :" + this.comment;
		
	}
	
	
	
	
	
	
	
}


class Lemon extends Fruit{//subclass of fruit-inherits state and behavior from superclass
	Scanner scan = new Scanner(System.in);
	private int choice;
	private String comment;
	
	public Lemon(String name) {
		super(name);
		System.out.print("Lemon constructor is invoked");
		}
	
	public void choice(){
		do {
		System.out.print("Enter taste choice (1.Sour , 2.Sweet):");
		this.choice = scan.nextInt();
		
		if(choice == 1) {
			this.comment = "Lemon taste is sour";break;
			}
		else if(choice == 2) {
			this.comment = "Lemon taste is sweet.";break;
			}
		else {
			System.out.println("Invalid input.");
		}
		
		}while(choice != 1||choice != 2);
	}
	
	public String getcomment() {
		return this.comment;
	}
	public void calculatinCarbohydrate(int Carbohydrate,double fiber) {//overloading in same class(can also be in dif class)
		double total = Carbohydrate-fiber;
		System.out.println("Total Carbohydrate is "+ Carbohydrate + " Lemon :" + total + "fiber.");
	}
	
	public String toString() { //overriding method-dif classes
		return "Fruit name        :" + super.getName() +
			   "\n" + "Colour            :Colour of Lemon is yellow "
			   +"\nComment           :" + this.comment;
		
	}
}
	
class Apple extends Fruit {//subclass of fruit
	private String colour;
	public Apple(String name,String colour) {
		super(name);
		this.colour = colour;
		System.out.println("Apple constructor is invoked");
  }
	public String colour() {
		// TODO Auto-generated method stub
		return null;
	}
}

class RedApple extends Apple {//subclass of apple-inherits state and behavior from superclass
	Scanner scan = new Scanner(System.in);
	String  uses, placeOfOrigin,seasons;
	double weight,protein,price,total;
	int unit;
	public RedApple(String name,String colour,String u,String po,String s,double weight,double protein, double price) {
		super(name,colour);
		this.weight = weight;
		this.protein = protein;
		this.price = price;
		this.uses = u;
		this.placeOfOrigin = po;
		this.seasons = s;
		System.out.print("\n\nEnter number of apple purchased :  ");
		this.unit = scan.nextInt();
		
	}

	
	public String placeProduce(){
		return placeOfOrigin;
	}
	
	public String seasons(){
		return seasons;
	}
	
	public double weight(){
		return weight;
	}
	
	public double price(){
		return price;
	}
	
	public int getquantity(){
		return this.unit;
	}
	
	public void calctotal() {//overriding method
		total = unit*price;
		System.out.println("\nTotal price of "+ unit +" "+ name +" "+" : RM" + total);
	}

	
	public String toString() { //overriding method-dif classes
		return "Apple name      :" + super.getName() +
			   "\n" + "Colour          :" + super.colour() +
		       "\nProduce in      :" + this.placeOfOrigin +
		       "\nSeasons Harvest :" + this.seasons +
		       "\nAverage Weight  :" + this.weight + "g per apple" +
		       "\nPrice per apple : RM" + this.price;
		
	}
	
	
	
}

class GreenApple extends Apple {//subclass of apple-inherits state and behavior from superclass
	Scanner scan = new Scanner(System.in);
	String uses,placeOfOrigin,seasons;
	double weight,protein,price,total;
	int unit;
	public GreenApple(String name,String colour,String u,String po,String s,double weight,double protein,double price) {
		super(name,colour);
		this.weight = weight;
		this.protein = protein;
		this.price = price;
		this.uses = u;
		this.placeOfOrigin = po;
		this.seasons = s;
		System.out.print("\n\nEnter number of apple :  ");
		this.unit = scan.nextInt();
		
	}

	public String placeProduce(){
		return placeOfOrigin;
	}
	
	public String seasons(){
		return seasons;
	}
	
	public double weight(){
		return weight;
	}
	
	public double price(){
		return price;
	}
	
	public int getquantity(){
		return this.unit;
	}
	
	public void calctotal() {//overriding method
		total = unit*price;
		System.out.println("\nTotal price of "+ unit +" "+ name +" "+" : RM" + total);
	}

	
	public String toString() { //overriding method-dif classes
		return "Apple name      :" + super.getName() +
			   "\n" + "Colour          :" + super.colour() +
		       "\nProduce made      :" + this.placeOfOrigin +
		       "\nSeasons Harvest :" + this.seasons +
		       "\nAverage Weight  :" + this.weight + "g per apple" +
		       "\nPrice per apple : RM" + this.price;
		
	}
	
}


	
class Main {

	public static void main(String[] args) {
		Kiwi K = new Kiwi("Kiwi");
		System.out.println("Fruit name :" + K.getName());
		K.hasSeed();
		System.out.println("Comment :" + K.getcomment());
		
		Lemon L = new Lemon("Lemon");
		System.out.println("Fruit name :" + L.getName());
		L.colour();
		System.out.println("Comment :" + L.getcomment());
		
		Apple a = new Apple("Red Apple","Red");
		System.out.println("Fruit name :" + a.getName());
		System.out.println(a.colour);
		
		RedApple aa = new RedApple("Gala" , "Red" ,  "snacking" , "New Zealand" , "August to July" , 133.0 ,0.6, 1.80);
		System.out.println("Apple name       :" + aa.getName());
		System.out.println("Colour           :" + aa.colour);
		System.out.println("Uses of Apple      :" + aa.uses);
		System.out.println("Place Of Origin      :" + aa.placeOfOrigin);
		System.out.println("Seasons Harvest  :from" + aa.seasons);
		System.out.println("Average Weight   :" + aa.weight + "g per apple");
		System.out.println("Average Protein   :" + aa.protein + "g per apple");
		System.out.printf("\nPrice per apple : RM %.2f" , aa.price);
		System.out.printf("\nTotal Price     : RM %.2f" , aa.total());
		
		GreenApple b = new GreenApple("Newtown Pippin Heirloom" , "Green" , "Banking Pies" , "US-NewYork" , "Late October" , 128.0 ,0.6, 118.00);
		System.out.println("Apple name       :" + b.getName());
		System.out.println("Colour           :" + b.colour);
		System.out.println("Uses of Apple      :" + b.uses);
		System.out.println("Place Of Origin      :" + b.placeOfOrigin);
		System.out.println("Seasons Harvest  :from" + b.seasons);
		System.out.println("Average Weight   :" + b.weight + "g per apple");
		System.out.println("Average Protein   :" + b.protein + "g per apple");
		System.out.printf("\nPrice per apple : RM %.2f" , b.price);
		System.out.printf("\nTotal Price     : RM %.2f" , b.total());
		
		
		
	}
}
