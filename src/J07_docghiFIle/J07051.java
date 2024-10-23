package J07_docghiFIle;

import java.util.Date;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
import java.io.File;

public class J07051 {
	public static String chuan(String a) {
		String[] l = a.split("/");
		return String.format("%02d/%02d/%04d", Integer.parseInt(l[0]), Integer.parseInt(l[1]), Integer.parseInt(l[2]));
	}

	public static long chenh(String den, String di) {
		DateTimeFormatter dfs = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate in = LocalDate.parse(den, dfs);
		LocalDate out = LocalDate.parse(di, dfs);
		return ChronoUnit.DAYS.between(in, out) + 1;
	}

	public static void main(String[] args) throws IOException {

		String path = "E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\SV.in.txt";
		Scanner sc = new Scanner(new File(path));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<kh> ds = new ArrayList<kh>();
		int dem = 0;
		while (n-- > 0) {
			dem++;
			String ten = sc.nextLine();
			String sophong = sc.nextLine().trim();
			String den = sc.nextLine().trim();
			String di = sc.nextLine().trim();
			long phatsinh = Long.parseLong(sc.nextLine().trim());

			ds.add(new kh(dem, ten, sophong, chenh(chuan(den), chuan(di)), phatsinh));
		}
		Collections.sort(ds);
		for (kh kh : ds) {
			System.out.println(kh);
		}
	}
}

class kh implements Comparable<kh> {
	private String ma, ten, sophong;
	private long songay;
	private long thanhtien;

	public kh(int ma, String ten, String sophong, long songay, long phatsinh) {
		this.ma = String.format("KH%02d", ma);
		Scanner doc = new Scanner(ten);
		String tam = "";
		while (doc.hasNext()) {
			String t = doc.next().toLowerCase();
			tam += t.substring(0, 1).toUpperCase() + t.substring(1, t.length()) + " ";
		}
		this.ten = tam.substring(0, tam.length() - 1);
		this.sophong = sophong;
		this.songay = songay;
		if (sophong.charAt(0) == '1') {
			this.thanhtien = songay * 25 + phatsinh;
		} else if (sophong.charAt(0) == '2') {
			this.thanhtien = songay * 34 + phatsinh;
		} else if (sophong.charAt(0) == '3') {
			this.thanhtien = songay * 50 + phatsinh;
		} else {
			this.thanhtien = songay * 80 + phatsinh;
		}

	}
	@Override
	public String toString() {
		return "" + ma + " " + ten + " " + sophong + " " + songay + " " + thanhtien + "";
	}
	@Override
	public int compareTo(kh o) {
		// TODO Auto-generated method stub
		return Long.compare(o.thanhtien, this.thanhtien);
	}

}
