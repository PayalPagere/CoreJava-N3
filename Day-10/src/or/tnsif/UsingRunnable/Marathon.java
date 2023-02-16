package or.tnsif.UsingRunnable;

//this is runnable interface 
//it uses Functional interface- it contains only one abstract method
// run method is the only method and should always include it 
//Program to demonstrate on Runnable Interface for a thread
public class Marathon implements Runnable {
	//Private data members
	private int speed;
	private String city;
	
	//runnable interface contains run()method
	@Override
	public void run() {
		System.out.println("Speed of a participant: "+speed+"m/s The City is:"+city);
	}
	//getters
	public int getSpeed() {
		return speed;
	}
	//setter
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//getter
	public String getCity() {
		return city;
	}
	//setter
	public void setCity(String city) {
		this.city = city;
	}

	void print()
	{
		
	}
}
