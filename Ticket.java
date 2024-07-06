package synch;
public class Ticket {
	boolean isBought;
	int place;
	Ticket (int place){
		this.place = place;
	}
	synchronized void buy(Cashier c) {
		if (!isBought) {
			try {
				Thread.sleep(2000);
			}catch(Exception e) {}
			isBought = true;
			System.out.println("Cashier " + c.id + " ticket " + this.place);
		}
	}
}
