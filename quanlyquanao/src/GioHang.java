import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private String thoiGian, thoigianThanhToan;
    private List<SanPham> ds;
    private boolean trangThai;

    public GioHang(String thoiGian) {
        ds = new ArrayList<>();
        trangThai = false;
        this.thoiGian = thoiGian;
    }

    public void themSp(SanPham sp) {
        ds.add(sp);
    }

    public void in() {
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
    }

    public List<SanPham> thanhToanGio(String thoigianThanhToan) {
        for (SanPham sanPham : ds) {
            sanPham.setThoigianThanhToan(thoigianThanhToan);
        }
        trangThai = true;
        return ds;
    }
}
