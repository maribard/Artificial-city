import java.awt.Graphics;
import java.util.Iterator;

public class Car {
	int V;
	int a;
	Street street; // ulica na której siê znajduje
	int position;  // pozycja na tej ulicy
	int endingPosition;
	boolean isEnding;
	Option nextChange;
	
	public Car(Street s){
		RandomGenerator rg = RandomGenerator.getInstance();
		int i = rg.probability();
		if(i>500){
			this.a=1;
		}else{
			this.a=2;
		}
		
		this.position = 0;
		this.street = s;
		this.V=startingV();
		this.setNextChange();
		s.streetParts[0].car=this;
	}
	
	public Car(Street s, int position){
		RandomGenerator rg = RandomGenerator.getInstance();
		int i = rg.probability();
		if(i>500){
			this.a=1;
		}else{
			this.a=2;
		}
		
		this.position = position;
		this.street = s;
		this.V=1;
		this.setNextChange();
		s.streetParts[position].car=this;
	}
		
	 public void drawCar(Graphics g) {
	        g.fillOval(street.streetParts[position].x,street.streetParts[position].y,2,2);
	   }
	 
	void updatePosition(){
		int nextPosition = this.position + this.V;
		int streetSize = street.streetParts.length;
		
		if(position>=street.streetParts.length || position<0){
			isEnding=true;
			position = -1;
			return;
		}
		this.street.streetParts[position].car = null;
		
		if(this.isEnding && nextPosition>=endingPosition){
			this.position = -1;
			this.street = null;
			
			
		}else if(nextPosition>=streetSize){
			if(nextChange == null){
				isEnding=true;
				position=-1;
				return;
			}
			this.position = nextPosition - streetSize;
			this.street = nextChange.outStreet;
			this.setNextChange();
			this.street.streetParts[position].car = this;
			
		}
		else{
			this.position = nextPosition;
			this.street.streetParts[position].car = this;
		}
		
		
	}
	
	void setNextChange(){
		Option nextChange = null;
		if(street.endingCrossover.end){
			isEnding = true;
			endingPosition = street.streetParts.length - 1;
		}
		else{
			RandomGenerator generator = RandomGenerator.getInstance(); 
			Iterator<Option> iterator = street.endingCrossover.options.iterator();
			int rand = generator.probability();
			while(iterator.hasNext()){
			   Option option = iterator.next();
			   if(option.inStreet == street){
				   rand = rand - option.probability;
				   if(rand<0){
					   nextChange = option;
					   break;
				   }
			   }			 
			}
		}
		this.nextChange = nextChange;
	}
	
	void updateV(){
		int newV = V + a;
		
		if(newV>street.Vmax){
			V=street.Vmax;
		}else{
			V = newV;
		}
		
	}
	
	
	
	
	
	
	
	
	int startingV(){
		int V;
		for(int i=1; i<=10; i++){
			if(street.streetParts[i].car == null){
				continue;
			}
			else{
				V = street.streetParts[i].car.V;
				return V;
			}
		}
		
		V = street.Vmax;
		return V;
	}
	
	void normalny_ruch(){
		int zasieg = 5;
		int dlugosc = street.streetParts.length;
		int odleglosc = dlugosc-position-1;
		
		if(odleglosc<zasieg){
			zasieg = odleglosc;
		}
		
		V+=a;
		if(V>street.Vmax) V=street.Vmax;
		
		if(odleglosc<=3) V = 1;
		else if(odleglosc<=7) V=2;
		else if(odleglosc<=13) V=3;
		
		for(int i=position+1; i<=position+zasieg; i++){
			if(street.streetParts[i].car != null){
				int distance = i - position-1;
				int v_c = street.streetParts[i].car.V;
				
				if(distance+v_c<V) V = distance + v_c;
				break;
			}	
		}
	}
	
	void ruch_na_skrzyzowaniu(){
		if(nextChange==null){
			this.position=street.streetParts.length;
			this.isEnding = true;
			return;
		}
		if(!nextChange.isON){
			V=0;
		}
		else{
			Iterator<Option> it = nextChange.collides.iterator();
			while(it.hasNext()){
				  Option option = it.next();
				  int last = option.inStreet.streetParts.length-1;
				  for(int i=last; i>last-3; i--){
					  Car car = option.inStreet.streetParts[i].car;
					  if(car==null){
						  continue;
					  }
					  else{
						  if(car.nextChange == option){
							  V=0;
							  return;  
						  }
						  else break;
						  
					  }
				  }
			}
			if(nextChange.outStreet.streetParts[0].car==null) V=1;
			else V=0;
				
		}
	}
	
	/*
	void updateV(){
		int zasieg_sprawdzania = 10;
		int przeszkoda = -1;
		int samochod = -1;
		
		for(int i = this.position; i<this.position + 1 + zasieg_sprawdzania; i++){
			if(this.street.streetParts[i].ending.redLight() || this.street.streetParts[i].car.V == 0){
				przeszkoda = i;
			}
			else if(this.street.streetParts[i].car.V > 0){
				samochod = i;
			}
		}
		
		if(przeszkoda != -1){
			int S = przeszkoda - position - 1; // droga na której trzeba wychamowaæ
			int opoznienie = (this.V^2)/S;
			
			this.V = V-opoznienie; // tutaj potrzebne jest ustaliæ czas jednego kroku symulacji		
		}
		// opoznienie mozna zapisac jako ujemn¹ wartoœæ i sprowadziæ wszystko do jednego wzora
		else if(samochod != -1){
			int S = samochod - position - 2; // pomiêdzy poruszaj¹cymi siê samochodami odleg³oœæ wynosi 1 streetPart
			if(street.streetParts[samochod].car.V > this.V){
				int przyspieszenie = (this.V - street.streetParts[samochod].car.V)^2 / S;
				   if(przyspieszenie>this.a){
					   przyspieszenie = a;
				   }
				this.V = this.V + przyspieszenie * t;
			}
			else{
				int opoznienie = (this.V - street.streetParts[samochod].car.V)^2 / S;
				this.V = this.V - opoznienie * t; 
			}
		}
		else przyspieszenie_normalne();
			
		
	}
	
	void przyspieszenie_normalne(){
		V = V + a*t;
		
		if(V>street.Vmax) V = street.Vmax;
	}	*/

	
	
}
