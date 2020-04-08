class Canvas{
	public List<Points> points;


	public void addPoints(){
	points.add(1);
	}

	public void removePoints(){
	points.remove(1);
	}

}

class Point {
	String id
	double x,y;

	//TODO add new variable
	String color;

	//TODO constructor
	Point(String id, double x, double y, String color){
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}
	//TODO setters and getters
	public String setID(String id){
	this.id = id;
	}
	
	public String getID(){
	return this.id;
	}
	
	public double setX(double x){
	this.x = x;
	}

	public double getX(){
	return this.x;
	}
	
	public double setY(double y){
	this.y = y;
	}

	public double getY(){
	return this.y;
	}

	public String setColor(String color){
	this.color = color;
	}

	public String getColor(){
	return this.color;
	}	
	
	public void move (char xDirection, char yDirection) {
		//TODO
	}

	public void draw (Grafika g) {
		//TODO
	private double radius;
	g.setColor(color);
      	g.fillOval((int)(x-radius), (int)(y-radius), (int)(2*radius), (int)(2*radius));
	}



}

