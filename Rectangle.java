class Rectangle extends Shape{ /*This class has the data for rectangle. */
	double width, height;

	Rectangle(double width, double height){
		super();
		this.width = width;
		this.height = height;
	}
	public void getArea(){
		area = width*height;
		System.out.println("Area of Rectangle : " + area);
	}
	
}