import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] arr = new int[length];
		for(int i =0; i<arr.length; i++){
			arr[i] = scanner.nextInt();
		}
		int a = arr[0];
		for(int i = 0; i<arr.length-1; i++ ){
			int c = (a-arr[i+1]);
			int k = (c>>>31);
			a = a-k*c;
		}
		System.out.println(a);
	}
}

