package week6;

import java.awt.*;

public class LabelTest {
	
	//생성자1
	LabelTest(){
		Frame f = new Frame("LabelTest: KRJ");
		Label l = new Label("IT Dept. Kim Rijoo");
		
		f.add(l);
		f.setSize(500, 500);
		f.setVisible(true);
	}
	
	//생성자2
	LabelTest(String title){
		Frame f = new Frame(title);
		Label l = new Label("IT Dept. Kim Rijoo");
			
		f.add(l);
		f.setSize(500, 500);
		f.setVisible(true);
		}
}
