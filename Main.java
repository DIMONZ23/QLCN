package QLCN;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCanBo qlcb = new QLCanBo();
        while(true){
            System.out.println("Quan Ly Can Bo");
            System.out.println("1.Them moi can bo.");
            System.out.println("2.Tim kiem theo ten.");
            System.out.println("3.In danh sach can bo.");
            System.out.println("4.Thoat chuong trinh.");
            String line = scanner.nextLine();
            switch(line){
                case "1":{
                    System.out.println("a. Nhap thong tin Cong Nhan.");
                    System.out.println("b. Nhap thong tin ky su.");
                    System.out.println("c. Nhap thong tin nhan vien.");
                    String type = scanner.nextLine();
                    switch(type){
                        case"a":{
                            System.out.println("a. Nhap thong tin Cong Nhan.");
                            System.out.println("Nhap ho ten: ");
                            String hoTen = scanner.nextLine();
                            System.out.println("Nhap tuoi: ");
                            int tuoi= scanner.nextInt();
                            System.out.println("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gioiTinh = scanner.nextLine();
                            System.out.println("Nhap dia chi: ");
                            String diaChi = scanner.nextLine();
                            System.out.println("Nhap bac cong nhan: ");
                            int bac = scanner.nextInt();
                            CanBo congnhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
                            qlcb.addCanBo(congnhan);
                            System.out.println(congnhan.toString());
                            break;

                        }
                        case"b":{
                            System.out.println("b. Nhap thong tin ky su.");
                            System.out.println("Nhap ho ten: ");
                            String hoTen = scanner.nextLine();
                            System.out.println("Nhap tuoi: ");
                            int tuoi= scanner.nextInt();
                            System.out.println("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gioiTinh = scanner.nextLine();
                            System.out.println("Nhap dia chi: ");
                            String diaChi = scanner.nextLine();
                            System.out.println("Nhap nganh dao tao: ");
                            String nganhDaoTao = scanner.nextLine();
                            CanBo kysu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
                            qlcb.addCanBo(kysu);
                            System.out.println(kysu.toString());
                            break;
                        }
                        case"c":{
                            System.out.println("c. Nhap thong tin nhan vien.");
                            System.out.println("Nhap ho ten: ");
                            String hoTen = scanner.nextLine();
                            System.out.println("Nhap tuoi: ");
                            int tuoi= scanner.nextInt();
                            System.out.println("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gioiTinh = scanner.nextLine();
                            System.out.println("Nhap dia chi: ");
                            String diaChi = scanner.nextLine();
                            System.out.println("Nhap cong viec: ");
                            String congViec = scanner.nextLine();
                            CanBo nhanvien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
                            qlcb.addCanBo(nhanvien);
                            System.out.println(nhanvien.toString());
                            break;
                        }
                        default:
                        System.out.println("nhap sai.");
                        break;

                    }
                    break;

                }
                case"2":{
                    System.out.println("Nhap ten muon tim kiem: ");
                    String hoTen = scanner.nextLine();
                    qlcb.searchCanBoByHoTen(hoTen).forEach(canbo -> System.out.println(canbo.toString()) );
                    break;
                }
                case"3":{
                    qlcb.showListInforCanBo();
                    break;

                }
                case"4":{
                    return;
                }
                default:
                System.out.println("Nhap sai cu phap.");
                continue;
            }


        }
        
    }
}
