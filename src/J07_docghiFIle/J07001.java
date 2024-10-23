package J07_docghiFIle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class code77_Docfile {
public static void main(String[] args) throws FileNotFoundException {
	Scanner sc=new Scanner(new File("DATA.in"));
	while(sc.hasNext()) {
		System.out.println(sc.nextLine());
	}
}
}

