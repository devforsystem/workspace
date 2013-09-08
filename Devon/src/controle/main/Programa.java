package controle.main;
import view.main.MenuPrincipal;

public class Programa {

	
	public static void main(String[] args) {
		 
	    try {
	     MenuPrincipal frame = new MenuPrincipal();
	     frame.setLocationRelativeTo(null);
	     frame.setVisible(true);
	    } catch (Exception e) {
	     e.printStackTrace();
	    }
	   
	  
	}
}