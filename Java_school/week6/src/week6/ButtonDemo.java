package week6;

import java.awt.*;

public class ButtonDemo {

	public ButtonDemo() {
		Frame f = new Frame("Button Demo: KRJ");
		Button b = new Button("OK");
		
		f.add(b);
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
