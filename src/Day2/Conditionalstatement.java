package Day2;

public class Conditionalstatement {

	public static void main(String[] args) {
		int num = 25;
		int num2 = 28;

		if (num == num2) {
			System.out.println("num and num2 are equal :");
		}
		
		 { System.out.println("num and num2 are not equal :"); }
		 

		int chair = 25;
		int table = 56;
		if (chair < table) {
			System.out.println("table is greater :");
		} else {
			System.out.println("chair is greater   :");

		}

	int car = 1;
		int bike = 3;

		if (bike > car) {
			System.out.println("bike is greater :");
		} else {
			System.out.println("car is greater   :");

		}

		int fan = 11;
		int ac = 3;

		if (ac == fan) {
			System.out.println("ac is greater :");
		} else if(ac >= fan) {
			System.out.println("ac  is not greater   :");

		}
		
		else
		{     System.out.println("not valid");
		
		}
		String things = "lap";
		switch (things) {
		case "mobile":
			System.out.println("mobile.....");
			break;

		case "laptop":
			System.out.println("laptop.....");
			break;

		case "computer":
			System.out.println("computer.....");
			break;
		default:
			System.out.println("you select invalid.....");
			break;

		}
		
		
		
		int a=10, b=50, c = 20;
		
		if((a>b) && (a>c)) {
			System.out.println(a);
		}
		else if((b>a)&& (b>c)) {
			System.out.println(b);

		} else {
			System.out.println(c);

		}
	}
}
