package synch;
public class Cashier extends Thread{
	int id;
	Ticket[] t;
	Cashier (int id, Ticket[] t){
		this.id = id;
		this.t = t;
	}
	public synchronized void run() {
		for(int i =0; i < t.length; i++) {
/*			if (!t[i].isBought) {
				try {
					Thread.sleep(10);
				}catch(Exception e) {}
				t[i].isBought = true;
				System.out.println("Cashier " + id + " ticket " + t[i].place);
			} 
*/		t[i].buy(this);
		}
	}
}
