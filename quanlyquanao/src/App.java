import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Cuahang cuahang = new Cuahang();

        cuahang.themSanPham(new Ao("1", "1", "ao1", "dep1", 25, 5, 5, false, 5, 5, 5));
        cuahang.themSanPham(new Ao("2", "1", "ao1", "dep1", 26, 5, 5, false, 5, 5, 5));
        cuahang.themSanPham(new Ao("3", "1", "ao1", "dep1", 27, 5, 5, false, 5, 5, 5));
        cuahang.themSanPham(new Ao("4", "1", "ao1", "dep1", 28, 5, 5, false, 5, 5, 5));
        cuahang.themSanPham(new Ao("5", "2", "ao5", "dep2", 20, 5, 5, true, 5, 5, 5));
        cuahang.themSanPham(new Ao("6", "2", "ao6", "dep2", 21, 5, 5, true, 5, 5, 5));
        cuahang.themSanPham(new Ao("7", "2", "ao7", "dep2", 22, 5, 5, true, 5, 5, 5));
        cuahang.themSanPham(new Ao("8", "2", "ao8", "dep2", 22, 5, 5, true, 5, 5, 5));
        cuahang.themSanPham(new Ao("9", "3", "ao9", "dep3", 21, 5, 5, false, 5, 5, 5));
        cuahang.themSanPham(new Ao("10", "3", "ao10", "dep3", 22, 5, 5, false, 5, 5, 5));
        cuahang.themSanPham(new Ao("11", "3", "ao10", "dep3", 23, 5, 5, false, 5, 5, 5));
        cuahang.themSanPham(new Ao("12", "3", "ao12", "dep3", 24, 5, 5, false, 5, 5, 5));

        cuahang.themSanPham(new Quan("13", "1", "quan4", "dep1", 25, 5, 5, false, true));
        cuahang.themSanPham(new Quan("14", "1", "quan2", "dep1", 26, 5, 5, true, true));
        cuahang.themSanPham(new Quan("15", "1", "quan3", "dep1", 27, 5, 5, false, true));
        cuahang.themSanPham(new Quan("16", "1", "quan4", "dep1", 28, 5, 5, true, true));
        cuahang.themSanPham(new Quan("17", "2", "quan5", "dep2", 20, 5, 5, true, false));
        cuahang.themSanPham(new Quan("18", "2", "quan6", "dep2", 21, 5, 5, false, false));
        cuahang.themSanPham(new Quan("19", "2", "quan7", "dep2", 22, 5, 5, false, false));
        cuahang.themSanPham(new Quan("20", "2", "quan8", "dep2", 22, 5, 5, true, false));

        KhachHang khach1 = new KhachHang("tung", "ha noi", "dvht09@gmail.com", "0338674257", cuahang);
        khach1.taoGioHang("20/11/2021");

        khach1.themGioHang(new Ao("6", "2", "ao6", "dep2", 21, 5, 5, true, 5, 5, 5));
        khach1.themGioHang(new Quan("13", "1", "quan4", "dep1", 25, 5, 5, false, true));
        khach1.themGioHang(new Ao("10", "3", "ao10", "dep3", 22, 5, 5, false, 5, 5, 5));
        khach1.themGioHang(new Ao("7", "2", "ao7", "dep2", 22, 5, 5, true, 5, 5, 5));

        khach1.thanhToan("23/12/2021");

        KhachHang khach2 = new KhachHang("son", "ha noi", "son@gmail.com", "0973999351", cuahang);
        khach2.taoGioHang("26/11/2021");

        khach2.themGioHang(new Quan("20", "2", "quan8", "dep2", 22, 5, 5, true, false));
        khach2.themGioHang(new Quan("17", "2", "quan5", "dep2", 20, 5, 5, true, false));
        khach2.themGioHang(new Ao("1", "1", "ao1", "dep1", 25, 5, 5, false, 5, 5, 5));

        khach2.thanhToan("1/1/2022");

        List<SanPham> sPhams = cuahang.thongKe("2", "23/12/2021");
        for (SanPham sp : sPhams) {
            System.out.println(sp);
        }

        System.out.println(cuahang.doanhThu("1/1/2022"));
    }
}
