public class gettemp {
public static void main(String[] args){
//Voltage Values 
double[] voltage = {0, 0.25, 0.4, 0.6, 0.8, 1, 1.25, 1.4, 1.6, 1.8};

//Voltage reading
final double voltagein = 0.24;

caltemp(voltage, voltagein);
gettemp();

}//main mathod

public static void gettemp(){
System.out.println("Hello World!");

}//gettemp method
public static void caltemp(double[] voltage, double voltagein){


if(valid(voltagein)){
	if(voltagein == 0){
	System.out.println("Tempreture: 0 °C");	
	}//0

	if(voltagein > 0 && voltagein < 0.25){
	System.out.println("Tempreture: 5 °c");
	}
}

}//caltemp method

public static boolean valid(double voltagein){

if(voltagein < 0 || voltagein > 1.8){
	System.err.println("Voltage Out Of Bound");
	return false;
}//if
	else{
		return true;
	}//else
}//valid method

}//class gettem
