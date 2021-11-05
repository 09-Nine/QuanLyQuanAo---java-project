public class Ao extends SanPham {
    private Boolean daiTay;
    private int vongNguc, vongEo, vongMong;

    public Ao(String id, String loai, String ten, String moTa, int gia, int soLuong, int size, Boolean daiTay,
            int vongNguc, int vongEo, int vongMong) {
        super(id, loai, ten, moTa, gia, soLuong, size);
        this.daiTay = daiTay;
        this.vongNguc = vongNguc;
        this.vongEo = vongEo;
        this.vongMong = vongMong;
    }

    public Boolean getDaiTay() {
        return daiTay;
    }

    public void setDaiTay(Boolean daiTay) {
        this.daiTay = daiTay;
    }

    public int getVongNguc() {
        return vongNguc;
    }

    public void setVongNguc(int vongNguc) {
        this.vongNguc = vongNguc;
    }

    public int getVongEo() {
        return vongEo;
    }

    public void setVongEo(int vongEo) {
        this.vongEo = vongEo;
    }

    public int getVongMong() {
        return vongMong;
    }

    public void setVongMong(int vongMong) {
        this.vongMong = vongMong;
    }

    @Override
    public String toString() {
        return "Ao voi id la " + this.getId() + " ten la " + this.getTen() + " co gia " + this.getGia();
    }

}
