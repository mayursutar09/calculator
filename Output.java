package calculator;

import java.util.Scanner;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		
		while (true) {
			CalImplementation ob1=new CalImplementation();
			System.out.println("Enter:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Suare\n6.Cube\n7.Modulus");
			int a=sc1.nextInt();
			try {
				switch (a) {
				case 1: {
					ob1.input1();
					System.out.println("Addition: "+ob1.Addition());
					break;
				}
				case 2: {
					ob1.input1();
					System.out.println("Addition: "+ob1.Sub());
					break;
						}
				case 3: {
					ob1.input1();
					System.out.println("Addition: "+ob1.Mul());
					break;
				}
				case 4: {
					ob1.input1();
					System.out.println("Addition: "+ob1.div());
					break;
				}
				case 5: {
					ob1.input2();
					System.out.println("Addition: "+ob1.sqr());
					break;
				}
				case 6: {
					ob1.input2();
					System.out.println("Addition: "+ob1.cube());
					break;
				}
				case 7: {
					ob1.input1();
					System.out.println("Addition: "+ob1.mod());
					break;
				}
				default:
					throw new IllegalArgumentException("Number formate");
				}
				if (a>7) {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
