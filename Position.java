public class Position{
	private int x,y;
	/* est-ce qu'il ne faut pas faire une liste pour stocker les posisitions?
	 cf 1er § de modé des dépl*/
	public Position( int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Position (){
		this.x;
		this.y;
	}
	
	public Position add(Direction d){
		return new Position(x+d.x, y+d.y);
	}
	
	public Position sub(Direction d){
		return new Position(x-d.x, y-d.y);
	}
	
	public boolean equals(Position p){
		return p.x==x && p.y==y;
		
	}
	
	public Position add(Direction direc){
		
	}
}
