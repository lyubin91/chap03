
public class Exercise3_2 {

	public static void main(String[] args) {
		int numofApple = 123;
		int sizeofBucket = 10;
		int numofBucket = (numofApple/sizeofBucket);
		if (numofApple%sizeofBucket == 0) {
			System.out.println(numofBucket);
		} else {
			System.out.println(numofBucket+1);
		}
		
		
	}
}
