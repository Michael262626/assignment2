import java.util.Scanner;
public class Table2{
public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number between 1-10: ");
	int digit = scanner.nextInt();

	int count = 1;
	if(digit <= 0 || digit > 10){
	System.out.print("Why are you wicked :( re-enter number in the range 1 - 10");
	}

	else{
	while(count <= 12){
		int multiple = digit*count;
	System.out.printf("%d x %d = %d%n",digit,count,multiple);

	count++;
	
}
	
}	



}
}
