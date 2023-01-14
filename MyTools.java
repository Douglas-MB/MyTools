
import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public abstract class MyTools {
	static Random random = new Random();
	static int[] matrix;

	public static int[] matrixRng(int size, int rangeNum){
		matrix = new int[size];
		for (int i = 0; i < matrix.length; i++) {
			matrix[i]= MyTools.rng(rangeNum);
		}
		return matrix;

	}
	public static int[] matrixSorted(int size){
		size = size +1;
		matrix = new int[size];

		for (int i = 0; i < size; i++) {
			matrix[i]= i;
		}
		return matrix;
	}
	public static int rng(int range) {
		
		return random.nextInt(range);
	}

	public static char monoSpace() {
		return ' ';
	}

	public static void clean() {
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (IOException | InterruptedException ex) {
		}
	}

	public static Scanner scan() {
		System.out.print(">");
		return new Scanner(System.in).useLocale(Locale.US);

	}



}