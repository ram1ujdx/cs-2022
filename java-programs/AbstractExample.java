abstract class Item{
	
	private int itemCode;
	private String itemName;

	public int getItemCode(){
		return itemCode;
	}

	public void setItemCode(int itemCode){
		this.itemCode = itemCode;
	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}	
	
	public Item(int itemCode, String itemName){
		this.itemCode = itemCode;
		this.itemName = itemName;
	}
	
	public void printDetails(){
		System.out.println("Printing Details : ");
	}

}


class Book extends Item{
	
	private String author;

	public Book(int itemCode, String itemName,String author){
		super(itemCode,itemName);
		this.author=author;
	}
	
	public void printDetails(){
		super.printDetails();
		System.out.println("Book Details : ");
		System.out.println("Code : "+getItemCode());
		System.out.println("Name : "+getItemName());
		System.out.println("Author : "+author);
	}
}

class Laptop extends Item{
	
	private String brand;
	private String model;

	public Laptop(int itemCode, String itemName,String brand, String model){
		super(itemCode,itemName);
		this.brand=brand;
		this.model=model;
	}
	
	public void printDetails(){
		System.out.println("Laptop Details : ");
		super.printDetails();
		System.out.println("Code : "+getItemCode());
		System.out.println("Name : "+getItemName());
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
	
	}
}


public class AbstractExample{
	public static void main(String []a){
		Item item = new Book(123456,"Java Programming","James");
		item.printDetails();

		item = new Laptop(54376,"HP Laptop","HP","HP 15");
		item.printDetails();

			
	}
}
		


