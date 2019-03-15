import java.util.Iterator;

public class LightCrossover extends Crossover {
	int optionGroup;  // Aktualnie dostêpne opcje
	int time;   //ile trwa ju¿ dana opcja
	int[] optionGroupDuration;  // ile czasu ma trwaæ ka¿da opcja

	
	public LightCrossover(int ileOpcji){
		optionGroup = 0;
		time = 0;
		optionGroupDuration = new int[ileOpcji];
	}
	
	
	void updateCrossover(){
		time = time + 1;
		
		if(time>=optionGroupDuration[optionGroup]){
			time = 0;
			optionGroup = nextOptionGroup();
			updateOptions();
		}
				
	}
	
	int nextOptionGroup(){
		int next = this.optionGroup + 1;
		if(next>=this.optionGroupDuration.length){
			next = 0;
		}
		
		return next;
	}
	
	void updateOptions(){
		Iterator<Option> iterator = options.iterator();
		while(iterator.hasNext()){
		  Option opcja  = iterator.next();
		  if(opcja.group == optionGroup){
		 	 opcja.isON = true;
		  }
		  else{
		 	 opcja.isON = false;
		  }	  
		}
	}
	
	
	
}
