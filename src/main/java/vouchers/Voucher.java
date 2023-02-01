package vouchers;

public class Voucher {

    String name, description;
    int discount;
    boolean access;

    public Voucher(String name, String description, int discount, boolean access) {
        this.name = name;
        this.description = description;
        this.discount = discount;
        this.access = access;
    }

    public Voucher(String name, String description, int discount) {
        this.name = name;
        this.description = description;
        this.discount = discount;
    }

    public Voucher(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Voucher(String name) {
        this.name = name;
    }

    public Voucher() {
    }



}
