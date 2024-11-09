public class Ascend {
	public static void main(String[] args) {

		int lim = Integer.parseInt(args[0]);
		int a = (int) ((Math.random() * lim));
		int b = (int) ((Math.random() * lim));
		int c = (int) ((Math.random() * lim));
		System.out.println(a + " " + b + " " + c);

		int min = Math.min(a, b);
		min = Math.min(min, c) ; // finding the min number
		int max = Math.max(a, b);
		max = Math.max(max, c); // finding the max number
		int mid = (a + b + c) - (max + min); // calculating the middle number
		System.out.println(min + " " + mid + " " + max);


	}
}
