package test;

import javax.swing.UIManager;



public class Test {
	public static void main(String[] args){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new QLCHView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
