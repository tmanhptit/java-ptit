package Algorithm;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LocalDatee {
	public static void main(String[] args) throws IOException{
		String d1="15/11/2023";
		String d2="16/11/2023";
		DateTimeFormatter fo=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate l1=LocalDate.parse(d1,fo);
		LocalDate l2=LocalDate.parse(d2,fo);
		System.out.println(ChronoUnit.);
		
	}

	
	}

}
