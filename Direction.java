public enum Direction{
	HAUT, BAS, GAUCHE, DROITE;
	
	public Direction(){
		HAUT = (0,-1);
		BAS = (0,1);
		GAUCHE = (-1,0);
		DROITE = (1,0);
	}
	
	public ArrayList<Direction> getDirection(){
		return {HAUT,BAS,GAUCHE,DROITE};
		
	}
}
	
	
		
		
