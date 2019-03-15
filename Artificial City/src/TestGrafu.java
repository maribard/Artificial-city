import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestGrafu {
	public static void main(String args[]){
		List<Car> carList = new LinkedList<Car>();
		RoadNetwork rn = new RoadNetwork();
		Spawner spawner = new Spawner(rn, carList);
		LightsManager lm= new LightsManager(rn.lightCrossoverList);
		
		
		long start,stop;
		for(int i=0; i<100; i++){
			start=System.currentTimeMillis();
			lm.globalLightsUpdate();
			
			
			Iterator<Street> iterator = rn.streetList.iterator();
			while(iterator.hasNext()){
			  Street street = iterator.next();
			  for(int j=street.streetParts.length-2; j>=0; j--){
				  Car car = street.streetParts[j].car;
				  if(car != null){
					  if(car.position==car.street.streetParts.length-1){
						  car.ruch_na_skrzyzowaniu();
					  }
					  else car.normalny_ruch();
				  }
			  }
			}
			
			Iterator<Car> it = carList.iterator();
			while(it.hasNext()){
				  Car car = it.next();
				  car.updatePosition();				    
			}
			it = carList.iterator();
			while(it.hasNext()){
				  Car car = it.next();
				  System.out.println(car.position);
			}
			it = carList.iterator();
			while(it.hasNext()){
				  Car car = it.next();
				  if(car.position==-1){
					  it.remove();
				  }
			}
			spawner.globalSpawn();
			
			stop=System.currentTimeMillis();
			System.out.println("Czas wykonania (w milisekundach): "+(stop-start));
		}
	}
}
