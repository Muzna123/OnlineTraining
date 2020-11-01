package ifBlock;

public class DrivingPolice {
public static void main(String[] args) {
	int speed=68;
	boolean Bday=true;
	if(Bday!=true) {
	if(speed<=60)
		System.out.println(0);
	else if(speed>60||speed<=80)
	System.out.println(1);
	else
	System.out.println(2);
	}
	else
	{
		if(speed<=65)
			System.out.println(0);
		else if(speed>65||speed<=85)
		System.out.println(1);
		else
		System.out.println(2);
		
		

}
}
}