import java.util.Scanner;

public class magic8 {
			
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
	    String cadena=entrada.nextLine();
		int num = (int) (Math.random()*8)+1;
		System.out.println(ballControl(num));
	}
	
	public static String ballControl(int num) {
		switch (num) {
			case 0:
				return "Yes";
			case 1:
			    return "No";
			case 2:
				return "It is certain";
			case 3:
			    return "Cannot predict now";
			case 4:
			    return "Do not count on it";
			case 5:
				return "Hahahahha, no.";
			case 6:
				return "Of course";
			case 7:
			    return "Signs point to yes";
			default:
				break;
			}
      return null;
	}
}
