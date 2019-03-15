
public class SpawnPoint {
	StreetPart streetPart;
	Street street;
	int spawnProbability;
	
	SpawnPoint(Street s, int spawnProbability){
		this.streetPart = s.streetParts[0];
		this.street = s;
		this.spawnProbability = (int)(spawnProbability*Parameters.spawnProbability);
	}
}
