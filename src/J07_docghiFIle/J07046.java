package J07_docghiFIle;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class J07046 {
	public static String chuan(String s) {
		String[] hehe = s.split("/");
		return String.format("%02d/%02d/%04d", Integer.parseInt(hehe[0]),Integer.parseInt(hehe[1]),Integer.parseInt(hehe[2]));
	}
	public static void main(String[] args) throws Exception {
		String path = "E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
		Scanner in = new Scanner(new File(path));
		int dem = 0;
		int n = Integer.parseInt(in.nextLine());
		ArrayList<Client> danhsach = new ArrayList<>();
		while (n-- > 0) {
			dem++;
			String ten = in.nextLine();
			String ma = in.nextLine();
			String put = in.nextLine();
			String out = in.nextLine();

			Client e = new Client(dem, ten, ma, chuan(put), chuan(out));
			danhsach.add(e);
		}
		Collections.sort(danhsach);
		for (Client client : danhsach) {
			System.out.println(client);
		}
	}
}

class Client implements Comparable<Client> {
	private String ma, name, maphong;
	private int ngay;
    private LocalDate in,out;
	public Client(int ma, String name, String maphong, String inn, String out) {
		this.ma = String.format("KH%02d", ma);
		this.name = name;
		this.maphong = maphong;
		DateTimeFormatter dfs= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.in=LocalDate.parse(inn,dfs);
		this.out=LocalDate.parse(out,dfs);
		this.ngay=(int)ChronoUnit.DAYS.between(this.in, this.out);
	}
	@Override
	public String toString() {
		return ma + " " + name + " " + maphong + " " + ngay;
	}
	@Override
	public int compareTo(Client o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.ngay, this.ngay);
	}  
}