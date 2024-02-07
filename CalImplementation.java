package calculator;

import java.util.Scanner;

public class CalImplementation implements InterfaceCal{
	Scanner sc1=new Scanner(System.in);
	double a;
	double b;
	public void input1() {
		System.out.println("Enter num1: ");
		double a=sc1.nextDouble();
		System.out.println("Enter num2: ");
		double b=sc1.nextDouble();
		this.a=a;
		this.b=b;
	}
	public void input2() {
		System.out.println("Enter num1: ");
		double a=sc1.nextDouble();
		this.a=a;
	}
	public void anim() {
		for (int i = 0; i < 6; i++) {
			try {
				Thread.sleep(300);
				System.out.print("*");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	@Override
	public double Addition() {
		// TODO Auto-generated method stub
		anim();
		double result=a+b;
		return result;
	}

	@Override
	public double Sub() {
		// TODO Auto-generated method stub
		anim();
		double result=a-b;
		return result;
	}

	@Override
	public double Mul() {
		// TODO Auto-generated method stub
		anim();
		double result=a/b;
		return result;
	}

	@Override
	public double div() {
		// TODO Auto-generated method stub
		anim();
		double result=a+b;
		return result;
	}

	@Override
	public double sqr() {
		// TODO Auto-generated method stub
		double result=Math.pow(a, 2);
		return result;
	}

	@Override
	public double cube() {
		// TODO Auto-generated method stub
		double result=Math.pow(a, 3);
		return result;
	}

	@Override
	public double mod() {
		// TODO Auto-generated method stub
		double result=a%b;
		return result;
	}
	
}
