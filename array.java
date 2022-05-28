package homework;

import java.util.ArrayList;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 47364, 6387593};
 System.out.println(num.length);
 
 long[] longnum = {5488763,6478,8474,7589,7598,7583};
 System.out.println(longnum.length);
 
 double[] decimalnum= {563247324.99384793, 7345324.034837,7354278.0349364,738647254.000657};
 System.out.println(decimalnum.equals(65465465));
 
 boolean[] result= {true, false, false, true,false,true};
 System.out.println(result.length);
 
// Add to arraylist
 
 ArrayList<String> cars = new ArrayList<String>();
 cars.add("Maruthi");
 cars.add("Tesla");
 cars.add("BMW");
 cars.add("Audi");
 cars.add("HondaCRV");
 cars.set(2, "toyota");
 System.out.println(cars);
 System.out.println(cars.get(3));
 System.out.println(cars.remove(4));
 System.out.println(cars);
 System.out.println(cars.size());
 System.out.println(cars);
// System.out.println(cars.set(1, "Mustang")); why is it not updating?
 

	}

}
