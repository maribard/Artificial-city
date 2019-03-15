import java.util.ArrayList;
import java.util.List;

public class Crossover {
	List<Option> options;
	boolean end;
	
	
	public Crossover(){
		options = new ArrayList<Option>();
		end = false;
	}
	
	public Crossover(boolean end){
		options = new ArrayList<Option>();
		this.end = end;
	}
}
