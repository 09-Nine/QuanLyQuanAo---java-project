public abstract class SanPham {
    private String id, loai, ten, moTa, thoigianThanhToan;
    private int gia, soLuong, size;

    public SanPham(String id, String loai, String ten, String moTa, int gia, int soLuong, int size) {
        this.id = id;
        this.loai = loai;
        this.ten = ten;
        this.moTa = moTa;
        this.gia = gia;
        this.soLuong = soLuong;
        this.size = size;
    };

    public String getId() {
        return id;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getThoigianThanhToan() {
        return thoigianThanhToan;
    }

    public void setThoigianThanhToan(String thoigianThanhToan) {
        this.thoigianThanhToan = thoigianThanhToan;
    }

    public abstract String toString();
}
