package vouchers;

public class Voucher {

    private String name, description;
    private int discount;
    private boolean access;

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

    public String getName() {
        return name;
    }

    public void create(int length, String characters, int spaceBetweenCharacters) {
        String voucher = "";
        for (int i = 0; i < length; i++) {
            if(i == spaceBetweenCharacters){
                voucher += "-";
            }
            voucher += characters.charAt((int) (Math.random() * characters.length()));
        }
        this.name = voucher;
    }

    public void create(int length, String characters) {
        String voucher = "";
        for (int i = 0; i < length; i++) {
            voucher += characters.charAt((int) (Math.random() * characters.length()));
        }
        this.name = voucher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

}
