package week6;

import java.awt.*;

public class ButtonTestwithFrame extends Frame {
	Button ok;
	Label label;

	ButtonTestwithFrame(){
		super("Button Test extends Frame: KRJ");
		
		setLayout(new FlowLayout());
		
		ok = new Button("OK");
		label = new Label("저는 라벨입니다.");
		
		add(ok);
		add(label);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	ButtonTestwithFrame(String title){
		super(title);
		
		setLayout(new FlowLayout());
		
		ok = new Button("OK");
		label = new Label("저는 라벨입니다.");
		
		add(ok);
		add(label);
		
		setSize(300, 200);
		setVisible(true);
	}	
}
