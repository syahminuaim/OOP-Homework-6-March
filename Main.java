import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of data: ");
		int numdata = scanner.nextInt();
		
		Marks marks = new Marks(numdata);
		marks.createData();
		PrincipalName principalName = new PrincipalName("Dato", "Zubair");
		Address address = new Address("No 66, Jalan Enam", "66666", " Batu Caves", "Selangor");
		School school = new School("Sekolah Enam Rambutan",address,principalName,marks);
	
		school.setNumberParticipants();
		System.out.println(school.toString());
		System.out.printf("Average Score     : %.2f",marks.average());
		System.out.printf("\nStandard Deviation: %.2f",marks.stanDev(marks.average()));
	}
}
