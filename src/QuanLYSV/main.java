package QuanLYSV;

import java.util.Scanner;

public class main {
    private static QuanLYSV[] ListSV;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
menu();
    }
    private static void menu(){
        while (true){
            System.out.println("Quan lý SV");
            System.out.println("1.nhập vào sinh vieen: ");
            System.out.println("2.hiển thị các sinh viên: ");
            System.out.println("3.tìm kiếm sinh viên theo tên: ");
            System.out.println("nhap số tương ứng với các chức năng thực hiên: ");
            int so = Integer.parseInt(sc.nextLine());

            switch (so){
                case 1:
                    nhapSinhVien();
                    break;
                case 2:
                    inttSV();
                case 3:
                    timKiemSinhVien();
            }
        }
    }

    private static void timKiemSinhVien() {
        System.out.println("Moi ban nhap vao ten sinh vien can tim kiem: ");
        String ten = sc.nextLine();
        System.out.println("Ket qua tim kiem la: ");
        for (int i = 0; i < QuanLYSV.length; i++) {
            if (ListSV[i].getTen().equals(ten)){
                ListSV[i].inttSV();
            }
        }
    }

    private static void inttSV() {
        for (int i = 0; i < ListSV.length; i++) {
            ListSV[i].inttSV();
        }
    }

    private static void nhapSinhVien(){
        System.out.println("Moi ban nhap so luong sinh vien can nhap: ");
        int so = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < so; i++) {
            System.out.println("Moi ban nhap vao ten sinh vien thu: " + (i + 1));
            String ten = sc.nextLine();
            System.out.println("Moi ban nhap vao tuoi sinh vien thu: " + (i + 1));
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.println("Moi ban nhap vao nam sinh sinh vien thu: " + (i + 1));
            int namSinh = Integer.parseInt(sc.nextLine());
            System.out.println("Moi ban nhap vao trinh do van hoa sinh vien thu: " + (i + 1));
            String trinhDoVanHoa = sc.nextLine();
            System.out.println("Moi ban nhap vao gioi tinh sinh vien thu: " + (i + 1));
            int gioiTinh = Integer.parseInt(sc.nextLine());
            QuanLYSV sv = new QuanLYSV(ten, tuoi, namSinh, trinhDoVanHoa, gioiTinh);
            ListSV[i] = sv;
        }

    }
}

