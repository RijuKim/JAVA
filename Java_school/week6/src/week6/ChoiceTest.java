package week6;

import java.awt.*;

public class ChoiceTest {
	public ChoiceTest(String msg) {
		Frame f = new Frame(msg);
		
		f.setLayout(new FlowLayout());
		Choice choice = new Choice();
		choice.add("one");
		choice.add("two");
		choice.add("three");
		choice.add("four");
		choice.add("five");
		choice.add("six");
		
		f.add(choice);
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
