package week6;

import java.awt.*;
public class ListTest {

	public ListTest() {
		Frame f = new Frame("ListTest");
		
		f.setLayout(new FlowLayout());
		List list = new List();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		
		f.add(list);
		f.setSize(300, 200);
		f.setVisible(true);
		}
	}
