import java.util.LinkedList;
import java.util.List;

public class Option {
	int group;		// do œwiate³ itp
	Street inStreet;
	Street outStreet;
	boolean isON;
	int probability;
	List<Option> collides;
	
	
	public Option(Street in, Street out, int p){
		collides = new LinkedList<Option>();
		inStreet = in;
		outStreet = out;
		group = 0;
		isON = true;
		probability = p;
	}
	
	public Option(Street in, Street out, int p, int g){
		collides = new LinkedList<Option>();
		inStreet = in;
		outStreet = out;
		group = g;
		isON = false;
		probability = p;
	}
}
