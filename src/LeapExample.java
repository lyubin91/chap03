import java.util.Random;

public class LeapExample {

	public static void main(String[] args) {
		Random r = new Random();
		int year = r.nextInt(5000)+1;
		
		System.out.println(year);
		String leap = year%4==0 && year%100!=0 ? "윤년" : "평년";
		
		System.out.println(leap);
	}
	
	
	public static void main3(String[] args) {
		double oneYear = 365.2422;
		double tenYear = oneYear * 100;

		System.out.println(tenYear);
		
		System.out.println(366*25 + 365*75);
	}
}
