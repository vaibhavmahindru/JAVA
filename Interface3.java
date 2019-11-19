//Program to show the usefulness of Interfaces as a place to keep constant value of the program
import java.util.*;
interface area{
	
	float pi = 3.14f;
	void area(float x, float y);
}

class circle implements area{

	public void area(float x, float y){
	
		System.out.println(pi*x*x);
}
}

class rectangle implements area{

	public void area(float x, float y){
	
		System.out.println(x*y);


}
}

public class Interface3{

	public static void main(String [] args){

	circle c = new circle();
	c.area(10,0);
	rectangle r = new rectangle();
	r.area(10,20);
}
}
