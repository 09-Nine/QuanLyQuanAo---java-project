public class Quan extends SanPham {
    private Boolean rongTui, daiQuan;

    public Quan(String id, String loai, String ten, String moTa, int gia, int soLuong, int size, Boolean rongTui,
            Boolean daiQuan) {
        super(id, loai, ten, moTa, gia, soLuong, size);
        this.rongTui = rongTui;
        this.daiQuan = daiQuan;
    }

    public Boolean getDaiQuan() {
        return daiQuan;
    }

    public void setDaiQuan(Boolean daiQuan) {
        this.daiQuan = daiQuan;
    }

    public Boolean getRongTui() {
        return rongTui;
    }

    public void setRongTui(Boolean rongTui) {
        this.rongTui = rongTui;
    }

    @Override
    public String toString() {
        return "Quan voi id la " + this.getId() + " ten la " + this.getTen() + " co gia " + this.getGia();
    }

}
