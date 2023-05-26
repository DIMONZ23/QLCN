package QLCN;

public class CongNhan extends CanBo{
    private int bac;
    
    public CongNhan(){
        super();
    }
    
    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
       super(hoTen, tuoi, gioiTinh, diaChi);
       this.bac=bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
    @Override
   public void display(){
        super.display();
        System.out.println( "CongNhan [bac=" + getBac() + "]");
    }

@Override
public String toString() {
    return "CongNhan [bac=" + bac + "]";
}
    
    


}