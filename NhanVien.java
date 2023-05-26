package QLCN;

public class NhanVien extends CanBo{
    private String congViec;
    
    public NhanVien(){
        super();
    }
    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec ){
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }
    public String getCongViec() {
        return congViec;
    }
    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    @Override
    public void display(){
        super.display();
        System.out.println( "NhanVien [congViec=" + getCongViec() + "]");
    }
    @Override
    public String toString() {
        return "NhanVien [congViec=" + congViec + "]";
    }
    
    
}
