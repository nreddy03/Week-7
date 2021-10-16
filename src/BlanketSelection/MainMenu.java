package BlanketSelection;

import java.util.Scanner;

public class MainMenu implements State{

	public void MenuState(Context context) {
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.print("-------- Blanket Selection Menu Options--------\n" + 
		"1) Menu Selections \n" + 
		
		"2) View All Menus\n");
		
		
		System.out.print("");		
		//States Implementation
		int select=usrInpt.nextInt();
		
		if(select==1) {
			MenuFactory viewMenus= new MenuFactory();
			viewMenus.chooseMenu();
		}	
		}
	}
	
