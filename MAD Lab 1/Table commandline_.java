public class Main
{
	public static void main(String[] args) {
		for(int i=1; i<=10; i++){
		    System.out.printf ("%s x %d = %d\n", args[0], i, Integer.parseInt(args[0]) * i);
		}
	}
}