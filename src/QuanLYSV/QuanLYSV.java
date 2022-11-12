package QuanLYSV;

public class QuanLYSV {
    public static int length;
    private String  ten;
        private int tuoi;
        private int namsinh;
        private String trindovanhoa;
        private String gioitinh;

        public QuanLYSV(String ten, int tuoi, int namsinh, String trindovanhoa, int gioitinh) {
            this.ten = ten;
            this.tuoi = tuoi;
            this.namsinh = namsinh;
            this.trindovanhoa = trindovanhoa;
            this.gioitinh = String.valueOf(gioitinh);
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        public int getNamsinh() {
            return namsinh;
        }

        public void setNamsinh(int namsinh) {
            this.namsinh = namsinh;
        }

        public String getTrindovanhoa() {
            return trindovanhoa;
        }

        public void setTrindovanhoa(String trindovanhoa) {
            this.trindovanhoa = trindovanhoa;
        }

        public String getGioitinh() {
            return gioitinh;
        }

        public void setGioitinh(String gioitinh) {
            this.gioitinh = gioitinh;
        }
        public void inttSV(){
            System.out.println("thông tin sinh viên");
            System.out.println("tên của sv: " + ten + "tuổi của sinh viên: " + tuoi + "năm sinh: " + namsinh + "trình độ van hóa: " + trindovanhoa + "giới tính SV: " + gioitinh);
        }
    }


