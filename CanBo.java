package QLCN;

public class CanBo {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    public CanBo() {
    }
    public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    public String getHoTen() {
        return hoTen;
    }
    public int getTuoi() {
        return tuoi;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
   public void display(){
    System.out.println("Ho ten: "+getHoTen());
    System.out.println("Tuoi: "+getTuoi());
    System.out.println("Gioi tinh: "+getGioiTinh());
    System.out.println("Dia chi: "+getDiaChi());

   }
@Override
public String toString() {
    return "CanBo [hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + "]";
}
   
    
    
}
