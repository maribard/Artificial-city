
public class Street {
	StreetPart streetParts[];
	int Vmax;
	Crossover startingCrossover;
	Crossover endingCrossover;
	
	
	public Street(int xp, int yp, int xk, int yk, int Vmax, Crossover startingCrossover, Crossover endingCrossover){
		this.Vmax = Vmax;
		this.startingCrossover = startingCrossover;
		this.endingCrossover = endingCrossover;
		
		Double l = Math.sqrt((xp-xk)*(xp-xk)+(yp-yk)*(yp-yk))*2;   // tutaj trzeba dobraæ dobry parametr
		int length = l.intValue();
		//int reszta = length % 3;
		//length -= reszta;
		int amountOfParts = length/3; 
		
		streetParts = new StreetPart[amountOfParts];
		for(int i=0; i<amountOfParts; i++){
			int x;
			int y;
			
			if(xp<xk){
				x=xp+(xk-xp)*i/(amountOfParts-1);			//mo¿liwe, ¿e amountOfParts-1
			}
			else{
				x=xp-(xp-xk)*i/(amountOfParts-1);
			}
			
			if(yp<yk){
				y=yp+(yk-yp)*i/(amountOfParts-1);			//mo¿liwe, ¿e amountOfParts-1
			}
			else{
				y=yp-(yp-yk)*i/(amountOfParts-1);
			}
			
			streetParts[i] = new StreetPart(x,y);
		}
		
		
		
		
	}
}
