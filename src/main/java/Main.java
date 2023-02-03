import vouchers.Voucher;

public class Main {
    public static void main(String[] args) {
        Voucher voucher = new Voucher("wdwd", "dwed", true);
        //System.out.println(voucher.setCompress());
        System.out.println(voucher.getName());

        System.out.println("=====================================");

        Voucher voucher1 = new Voucher(voucher.setCompress());
        System.out.println(voucher1.toString());


    }
}
