import vouchers.Voucher;

public class Main {
    public static void main(String[] args) {
        Voucher voucher = new Voucher("wdwd", "wdwd", 10, 10, true);
        System.out.println(voucher.getCompress());

       // voucher.create(10, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        System.out.println(voucher.toString());

    }
}
