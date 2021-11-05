import java.util.ArrayList;
import java.util.List;

public class KhachHang {
    private String ten, diaChi, email;
    private String sdt;
    private GioHang gioHang;
    private Listener listener;

    public interface Listener {

        public void capNhat(List<SanPham> dsGio, KhachHang khach);

        public List<SanPham> laySanPhams();
    }

    public KhachHang(String ten, String diaChi, String email, String sdt, Cuahang cuahang) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.email = email;
        this.sdt = sdt;
        this.listener = cuahang;
    }

    public void taoGioHang(String thoiGian) {
        gioHang = new GioHang(thoiGian);
    }

    public void themGioHang(SanPham sp) {
        for (SanPham sPham : listener.laySanPhams()) {
            if (sPham.getId().equals(sp.getId())) {
                gioHang.themSp(sp);
                System.out.println(sp + "da dc them vao gio hang");
                return;
            }
        }
        System.out.println("Khong co san pham trong cua hang");
    }

    public void thanhToan(String thoigianThanhToan) {
        System.out.println("Thanh toan: ");
        gioHang.in();
        List<SanPham> dsGio = gioHang.thanhToanGio(thoigianThanhToan);
        listener.capNhat(dsGio, this);
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public GioHang getGioHang() {
        return gioHang;
    }

    public void xemDanhSach() {
        for (SanPham sp : listener.laySanPhams()) {
            System.out.println(sp);
        }
    }

    public List<SanPham> search(String searchTerm) {
        List<SanPham> matchings = new ArrayList<>();
        for (SanPham sp : listener.laySanPhams()) {
            if (sp.getTen().equals(searchTerm)) {
                matchings.add(sp);
            }
            if (sp.getLoai().equals(searchTerm)) {
                matchings.add(sp);
            }
        }
        return matchings;
    }
}
