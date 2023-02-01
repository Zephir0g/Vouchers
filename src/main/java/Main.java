import vouchers.Voucher;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Voucher voucher = new Voucher();

        voucher.create(10, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        System.out.println(voucher.toString());

        voucher.setDescription("This is a description");
        voucher.setDiscountCount(124);
        voucher.setAccess(true);

        System.out.println(voucher.toString());


    }
}
