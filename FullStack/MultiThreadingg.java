package FullStack;

class SoftwareUpdate extends Thread{
public	void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Updating software....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Restart extends Thread{
public	void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Welcome");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadingg {
	public static void main(String args[]) {
		
		SoftwareUpdate soft = new SoftwareUpdate();
		
		Restart re = new Restart();
		
		soft.start();
		re.start();
	}
}


