import java.util.List;
import java.util.ArrayList;

class Cuahang implements KhachHang.Listener {
    private List<SanPham> sanPhams;
    private List<KhachHang> khachHangs;
    private List<SanPham> daBan;

    public Cuahang() {
        sanPhams = new ArrayList<>();
        khachHangs = new ArrayList<>();
        daBan = new ArrayList<>();
    }

    public void themSanPham(SanPham sanPham) {
        sanPhams.add(sanPham);
    }

    public void xoaSanPham(String id) {
        for (SanPham sp : sanPhams) {
            if (sp.getId().equals(id)) {
                sanPhams.remove(sp);
            }
        }
    }

    // not done
    // public void suaSanPham(String id) {
    // for (SanPham sp : sanPhams) {
    // if (sp.getId().equals(id)) {

    // }
    // }
    // }

    public void xemDanhSach() {
        for (SanPham sp : sanPhams) {
            System.out.println(sp);
        }
    }

    public List<SanPham> search(String searchTerm) {
        List<SanPham> matchings = new ArrayList<>();
        for (SanPham sp : sanPhams) {
            if (sp.getId().equals(searchTerm)) {
                matchings.add(sp);
            }

            if (sp.getTen().equals(searchTerm)) {
                matchings.add(sp);
            }
        }
        return matchings;
    }

    // overloading
    public List<SanPham> search(int theoGia) {
        List<SanPham> matchings = new ArrayList<>();
        for (SanPham sp : sanPhams) {
            if (sp.getGia() == theoGia) {
                matchings.add(sp);
            }
        }
        return matchings;
    }

    public List<KhachHang> searchKhach(String searchTerm) {
        List<KhachHang> khachPhuhop = new ArrayList<>();
        for (KhachHang khach : khachHangs) {
            if (khach.getTen().equals(searchTerm)) {
                khachPhuhop.add(khach);
            }

            if (khach.getSdt().equals(searchTerm)) {
                khachPhuhop.add(khach);
            }
        }
        return khachPhuhop;
    }

    public List<SanPham> thongKe(String loai, String ngay) {
        List<SanPham> dsPhuHop = new ArrayList<>();
        for (SanPham sanPham : daBan) {
            if (sanPham.getLoai() == loai && sanPham.getThoigianThanhToan() == ngay) {
                dsPhuHop.add(sanPham);
            }
        }
        return dsPhuHop;
    }

    public int doanhThu(String ngay) {
        int tong = 0;
        for (SanPham sPham : daBan) {
            if (sPham.getThoigianThanhToan() == ngay) {
                tong += sPham.getGia();
            }
        }
        return tong;
    }

    @Override
    public void capNhat(List<SanPham> dsGio, KhachHang khach) {
        for (SanPham sPham : dsGio) {
            daBan.add(sPham);
            sanPhams.removeIf(sp -> sp.getId().equals(sPham.getId()));
        }
        khachHangs.add(khach);
    }

    @Override
    public List<SanPham> laySanPhams() {
        return sanPhams;
    }

}