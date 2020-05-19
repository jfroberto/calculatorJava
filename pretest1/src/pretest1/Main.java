package pretest1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		Scanner text = new Scanner(System.in);		
				
		float fnum, snum, sum, diff, mult, div;
		int mod;
		String choose;
		
		System.out.print("Enter the First Number: ");
		fnum = number.nextFloat();
		System.out.print("Enter the Second Number: ");
		snum = number.nextFloat();
		
		System.out.print("Choose an Operator: ");
		choose = text.nextLine();
		
		if (choose.contentEquals("1")) {
		sum = fnum + snum;
		System.out.print(+fnum +" + " +snum +" = " +sum);
		}
		
		else if (choose.contentEquals("2")) {
		diff = snum - fnum;
		System.out.print(+snum +" - " +fnum +" = " +diff);
		}
		
		else if (choose.contentEquals("3")) {
		mult = fnum * snum;
		System.out.print(+fnum +" * " +snum +" = " +mult);
		}
		
		else if (choose.contentEquals("4")) {
		
		div = fnum / snum;
		mod = (int)fnum % (int)snum;
		System.out.println(+fnum +" / " +snum +" = " +div);
		System.out.println("Modules of " +mod);
		}
		
		else {
			
			System.out.print("Wrong Choice!!!");
		}
		
		
	}

}