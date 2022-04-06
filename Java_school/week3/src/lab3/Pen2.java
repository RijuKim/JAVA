package lab3;

public class Pen2 {

	String vender;
	String color;
	int price;

	Pen2() {
	}

	Pen2(String name) {
		vender = name;
	}

	Pen2(int value) {
		price = value;
	}

	Pen2(String name, String col, int value) {
		vender = name;
		color = col;
		price = value;
	}

	public void write() {
		System.out.println("Pen: write()");
		System.out.println("Pen Vender: " + vender);
		System.out.println("Pen Color: " + color);
		System.out.println("Pen Price: " + price);
	}

	public void erase() {
		System.out.println("Pen: erase()");
	}
}
