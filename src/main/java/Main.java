import vouchers.ControlVoucher;

public class Main {
    public static void main(String[] args) {

        ControlVoucher voucher  = new ControlVoucher();
        voucher.createVoucher(10, "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
        voucher.createVoucher(10, "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 5);


    }
}
