package Algorithm;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class in_outputfile {
	public static void main(String[] args)throws IOException,ClassNotFoundException {
        // Tạo một ArrayList<String>
        List<String> danhSachChuoi = new ArrayList<>();
       // danhSachChuoi.add("Mạnh thực sự là vô cùng đẹp trai, yêu ai cũng thật lòng");
       danhSachChuoi.add("Thật là tuyệt vời khi gặp em");
       danhSachChuoi.add("lại ghét em rồi");

        // Đường dẫn của file
        String duongDanFile = "E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\J07_docghiFIle\\MissYou.txt";

       
            // Mở file để ghi đối tượng
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(duongDanFile));
            objectOutputStream.writeObject(danhSachChuoi);
            // Đóng file sau khi ghi
            objectOutputStream.close();

            System.out.println("Dữ liệu đã được lưu vào file thành công.");
        docDuLieuTuFile(duongDanFile);
	}
	private static void docDuLieuTuFile(String duongDanFile) {
		try {
			// Mở file để đọc đối tượng
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(duongDanFile));

			// Đọc đối tượng từ file (ArrayList<String>)
			List<String> danhSachChuoiDocDuoc = (List<String>) objectInputStream.readObject();

			// In ra màn hình để kiểm tra
			System.out.println("Dữ liệu đọc từ file:");
			for (String chuoi : danhSachChuoiDocDuoc) {
				System.out.println(chuoi);
			}

			// Đóng file sau khi đọc
			objectInputStream.close();
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Có lỗi xảy ra khi đọc dữ liệu từ file: " + e.getMessage());
		}
	}
}
