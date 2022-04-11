package week6;

import java.awt.*;

public class MyLoginUI {
	Frame f;
	Panel p1, p2, p3;
	Label lig, lpw, press;
	TextField login, passwd;
	Button okButton;
	
	public MyLoginUI(String msg) {
		f = new Frame(msg);
		f.setLayout(new BorderLayout(10, 20));
		
		//UI 관련 Component의 객체 생성 
		lig = new Label("Login");
		lpw = new Label("Password");
		press = new Label("press");
		login = new TextField(50);
		passwd = new TextField(50);
		passwd.setEchoChar('*');
		okButton = new Button("OK");
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		//생성된 Component 객체의 배치
		p1.add(lig);
		p1.add(login);
		p2.add(lpw);
		p2.add(passwd);
		p3.add(press);
		p3.add(okButton);
		
		f.add("North", p1);
		f.add("Center", p2);
		f.add("South", p3);
		
		f.setSize(500, 400);
		f.setVisible(true);
	}
}
