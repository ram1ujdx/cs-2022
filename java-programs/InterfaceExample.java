interface Printable{
	void print();
}

interface Scannable{
	void scan();
}

class HpPrinter implements Printable,Scannable{
	public void print(){
		System.out.println("Printing Documents");
	}

	public void scan(){
		System.out.println("Scanning images");
	}
}

public class InterfaceExample{
	public static void main(String []a){
		HpPrinter p1 = new HpPrinter();
		p1.print();
		p1.scan();
	}
}