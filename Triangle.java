class Triangle extends Shape{
	double base, height;

	Triangle(double base, double height){
		super();
		this.base = base;
		this.height = height;
	}
	public void getArea(){
		
		area = 0.5*base*height;
		System.out.println("Area of Triangle : " +area);
	}
	
}
