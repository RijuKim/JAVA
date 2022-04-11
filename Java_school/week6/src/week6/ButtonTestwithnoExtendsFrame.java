package week6;

import java.awt.*;

class ButtonTestnoExtendsFrame{
	Frame f;
	Button ok;
	Label label;

	ButtonTestnoExtendsFrame(){
		
		f = new Frame("Button Test no-extneds Frame: KRJ");
		
		f.setLayout(new FlowLayout());
		
		ok = new Button("OK");
		label = new Label("저는 라벨입니다.");
		
		f.add(ok);
		f.add(label);
		
		f.setSize(300, 200);
		f.setVisible(true);
	}
	
	ButtonTestnoExtendsFrame(String title){
		
		f = new Frame(title);
		
		f.setLayout(new FlowLayout());
		
		ok = new Button("OK");
		label = new Label("저는 라벨입니다.");
		
		f.add(ok);
		f.add(label);
		
		f.setSize(300, 200);
		f.setVisible(true);
	}	
}

