package week6;

import java.awt.*;

public class Checkbox2 extends Frame {
	Checkbox one;
	Checkbox two;
	Checkbox three;
	
	public Checkbox2() {
		super("CheckboxTest2"); //Frame 속성이 만들어짐
	
		setLayout(new FlowLayout());
	
		one = new Checkbox("One");
		two = new Checkbox("Two");
		three = new Checkbox("Three");
	
	add(one);
	add(two);
	add(three);
	setSize(300, 200);
	setVisible(true);
	}
	
	public Checkbox2(String title) {
		super(title); //Frame 속성이 만들어짐
		
		setLayout(new FlowLayout());
		
		one = new Checkbox("One");
		two = new Checkbox("Two");
		three = new Checkbox("Three");
		
		add(one);
		add(two);
		add(three);
		setSize(300, 200);
		setVisible(true);
		}
}
