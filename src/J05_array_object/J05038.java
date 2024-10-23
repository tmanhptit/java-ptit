Tinh_thu_nhap_cho_nhan_vien/Main.java
package Tinh_thu_nhap_cho_nhan_vien;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NV nv[] = new NV[n];
        DecimalFormat df = new DecimalFormat("00");
        for(int i = 0; i < n ; i++){
            sc.nextLine();
            nv[i] = new NV("NV" + df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        for(int i=0; i<n ; i++){
            System.out.printf("%s %s %.0f %.0f %.0f %.0f\n", nv[i].ma, nv[i].ten, nv[i].luongcv, nv[i].luongchinh, nv[i].tam_ung, nv[i].conlai);
        }

    }
}

Tinh_thu_nhap_cho_nhan_vien/NV.java
package Tinh_thu_nhap_cho_nhan_vien;

public class NV {
    public String ma, ten, chucvu;
    public double luongcv, luongchinh, tam_ung, conlai;

    public NV(String ma, String ten, String chucvu, double luongcoban, double ngaycong){
        this.ma = ma;
        this.ten = ten;
        if(chucvu.equals("GD")) this.luongcv = 500;
        else if(chucvu.equals("PGD")) this.luongcv = 400;
        else if(chucvu.equals("TP")) this.luongcv = 300;
        else if(chucvu.equals("KT")) this.luongcv = 250;
        else this.luongcv = 100;
        this.luongchinh = luongcoban*ngaycong;
        if((this.luongchinh + this.luongcv)*2/3 <25000)
             this.tam_ung = Math.round((this.luongchinh+this.luongcv)*2/3/1000)*1000;
        else this.tam_ung = 25000;
        this.conlai = this.luongchinh + this.luongcv - this.tam_ung;
    }
}