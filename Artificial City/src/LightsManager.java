import java.util.Iterator;
import java.util.List;

public class LightsManager {
	List<LightCrossover> lightCrossovers;

	
	public LightsManager(List<LightCrossover> lC){
		lightCrossovers = lC;
	}
	
	void globalLightsUpdate(){
		Iterator<LightCrossover> iterator = lightCrossovers.iterator();
		while(iterator.hasNext()){
		  LightCrossover lc = iterator.next();
		  lc.updateCrossover();
		  
		}
	}
	void start(){
		for(int i=0; i<lightCrossovers.size(); i++){
			lightCrossovers.get(i).updateOptions();
		}
	}
}
