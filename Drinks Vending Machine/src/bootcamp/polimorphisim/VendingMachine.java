package bootcamp.polimorphisim;

import java.util.Scanner;

public class VendingMachine {
	
	public static int milkQtt;
	public static int waterQtt;

	static {
		 milkQtt = 1000;
		 waterQtt = 2000;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  while(true) {
		    showMenu();
		    int opt = Integer.parseInt(sc.next());
		    if(opt == 0)
		      break;
		    Produceable drink = createDrink(opt);
		    drink.produce();
		  }
		}

		private static Produceable createDrink(int opt) {
		  switch(opt){
		  case 0: 
			  System.out.println("by by");
		  case 1:
			  return new HotChocolate();
		  case 2: 
			  return new Espresso();
		  case 3: 
			  return new Coppuccino();
		  case 4: 
			  return new Latte();
		  case 5: 
			  return new Cola();
		  case 6: 
			  return new Sprit();
		  case 7: 
			  return new OrangeJuice();
		  case 8: 
			  return new AppleJuice();
		  }
		return null;
		}

		public static void showMenu() {
		  System.out.println("Please select a drink or enter 0 to exit:");
		  System.out.println("1. Hot Chocolate\n" + "2. Hot Espresso\n" + "3. Hot Cappuccino\n" + "4. Hot Latte\n"
		+ "5. Cola\n" + "6. Sprite\n" + "7. Orange Juice\n" + "8. Apple Juice");
		}

}
