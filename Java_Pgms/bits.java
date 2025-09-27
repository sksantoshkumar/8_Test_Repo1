package OOPS_Class_Object_Constructor;

public class bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student satish = new student(); //constructor method
		
		satish.name="satish";
		satish.maths=80;
		satish.iot=60;
		satish.ad=75;
		
		satish.average();
		
		System.out.println(satish.name + "\n " + satish.maths + "\n " + satish.iot + 
				"\n " + satish.ad + "\n " + satish.avg);
		

		student jeeva = new student(); //constructor method
		
		jeeva.name="jeeva";
		jeeva.maths=90;
		jeeva.iot=95;
		jeeva.ad=99;
		jeeva.average();



		System.out.println(jeeva.name + "\n " + jeeva.maths + "\n " + jeeva.iot + 
				"\n " + jeeva.ad + "\n " + jeeva.avg);
		
		

	}

}
