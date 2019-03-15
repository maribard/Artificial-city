import java.util.Iterator;
import java.util.List;


public class Spawner {
	List<SpawnPoint> spawnPoints;
	List<Car> carList;
	RandomGenerator generator;
	
	
	public Spawner(RoadNetwork rn, List<Car> cl){
		generator = RandomGenerator.getInstance();
		spawnPoints = rn.spawnPoints;
		carList = cl;
	}
	
	void globalSpawn(){
		Car car;
		Iterator<SpawnPoint> iterator = spawnPoints.iterator();
		while(iterator.hasNext()){
		  SpawnPoint spawnPoint = iterator.next();
		  int rand = generator.probability();
		  if(spawnPoint.spawnProbability >= rand && spawnPoint.streetPart.car == null){
			  car = new Car(spawnPoint.street);
			  spawnPoint.streetPart.car = car;
			  carList.add(car);
		  }
		}
		
	}
	void addCar(Car car){
		carList.add(car);
	}

}
