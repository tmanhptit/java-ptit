package GhiDocFIle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.*;
import java.io.*;

public class code77_Docfile {
    public static void main(String args[]) throws FileNotFoundException {
       Scanner in = new Scanner(new File("DATA.in"));
       long kq = 0;
       while(in.hasNext()){
           String tmp = in.next();
           try {
               kq = kq + Integer.parseInt(tmp);
           } catch (NumberFormatException e) {
               continue;
           }
       }
        System.out.println(kq);
    }
}
