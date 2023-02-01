import vouchers.Voucher;

public class Main {
    public static void main(String[] args) {
        Voucher voucher = new Voucher("wdwd", "wdwd", true);
        System.out.println(voucher.setCompress());


        Voucher voucher1 = new Voucher(voucher.setCompress());
       // voucher.create(10, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");


    }
}
