package assignment3;

public class Main {
    public static void main(String[]args){
        NguoiNcNgoai nc = new NguoiNcNgoai(1,"nam","2020-01-01",50,2000,2000);
        nc.thanh_tien();
        System.out.println("Thành tiền người nước ngoài là: "+nc.getThanh_tien());

        NguoiViet nv = new NguoiViet(1,"nam","2020-01-01",5,2000,20);
        nv.thanh_tien_viet();
        System.out.println("Thành tiền người việt là: "+nv.getThanh_tien_viet());
    }
}