import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RoadNetwork {
	List<Street> streetList;
	List<SpawnPoint> spawnPoints;
	List<Crossover> crossoverList;
	List<LightCrossover> lightCrossoverList;
	
	public RoadNetwork(){
		spawnPoints = new LinkedList<SpawnPoint>();
		crossoverList = new LinkedList<Crossover>();
		lightCrossoverList = new LinkedList<LightCrossover>();
		
		Crossover A = new Crossover(true);
		Crossover B = new Crossover(false);
		
		Street czternascieA = new Street(94,511,0,533,5,B,A);
		Street czternascieB = new Street(0,539,94,517,5,A,B);
		
		spawnPoints.add(new SpawnPoint(czternascieB, 100));
		
		Crossover C = new Crossover(true);
		
		Street dziewietnascieA = new Street(95,519,102,547,5,B,C);
		Street dziewietnascieB = new Street(106,547,99,519,5,C,B);
		
		spawnPoints.add(new SpawnPoint(dziewietnascieB, 100));
		
		Crossover D = new Crossover(false);
		
		Street pietnascieA = new Street(174,493,98,511,5,D,B);
		Street pietnascieB = new Street(97,517,175,499,5,B,D);
		
		Crossover E = new Crossover(true);
		
		Street dwadziesciaA = new Street(172,502,181,547,5,D,E);
		Street dwadziesciaB = new Street(185,547,176,502,5,E,D);
		
		spawnPoints.add(new SpawnPoint(dwadziesciaB, 100));
		
		Crossover F = new Crossover(false);
		
		Street szesnascieA = new Street(186,491,174,493,5,F,D);
		Street szesnascieB = new Street(176,499,188,497,5,D,F);
		
		Crossover G = new Crossover(false);
		
		Street dwadziesciajedenA = new Street(196,547,187,500,5,G,F);
		
		spawnPoints.add(new SpawnPoint(dwadziesciajedenA, 100));
		
		Crossover H = new Crossover(false);
		
		Street siedemnascieA = new Street(391,446,190,490,5,H,F);
		Street siedemnascieB = new Street(188,497,393,452,5,F,H);
		
		Crossover I = new Crossover(true);
		
		Street dwadziesciadwaA = new Street(392,453,410,547,5,H,I);
		Street dwadziesciadwaB = new Street(415,547,397,453,5,I,H);
		
		spawnPoints.add(new SpawnPoint(dwadziesciadwaB, 100));
		
		Crossover J = new Crossover(false);
		
		Street osiemnascieA = new Street(466,428,396,445,5,J,H);
		Street osiemnascieB = new Street(396,450,469,435,5,H,J);
		
		Crossover K = new Crossover(false);
		
		Street dwanascieA = new Street(469,423,350,398,5,J,K);
		
		Crossover L = new Crossover(false);
		
		Street jedenascie = new Street(348,392,313,384,5,K,L);
		Street dwanascieB = new Street(348,398,312,388,5,K,L);
		
		Crossover M = new Crossover(true);
		
		Street dwanascieC = new Street(311,388,0,312,5,L,M);
		
		Crossover N = new Crossover(false);
		
		Street dziesiecA = new Street(341,313,310,383,5,N,L);
		Street dziesiecB = new Street(313,384,344,313,5,L,N);
		
		Crossover O = new Crossover(true);
		
		Street dziewiecA = new Street(401,314,346,309,5,O,N);
		Street dziewiecB = new Street(344,312,399,317,5,N,O);
		
		spawnPoints.add(new SpawnPoint(dziewiecA, 100));
		
		Crossover U = new Crossover(false);
		
		Street osiemA = new Street(349,291,342,309,5,U,N);
		Street osiemB = new Street(345,310,352,292,5,N,U);
		
		Crossover P = new Crossover(false);
		
		Street osiemC = new Street(342,223,349,291,5,P,U);
		Street osiemD = new Street(352,292,345,223,5,U,P);
		
		
		Crossover S = new Crossover(true);
		
		Street piecA = new Street(329,118,341,219,5,S,P);
		Street piecB = new Street(344,219,332,121,5,P,S);
		
		spawnPoints.add(new SpawnPoint(piecA, 100));
		
		LightCrossover T = new LightCrossover(4);						
		
		Street siedemA = new Street(427,210,346,219,5,T,P);
		Street siedemB = new Street(345,222,426,213,5,P,T);
		
		LightCrossover W = new LightCrossover(4);
		
		Street trzynascieA = new Street(500,420,468,427,5,W,J);
		Street trzynascieB = new Street(471,433,502,426,5,J,W);
		
		Crossover V = new Crossover(false);
		
		Street trzydziescijedenA = new Street(428,214,500,418,5,T,W);
		Street trzydziescijedenB = new Street(432,212,504,417,5,T,W);
		Street trzydziescijedenC = new Street(436,211,508,416,5,T,W);
		
		LightCrossover X = new LightCrossover(4);
		
		Street trzydziesciA = new Street(504,428,536,505,5,V,X);
		Street trzydziesciB = new Street(508,427,540,503,5,V,X);
		Street trzydziesciC = new Street(512,427,544,500,5,V,X);
		
		Street trzydziescipiecA = new Street(507,419,501,420,5,W,V);
		Street trzydziescipiecC = new Street(508,420,510,425,5,W,V);
		Street trzydziescipiecD = new Street(503,426,509,424,5,W,V);
		
		Street trzydziesciszescA = new Street(500,420,503,427,5,W,V);
		Street trzydziesciszescB = new Street(504,419,506,425,5,W,V);
		Street trzydziesciszescC = new Street(507,418,510,425,5,W,V);
		
		LightCrossover ZA = new LightCrossover(4);
		Crossover ZB = new Crossover();							
		
		Street trzydziescisiedemA = new Street(518,415,510,418,5,ZB,W);
		Street trzydziescisiedemB = new Street(518,417,510,420,5,ZB,W);
		Street trzydziescisiedemC = new Street(511,422,520,420,5,V,ZA);
		Street trzydziescisiedemD = new Street(512,424,520,422,5,V,ZA);
		
		
		Crossover ZC = new Crossover(true);
		Crossover ZD = new Crossover(true);
		Crossover ZE = new Crossover();
		
		Street dwadziesciaszescA = new Street(536,506,496,526,5,X,ZE);
		Street dwadziesciaszescB = new Street(496,529,537,509,5,ZE,X);
		
		Street dwadziesciasiedemA = new Street(494,531,501,547,5,ZE,ZD);
		Street dwadziesciasiedemB = new Street(504,547,497,530,5,ZD,ZE);
		
		spawnPoints.add(new SpawnPoint(dwadziesciasiedemB,100));
		
		Street dwadziesciaosiemA = new Street(492,527,461,547,5,ZE,ZC);
		Street dwadziesciaosiemB = new Street(466,547,493,530,5,ZC,ZE);
		
		spawnPoints.add(new SpawnPoint(dwadziesciaosiemB, 100));
		
		Crossover Z = new Crossover(true);
		
		Street dwadziesciadziewiecA = new Street(538,508,552,547,5,X,Z);
		Street dwadziesciadziewiecB = new Street(542,506,557,547,5,X,Z);
		Street dwadziesciadziewiecC = new Street(546,505,562,547,5,X,Z);
		
		Crossover Y = new Crossover();
		
		Street trzydziesciosiemA = new Street(575,547,523,424,5,Y,ZA);
		Street trzydziesciosiemB = new Street(580,547,527,424,5,Y,ZA);
		Street trzydziesciosiemC = new Street(585,547,531,423,5,Y,ZA);
		
		spawnPoints.add(new SpawnPoint(trzydziesciosiemA, 200));
		spawnPoints.add(new SpawnPoint(trzydziesciosiemB, 300));
		spawnPoints.add(new SpawnPoint(trzydziesciosiemC, 300));
		
		LightCrossover ZG = new LightCrossover(4); 
		
		Street trzydziescidziewiecA = new Street(519,414,450,208,5,ZB,ZG);
		Street trzydziescidziewiecB = new Street(523,413,454,208,5,ZB,ZG);
		Street trzydziescidziewiecC = new Street(526,411,457,208,5,ZB,ZG);
		
		Crossover ZF = new Crossover(true);
		
		Street czterdziesciA = new Street(587,393,529,413,5,ZF,ZA);
		Street czterdziesciB = new Street(530,417,587,396,5,ZB,ZF);
		Street czterdziesciC = new Street(532,419,587,400,5,ZB,ZF);
		
		spawnPoints.add(new SpawnPoint(czterdziesciA,200));
		
		Street czterdziescijedenA = new Street(523,421,520,416,5,ZA,ZB);
		Street czterdziescijedenB = new Street(526,420,524,416,5,ZA,ZB);
		Street czterdziescijedenC = new Street(529,421,526,415,5,ZA,ZB);
		
		Street czterdziescidwaA = new Street(522,421,529,420,5,ZA,ZB);
		Street czterdziescidwaB = new Street(527,414,521,417,5,ZA,ZB);
		Street czterdziescidwaC = new Street(522,421,524,415,5,ZA,ZB);
		
		
		Crossover ZH = new Crossover();
		LightCrossover ZJ = new LightCrossover(4); 
		
		Street jedenA = new Street(526,182,460,201,5,ZH,ZG);
		Street jedenB = new Street(459,205,526,185,5,ZG,ZH);
		
		//Street czterdziescitrzyA = new Street(448,204,462,103,5,ZG,ZJ); //447,169
		//Street czterdziescitrzyB = new Street(453,203,466,103,5,ZG,ZJ);   //452,169
		//Street czterdziescitrzyC = new Street(456,202,470,103,5,ZG,ZJ);		//457,168
		
		Street czterdziescitrzyC = new Street(456,202,457,168,5,ZG,ZJ);
		Street temp = new Street(457,169,470,103,5,ZG,ZJ);
		int pierwsza = czterdziescitrzyC.streetParts.length;
		int druga = temp.streetParts.length; 
	
		StreetPart sp[] = new StreetPart[(pierwsza+druga)];
		for(int i=0; i<pierwsza;i++){
			sp[i]=czterdziescitrzyC.streetParts[i];
		}
		for(int i=0; i<druga; i++){
			sp[pierwsza+i]=temp.streetParts[i];
		}
		czterdziescitrzyC.streetParts = sp;	
		
		
		
		Street czterdziescitrzyB = new Street(453,203,452,169,5,ZG,ZJ);
		temp = new Street(452,170,466,103,5,ZG,ZJ);
		pierwsza = czterdziescitrzyB.streetParts.length;
		druga = temp.streetParts.length; 
	
		sp = new StreetPart[(pierwsza+druga)];
		for(int i=0; i<pierwsza;i++){
			sp[i]=czterdziescitrzyB.streetParts[i];
		}
		for(int i=0; i<druga; i++){
			sp[pierwsza+i]=temp.streetParts[i];
		}
		czterdziescitrzyB.streetParts = sp;	
		
		
		
		Street czterdziescitrzyA = new Street(448,204,447,169,5,ZG,ZJ);
		temp = new Street(447,170, 462,103,5,ZG,ZJ);
		pierwsza = czterdziescitrzyA.streetParts.length;
		druga = temp.streetParts.length; 
	
		sp = new StreetPart[(pierwsza+druga)];
		for(int i=0; i<pierwsza;i++){
			sp[i]=czterdziescitrzyA.streetParts[i];
		}
		for(int i=0; i<druga; i++){
			sp[pierwsza+i]=temp.streetParts[i];
		}
		czterdziescitrzyA.streetParts = sp;	
		
		
		
		
		
		
		Crossover ZK = new Crossover(true);
		Crossover ZI = new Crossover();
		
		Street jedenC = new Street(587,156,529,181,5,ZK,ZH);
		Street jedenD = new Street(531,184,587,160,5,ZH,ZK);
		
		spawnPoints.add(new SpawnPoint(jedenC,150));
		
		Street dwaA = new Street(529,186,544,241,5,ZH,ZI);
		
		Crossover ZL = new Crossover(true);
		Crossover ZM = new Crossover();
		
		Street trzyA = new Street(545,240,587,231,5,ZI,ZL);
		Street dwaB = new Street(545,243,553,281,5,ZI,ZM);
		
		Crossover ZO = new Crossover(true);
		Crossover ZN = new Crossover(true);
		
		Street dwaC = new Street(555,287,587,327,5,ZM,ZO);
		Street czteryA = new Street(555,283,513,297,3,ZM,ZN);
		Street czteryB = new Street(516,299,551,287,5,ZN,ZM);
		
		spawnPoints.add(new SpawnPoint(czteryB,50));
		
		LightCrossover AA = new LightCrossover(6); 
		Crossover AB = new Crossover();
		
		
		//Street trzydziescidwaA = new Street(443,98,428,208,5,AB,T); //427,169
		//Street trzydziescidwaB = new Street(446,99,432,210,5,AB,T);	//431,167
		//Street trzydziescidwaC = new Street(449,100,436,209,5,AB,T); //436,167
		
		Street trzydziescidwaC = new Street(449,100,436,167,5,AB,T);
		temp = new Street(436,168,436,209,5,AB,T);
		pierwsza = trzydziescidwaC.streetParts.length;
		druga = temp.streetParts.length; 
	
		sp = new StreetPart[(pierwsza+druga)];
		for(int i=0; i<pierwsza;i++){
			sp[i]=trzydziescidwaC.streetParts[i];
		}
		for(int i=0; i<druga; i++){
			sp[pierwsza+i]=temp.streetParts[i];
		}
		trzydziescidwaC.streetParts = sp;	
		
		
		
		
		Street trzydziescidwaB = new Street(446,99,431,167,5,AB,T);
		temp = new Street(431,168,432,210,5,AB,T);
		pierwsza = trzydziescidwaB.streetParts.length;
		druga = temp.streetParts.length; 
	
		sp = new StreetPart[(pierwsza+druga)];
		for(int i=0; i<pierwsza;i++){
			sp[i]=trzydziescidwaB.streetParts[i];
		}
		for(int i=0; i<druga; i++){
			sp[pierwsza+i]=temp.streetParts[i];
		}
		trzydziescidwaB.streetParts = sp;	
		
		
		
		
		Street trzydziescidwaA = new Street(443,98,427,169,5,AB,T);
		temp = new Street(427,170,428,208,5,AB,T);
		pierwsza = trzydziescidwaA.streetParts.length;
		 druga = temp.streetParts.length; 
	
		sp= new StreetPart[(pierwsza+druga)];
		for(int i=0; i<pierwsza;i++){
			sp[i]=trzydziescidwaA.streetParts[i];
		}
		for(int i=0; i<druga; i++){
			sp[pierwsza+i]=temp.streetParts[i];
		}
		trzydziescidwaA.streetParts = sp;		
		
		
				
				
		Crossover ZX = new Crossover(true);
		Crossover ZZ = new Crossover();
		
		Street czterdziesciczteryA = new Street(464,86,456,85,5,ZZ,AA);
		Street czterdziesciczteryB = new Street(463,91,454,89,5,ZZ,AA);
		Street czterdziesciczteryC = new Street(452,94,461,96,5,AB,ZJ);
		Street czterdziesciczteryD = new Street(452,98,460,99,5,AB,ZJ);
		
		Street czterdziescipiecA = new Street(466,84,485,0,5,ZZ,ZX);
		Street czterdziescipiecB = new Street(476,86,489,0,5,ZZ,ZX);
		Street czterdziescipiecC = new Street(474,85,494,0,5,ZZ,ZX);
		
		Street czterdziesciszescA = new Street(463,100,466,88,5,ZJ,ZZ);
		Street czterdziesciszescB = new Street(466,100,469,88,5,ZJ,ZZ);
		Street czterdziesciszescC = new Street(469,101,473,88,5,ZJ,ZZ);
		
		Street czterdziescisiedemA = new Street(462,98,469,88,5,ZJ,ZZ);
		Street czterdziescisiedemB = new Street(464,95,466,88,5,ZJ,ZZ);
		
		
		Crossover AZ = new Crossover(true);
		Crossover ZY = new Crossover();
		Crossover BZ = new Crossover();
		
		Street czterdziesciosiemA = new Street(464,0,447,80,5,ZY,AA);
		Street czterdziesciosiemB = new Street(469,0,450,81,5,ZY,AA);
		Street czterdziesciosiemC = new Street(472,0,453,81,5,ZY,AA);
		
		spawnPoints.add(new SpawnPoint(czterdziesciosiemA, 200));
		spawnPoints.add(new SpawnPoint(czterdziesciosiemB, 300));
		spawnPoints.add(new SpawnPoint(czterdziesciosiemC, 300));
		
		Street czterdziescidziewiecA = new Street(444,84,138,0,5,AB,AZ);
		Street czterdziescidziewiecB = new Street(402,81,442,91,5,BZ,AA);
		Street czterdziescidziewiecC = new Street(399,84,441,95,5,BZ,AA);
		Street czterdziescidziewiecD = new Street(119,0,397,83,5,AZ,BZ);
		
		spawnPoints.add(new SpawnPoint(czterdziescidziewiecD, 200));
		
		Street piecdziesiatA = new Street(445,85,444,96,5,AA,AB);
		Street piecdziesiatB = new Street(449,84,446,95,5,AA,AB);
		Street piecdziesiatC = new Street(452,85,450,97,5,AA,AB);
		
		Street piecdziesiatjedenA = new Street(444,93,450,94,5,AA,AB);
		Street piecdziesiatjedenB = new Street(452,85,446,85,5,AA,AB);
		Street piecdziesiatjedenC = new Street(451,89,449,97,5,AA,AB);
		Street piecdziesiatjedenD = new Street(451,89,446,96,5,AA,AB);
		
		
		
		
		
		
		
		
		
		// DODANIE ULIC
		streetList = new LinkedList<Street>();
		
		streetList.add(czternascieA);
		streetList.add(czternascieB);
		streetList.add(dziewietnascieA);
		streetList.add(dziewietnascieB);
		streetList.add(pietnascieA);
		streetList.add(pietnascieB);
		streetList.add(dwadziesciaA);
		streetList.add(dwadziesciaB);
		streetList.add(szesnascieA);
		streetList.add(szesnascieB);
		streetList.add(dwadziesciajedenA);
		streetList.add(siedemnascieA);
		streetList.add(siedemnascieB);
		streetList.add(dwadziesciadwaA);
		streetList.add(dwadziesciadwaB);
		streetList.add(osiemnascieA);
		streetList.add(osiemnascieB);
		streetList.add(trzynascieA);
		streetList.add(trzynascieB);
		streetList.add(dwanascieA);
		streetList.add(jedenascie);
		streetList.add(dwanascieB);
		streetList.add(dwanascieC);
		streetList.add(dziesiecA);
		streetList.add(dziesiecB);
		streetList.add(dziewiecA);
		streetList.add(dziewiecB);
		streetList.add(osiemA);
		streetList.add(osiemB);
		streetList.add(osiemC);
		streetList.add(osiemD);
		//streetList.add(szescA);
		//streetList.add(szescB);
		streetList.add(piecA);
		streetList.add(piecB);
		streetList.add(siedemA);
		streetList.add(siedemB);
		streetList.add(trzydziescijedenA);
		streetList.add(trzydziescijedenB);
		streetList.add(trzydziescijedenC);
		streetList.add(trzydziesciA);
		streetList.add(trzydziesciB);
		streetList.add(trzydziesciC);
		streetList.add(trzydziescipiecA);
		streetList.add(trzydziescipiecD);
		streetList.add(trzydziescipiecC);
		streetList.add(trzydziesciszescA);
		streetList.add(trzydziesciszescB);
		streetList.add(trzydziesciszescC);
		streetList.add(trzydziescisiedemA);
		streetList.add(trzydziescisiedemB);
		streetList.add(trzydziescisiedemC);
		streetList.add(dwadziesciaszescA);
		streetList.add(dwadziesciaszescB);
		streetList.add(dwadziesciasiedemA);
		streetList.add(dwadziesciasiedemB);
		streetList.add(dwadziesciaosiemA);
		streetList.add(dwadziesciaosiemB);
		streetList.add(dwadziesciadziewiecA);
		streetList.add(dwadziesciadziewiecB);
		streetList.add(dwadziesciadziewiecC);
		streetList.add(trzydziesciosiemA);
		streetList.add(trzydziesciosiemB);
		streetList.add(trzydziesciosiemC);
		streetList.add(trzydziescidziewiecA);
		streetList.add(trzydziescidziewiecB);
		streetList.add(trzydziescidziewiecC);
		streetList.add(czterdziesciA);
		streetList.add(czterdziesciB);
		streetList.add(czterdziesciC);
		streetList.add(czterdziescijedenA);
		streetList.add(czterdziescijedenB);
		streetList.add(czterdziescijedenC);
		streetList.add(czterdziescidwaA);
		streetList.add(czterdziescidwaB);
		streetList.add(czterdziescidwaC);
		streetList.add(jedenA);
		streetList.add(jedenB);
		streetList.add(czterdziescitrzyA);
		streetList.add(czterdziescitrzyB);
		streetList.add(czterdziescitrzyC);
		streetList.add(jedenC);
		streetList.add(jedenD);
		streetList.add(dwaA);
		streetList.add(trzyA);
		streetList.add(dwaB);
		streetList.add(dwaC);
		streetList.add(czteryA);
		streetList.add(czteryB);
		streetList.add(trzydziescidwaA);
		streetList.add(trzydziescidwaB);
		streetList.add(trzydziescidwaC);
		streetList.add(czterdziesciczteryA);
		streetList.add(czterdziesciczteryB);
		streetList.add(czterdziesciczteryC);
		streetList.add(czterdziesciczteryD);
		streetList.add(czterdziescipiecA);
		streetList.add(czterdziescipiecB);
		streetList.add(czterdziescipiecC);
		streetList.add(czterdziesciszescA);
		streetList.add(czterdziesciszescB);
		streetList.add(czterdziesciszescC);
		streetList.add(czterdziescisiedemA);
		streetList.add(czterdziescisiedemB);
		streetList.add(czterdziesciosiemA);
		streetList.add(czterdziesciosiemB);
		streetList.add(czterdziesciosiemC);
		streetList.add(czterdziescidziewiecA);
		streetList.add(czterdziescidziewiecB);
		streetList.add(czterdziescidziewiecC);
		streetList.add(czterdziescidziewiecD);
		streetList.add(piecdziesiatA);
		streetList.add(piecdziesiatB);
		streetList.add(piecdziesiatC);
		streetList.add(piecdziesiatjedenA);
		streetList.add(piecdziesiatjedenB);
		streetList.add(piecdziesiatjedenC);
		streetList.add(piecdziesiatjedenD);
		
		// Skrzyzowania
		Option optionA;
		Option optionB;
		Option optionC;
		Option optionD;
		Option optionE;
		Option optionF;
		
		// Skrzy¿owanie B
		optionA = new Option(czternascieB,dziewietnascieA,200);
		optionB = new Option(czternascieB,pietnascieB,800);
		optionC = new Option(pietnascieA,czternascieA,800);
		optionD = new Option(dziewietnascieB,pietnascieB,800);
			optionD.collides.add(optionB);
		optionE = new Option(pietnascieA,dziewietnascieA,200);
			optionE.collides.add(optionA);
			optionE.collides.add(optionB);	
		optionF = new Option(dziewietnascieB,czternascieA,200);
			optionF.collides.add(optionA);
			optionF.collides.add(optionE);
			optionF.collides.add(optionC);
		
		B.options.add(optionA);
		B.options.add(optionB);
		B.options.add(optionC);
		B.options.add(optionD);
		B.options.add(optionE);
		B.options.add(optionF);
		
		// Skrzy¿owanie D
		optionA = new Option(pietnascieB,szesnascieB,800);
		optionB = new Option(pietnascieB,dwadziesciaA,200);
		optionC = new Option(szesnascieA,pietnascieA,800);
		optionD = new Option(dwadziesciaB,szesnascieB,800);
			optionD.collides.add(optionA);
		optionE = new Option(szesnascieA,dwadziesciaA,200);
			optionE.collides.add(optionA);
			optionE.collides.add(optionB);
		optionF = new Option(dwadziesciaB,pietnascieA,200);
			optionF.collides.add(optionA);
			optionF.collides.add(optionE);
			optionF.collides.add(optionC);
		
		D.options.add(optionA);
		D.options.add(optionB);
		D.options.add(optionC);
		D.options.add(optionD);
		D.options.add(optionE);
		D.options.add(optionF);
			
			
		// Skrzy¿owanie F
		optionA = new Option(szesnascieB,siedemnascieB,1000);
		optionB = new Option(siedemnascieA,szesnascieA,1000);
		optionC = new Option(dwadziesciajedenA,siedemnascieB,800);
			optionC.collides.add(optionA);
		optionD = new Option(dwadziesciajedenA,szesnascieA,200);
			optionD.collides.add(optionA);
			optionD.collides.add(optionB);
		F.options.add(optionA);
		F.options.add(optionB);
		F.options.add(optionC);
		F.options.add(optionD);		
		
		// Skrzy¿owanie H
		
		optionA = new Option(siedemnascieB,osiemnascieB,700);
		optionB = new Option(siedemnascieB,dwadziesciadwaA,300);
		optionC = new Option(osiemnascieA,siedemnascieA,800);
		optionD = new Option(dwadziesciadwaB,osiemnascieB,700);
			optionD.collides.add(optionA);
		optionE = new Option(osiemnascieA,dwadziesciadwaA,200);
			optionE.collides.add(optionA);
			optionE.collides.add(optionB);
		optionF = new Option(dwadziesciadwaB,siedemnascieA,300);
			optionF.collides.add(optionA);
			optionF.collides.add(optionC);
			optionF.collides.add(optionE);
		H.options.add(optionA);
		H.options.add(optionB);
		H.options.add(optionC);
		H.options.add(optionD);
		H.options.add(optionE);
		H.options.add(optionF);	
			
		//Skrzy¿owanie J
		
		optionA = new Option(osiemnascieB,trzynascieB,800);
		optionB = new Option(trzynascieA,dwanascieA,300);
		optionC = new Option(trzynascieA,osiemnascieA,700);
		optionD = new Option(osiemnascieB,dwanascieA,200);
			optionD.collides.add(optionC);
		J.options.add(optionA);
		J.options.add(optionB);
		J.options.add(optionC);
		J.options.add(optionD);
			
			
		//Skrzy¿owanie K
		optionA = new Option(dwanascieA,jedenascie,400);
		optionB = new Option(dwanascieA,dwanascieB,600);
		
		K.options.add(optionA);
		K.options.add(optionB);
		
		
		
		//Skrzy¿owanie L
		optionA = new Option(dwanascieB,dwanascieC,1000);
		optionB = new Option(jedenascie,dziesiecB,1000);
		optionC = new Option(dziesiecA,dwanascieC,1000);
			optionC.collides.add(optionA);
		L.options.add(optionA);
		L.options.add(optionB);
		L.options.add(optionC);
		
		//Skrzy¿owanie N
		optionA = new Option(dziesiecB,dziewiecB,500);
		optionB = new Option(dziesiecB,osiemB,500);
		optionC = new Option(osiemA,dziesiecA,900);
		optionD = new Option(osiemA,dziewiecB,100);
			optionD.collides.add(optionA);
			optionD.collides.add(optionB);
		optionE = new Option(dziewiecA,osiemB,100);
			optionE.collides.add(optionB);
		optionF = new Option(dziewiecA,dziesiecA,900);
			optionF.collides.add(optionB);
			optionF.collides.add(optionC);
			optionF.collides.add(optionD);
		N.options.add(optionA);
		N.options.add(optionB);
		N.options.add(optionC);
		N.options.add(optionD);
		N.options.add(optionE);
		N.options.add(optionF);
			
		//Skrzy¿owanie U
		optionA = new Option(osiemC,osiemA,1000);
		optionB = new Option(osiemB,osiemD,1000);
			
		U.options.add(optionA);
		U.options.add(optionB);
		
		//Skrzy¿owanie P
		optionA = new Option(osiemD,siedemB,800);
		optionB = new Option(osiemD,piecB,200);
		optionC = new Option(piecA,osiemC,400);
		optionD = new Option(siedemA,piecB,100);
			optionD.collides.add(optionB);
		optionE = new Option(piecA,siedemB,600);
			optionE.collides.add(optionA);
			optionE.collides.add(optionB);
		optionF = new Option(siedemA,osiemC,900);
			optionF.collides.add(optionB);
			optionF.collides.add(optionC);
			optionF.collides.add(optionE);
		P.options.add(optionA);
		P.options.add(optionB);
		P.options.add(optionC);
		P.options.add(optionD);
		P.options.add(optionE);
		P.options.add(optionF);
		
		//Skrzy¿owanie W
		optionA = new Option(trzydziescijedenA,trzydziesciszescA,300,0);
		optionB = new Option(trzydziescijedenB,trzydziesciszescB,1000,0);
		optionC = new Option(trzydziescijedenC,trzydziesciszescC,1000,0);
		optionD = new Option(trzydziescijedenA,trzynascieA,700,0);
		W.options.add(optionA);
		W.options.add(optionB);
		W.options.add(optionC);
		W.options.add(optionD);
		optionA = new Option(trzynascieB,trzydziesciA,700,2);
		optionB = new Option(trzynascieB,trzydziescipiecD,300,2);
		optionC = new Option(trzydziescisiedemA,trzydziescipiecA,1000,2);
		optionD = new Option(trzydziescisiedemB,trzydziescipiecC,1000,2);
			optionD.collides.add(optionB);
		W.options.add(optionA);
		W.options.add(optionB);
		W.options.add(optionC);
		W.options.add(optionD);
		W.optionGroupDuration[0]=45;
		W.optionGroupDuration[1]=3;
		W.optionGroupDuration[2]=15;
		W.optionGroupDuration[3]=3;
		
		//Skrzy¿owanie V
		optionA = new Option(trzydziesciszescA,trzydziesciA,1000);
		optionB = new Option(trzydziesciszescB,trzydziesciB,1000);
		optionC = new Option(trzydziesciszescC,trzydziesciC,1000);
		optionD = new Option(trzydziescipiecC,trzydziesciC,1000);
		V.options.add(optionA);
		V.options.add(optionB);
		V.options.add(optionC);
		V.options.add(optionD);
		optionA = new Option(trzydziescipiecD,trzydziescisiedemC,500);
		optionB = new Option(trzydziescipiecA,trzynascieA,1000);
		optionC = new Option(trzydziescipiecD,trzydziescisiedemD,500);
		V.options.add(optionA);
		V.options.add(optionB);
		V.options.add(optionC);
		
		//Skrzy¿owanie ZE
		optionA = new Option(dwadziesciaosiemB,dwadziesciasiedemA,700);
		optionB = new Option(dwadziesciaosiemB,dwadziesciaszescB,300);
		optionC = new Option(dwadziesciasiedemB,dwadziesciaszescB,700);
			optionC.collides.add(optionB);
		optionD = new Option(dwadziesciaszescA,dwadziesciaosiemA,700);
		optionE = new Option(dwadziesciaszescA,dwadziesciasiedemA,300);
			optionE.collides.add(optionA);
			optionE.collides.add(optionB);
		optionF = new Option(dwadziesciasiedemB,dwadziesciaosiemA,300);
			optionF.collides.add(optionB);
			optionF.collides.add(optionD);
			optionF.collides.add(optionE);
		ZE.options.add(optionA);
		ZE.options.add(optionB);
		ZE.options.add(optionC);
		ZE.options.add(optionD);
		ZE.options.add(optionE);
		ZE.options.add(optionF);
		
		//Skrzy¿owanie X
		optionA = new Option(trzydziesciA,dwadziesciaszescA,400,0);
		optionB = new Option(trzydziesciA,dwadziesciadziewiecA,600,0);
		optionC = new Option(trzydziesciB,dwadziesciadziewiecB,1000,0);
		optionD = new Option(trzydziesciC,dwadziesciadziewiecC,1000,0);
		optionE = new Option(dwadziesciaszescB,dwadziesciadziewiecA,500,2);
		optionF = new Option(dwadziesciaszescB,dwadziesciadziewiecB,500,2);
		X.options.add(optionA);
		X.options.add(optionB);
		X.options.add(optionC);
		X.options.add(optionD);
		X.options.add(optionE);
		X.options.add(optionF);
		X.optionGroupDuration[0]=45;
		X.optionGroupDuration[1]=3;
		X.optionGroupDuration[2]=15;
		X.optionGroupDuration[3]=3;
		
		
		//Skrzy¿owanie ZA
		
		optionA = new Option(trzydziesciosiemA,czterdziescijedenA,1000,0);
		optionB = new Option(trzydziesciosiemB,czterdziescijedenB,1000,0);
		optionC = new Option(trzydziesciosiemC,czterdziescijedenC,400,0);
		optionD = new Option(trzydziesciosiemC,czterdziesciB,300,0);
		optionE = new Option(trzydziesciosiemC,czterdziesciC,300,0);
		ZA.options.add(optionA);
		ZA.options.add(optionB);
		ZA.options.add(optionC);
		ZA.options.add(optionD);
		ZA.options.add(optionE);	
		optionA = new Option(trzydziescisiedemD,czterdziescidwaA,700,2);
		optionB = new Option(czterdziesciA,trzydziescidziewiecC,700,2);
		optionC = new Option(czterdziesciA,czterdziescidwaB,300,2);
		optionD = new Option(trzydziescisiedemD,czterdziescidwaC,300,2);
			optionD.collides.add(optionC);
		ZA.options.add(optionA);
		ZA.options.add(optionB);
		ZA.options.add(optionC);
		ZA.options.add(optionD);
		ZA.optionGroupDuration[0]=45;
		ZA.optionGroupDuration[1]=3;
		ZA.optionGroupDuration[2]=15;
		ZA.optionGroupDuration[3]=3;
		
		//Skrzy¿owanie ZB
		
		optionA = new Option(czterdziescijedenA,trzydziescidziewiecA,400);
		optionB = new Option(czterdziescijedenA,trzydziescisiedemA,300);
		optionC = new Option(czterdziescijedenA,trzydziescisiedemB,300);
		optionD = new Option(czterdziescijedenB,trzydziescidziewiecB,1000);
		optionE = new Option(czterdziescijedenC,trzydziescidziewiecB,1000);
		ZB.options.add(optionA);
		ZB.options.add(optionB);
		ZB.options.add(optionC);
		ZB.options.add(optionD);
		ZB.options.add(optionE);	
		optionA = new Option(czterdziescidwaB,trzydziescisiedemA,500);
		optionB = new Option(czterdziescidwaB,trzydziescisiedemB,500);
		optionC = new Option(czterdziescidwaA,czterdziesciB,500);
		optionD = new Option(czterdziescidwaA,czterdziesciC,500);
		ZB.options.add(optionA);
		ZB.options.add(optionB);
		ZB.options.add(optionC);
		ZB.options.add(optionD);
		
		//Skrzy¿owanie ZG
		optionA = new Option(trzydziescidziewiecA,czterdziescitrzyA,1000,0);
		optionB = new Option(trzydziescidziewiecB,czterdziescitrzyB,1000,0);
		optionC = new Option(trzydziescidziewiecC,jedenB,400,0);
		optionD = new Option(trzydziescidziewiecC,czterdziescitrzyC,600,0);
		optionE = new Option(jedenA,czterdziescitrzyB,500,2);
		optionF = new Option(jedenA,czterdziescitrzyC,500,2);
		ZG.options.add(optionA);
		ZG.options.add(optionB);
		ZG.options.add(optionC);
		ZG.options.add(optionD);
		ZG.options.add(optionE);
		ZG.options.add(optionF);
		ZG.optionGroupDuration[0]=45;
		ZG.optionGroupDuration[1]=3;
		ZG.optionGroupDuration[2]=15;
		ZG.optionGroupDuration[3]=3;
		
		//Skrzy¿owanie ZH
		optionA = new Option(jedenB,dwaA,400);
		optionB = new Option(jedenB,jedenD,600);
		optionC = new Option(jedenC,jedenA,600);
		optionD = new Option(jedenC,dwaA,400);
			optionD.collides.add(optionA);
			optionD.collides.add(optionB);
		ZH.options.add(optionA);
		ZH.options.add(optionB);
		ZH.options.add(optionC);
		ZH.options.add(optionD);
		
		//Skrzy¿owanie ZI
		optionA = new Option(dwaA,trzyA,700);
		optionB = new Option(dwaA,dwaB,300);
		ZI.options.add(optionA);
		ZI.options.add(optionB);
		
		
		//Skrzy¿owanie ZM
		optionA = new Option(dwaB,dwaC,900);
		optionB = new Option(dwaB,czteryA,100);
		optionC = new Option(czteryB,dwaC,1000);
			optionC.collides.add(optionA);
		ZM.options.add(optionA);
		ZM.options.add(optionB);
		ZM.options.add(optionC);
		
		
		//Skrzy¿owanie T
		optionA = new Option(trzydziescidwaA,trzydziescijedenA,600,0);
		optionB = new Option(trzydziescidwaA,siedemA,400,0);
		optionC = new Option(trzydziescidwaB,trzydziescijedenB,1000,0);
		optionD = new Option(trzydziescidwaC,trzydziescijedenC,1000,0);
		optionE = new Option(siedemB,trzydziescijedenB,500,2);
		optionF = new Option(siedemB,trzydziescijedenA,500,2);
		T.options.add(optionA);
		T.options.add(optionB);
		T.options.add(optionC);
		T.options.add(optionD);
		T.options.add(optionE);
		T.options.add(optionF);
		T.optionGroupDuration[0]=45;
		T.optionGroupDuration[1]=3;
		T.optionGroupDuration[2]=15;
		T.optionGroupDuration[3]=3;
		
		
		//Skrzy¿owanie ZJ
		optionA = new Option(czterdziescitrzyA,czterdziesciszescA,1000,0);
		optionB = new Option(czterdziescitrzyB,czterdziesciszescB,1000,0);
		optionC = new Option(czterdziescitrzyC,czterdziesciszescC,1000,0);
		optionD = new Option(czterdziesciczteryD,czterdziescisiedemA,1000,2);
		optionE = new Option(czterdziesciczteryC,czterdziescisiedemB,1000,2);
		ZJ.options.add(optionA);
		ZJ.options.add(optionB);
		ZJ.options.add(optionC);
		ZJ.options.add(optionD);
		ZJ.options.add(optionE);
		ZJ.optionGroupDuration[0]=45;
		ZJ.optionGroupDuration[1]=3;
		ZJ.optionGroupDuration[2]=15;
		ZJ.optionGroupDuration[3]=3;
		
		
		//Skrzy¿owanie ZZ
		optionA = new Option(czterdziesciszescC,czterdziescipiecC,1000);
		optionB = new Option(czterdziesciszescB,czterdziescipiecB,1000);
		optionC = new Option(czterdziesciszescA,czterdziesciczteryA,200);
		optionD = new Option(czterdziesciszescA,czterdziesciczteryB,200);
		optionE = new Option(czterdziesciszescA,czterdziescipiecA,600);
		ZZ.options.add(optionA);
		ZZ.options.add(optionB);
		ZZ.options.add(optionC);
		ZZ.options.add(optionD);
		ZZ.options.add(optionE);
		optionA = new Option(czterdziescisiedemA,czterdziescipiecB,1000);
		optionB = new Option(czterdziescisiedemB,czterdziescipiecA,1000);
		ZZ.options.add(optionA);
		ZZ.options.add(optionB);
		
		//Skrzy¿owanie BZ
		optionA = new Option(czterdziescidziewiecD,czterdziescidziewiecB,400);
		optionB = new Option(czterdziescidziewiecD,czterdziescidziewiecC,600);
		BZ.options.add(optionA);
		BZ.options.add(optionB);
		
		//Skrzy¿owanie AA
		optionA = new Option(czterdziesciosiemA,czterdziescidziewiecA,500,0);
		optionB = new Option(czterdziesciosiemA,piecdziesiatA,500,0);
		optionC = new Option(czterdziesciosiemB,piecdziesiatB,1000,0);
		optionD = new Option(czterdziesciosiemC,piecdziesiatC,1000,0);
		optionE = new Option(czterdziesciczteryB,piecdziesiatjedenC,500,4);
		optionF = new Option(czterdziesciczteryB,piecdziesiatjedenD,500,4);
		AA.options.add(optionA);
		AA.options.add(optionB);
		AA.options.add(optionC);
		AA.options.add(optionD);
		AA.options.add(optionE);
		AA.options.add(optionF);
		optionA = new Option(czterdziescidziewiecC,trzydziescidwaA,1000,2);
		optionB = new Option(czterdziescidziewiecB,piecdziesiatjedenA,1000,2);
		optionC = new Option(czterdziesciczteryA,piecdziesiatjedenB,1000,2);
		AA.options.add(optionA);
		AA.options.add(optionB);
		AA.options.add(optionC);
		AA.optionGroupDuration[0]=39;
		AA.optionGroupDuration[1]=3;
		AA.optionGroupDuration[2]=12;
		AA.optionGroupDuration[3]=3;
		AA.optionGroupDuration[4]=6;
		AA.optionGroupDuration[5]=3;
		
		
		//Skrzy¿owanie AB
		optionA = new Option(piecdziesiatA,trzydziescidwaA,1000);
		optionB = new Option(piecdziesiatB,trzydziescidwaB,1000);
		optionC = new Option(piecdziesiatC,trzydziescidwaC,900);
		optionD = new Option(piecdziesiatC,czterdziesciczteryD,100);
		optionE = new Option(piecdziesiatjedenA,czterdziesciczteryC,500);
		optionF = new Option(piecdziesiatjedenA,czterdziesciczteryD,500);
		AB.options.add(optionA);
		AB.options.add(optionB);
		AB.options.add(optionC);
		AB.options.add(optionD);
		AB.options.add(optionE);
		AB.options.add(optionF);
		optionA = new Option(piecdziesiatjedenB,czterdziescidziewiecA,1000);
		optionB = new Option(piecdziesiatjedenC,trzydziescidwaC,1000);
		optionC = new Option(piecdziesiatjedenD,trzydziescidwaB,1000);
		AB.options.add(optionA);
		AB.options.add(optionB);
		AB.options.add(optionC);
		
		
		
		// Dodawanie skrzy¿owañ
		crossoverList.add(A);
		crossoverList.add(B);
		crossoverList.add(C);
		crossoverList.add(D);
		crossoverList.add(E);
		crossoverList.add(F);
		crossoverList.add(G);
		crossoverList.add(H);
		crossoverList.add(I);
		crossoverList.add(J);
		crossoverList.add(K);
		crossoverList.add(L);
		crossoverList.add(M);
		crossoverList.add(N);
		crossoverList.add(O);
		crossoverList.add(U);
		crossoverList.add(P);
		crossoverList.add(S);
		crossoverList.add(T);
		crossoverList.add(W);
		
		// Œwietlnych
		
		lightCrossoverList.add(W);
		lightCrossoverList.add(X);
		lightCrossoverList.add(ZA);
		lightCrossoverList.add(ZG);
		lightCrossoverList.add(T);
		lightCrossoverList.add(ZJ);
		lightCrossoverList.add(AA);
		
		
		
		
	}
	
	void startingCarSpawner(Spawner sp){
		RandomGenerator rg = RandomGenerator.getInstance();
		Car car;
		
		Iterator<Street> it = streetList.iterator();
		while(it.hasNext()){
			  Street street = it.next();
			  int length = street.streetParts.length;
			  for(int i=0; i<length;i++){
				  int p = rg.probability();
				  
				  if(p<Parameters.startingSpawn){
					  car = new Car(street,i);
					  sp.carList.add(car);
				  }
			  }
		}
	}
}
