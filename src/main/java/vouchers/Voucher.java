package vouchers;

public class Voucher {

    private String name, description;
    private int discountCount, discountPercent;
    private boolean access;

    public Voucher(String name, String description, int discountCount, int discountPercent, boolean access) {
        this.name = name;
        this.description = description;
        this.discountCount = discountCount;
        this.discountPercent = discountPercent;
        this.access = access;
    }

    public Voucher(String name, String description, int discountCount, int discountPercent) {
        this.name = name;
        this.description = description;
        this.discountCount = discountCount;
        this.discountPercent = discountPercent;
    }

    public Voucher(String name, String description, int discountCount) {
        this.name = name;
        this.description = description;
        this.discountCount = discountCount;
    }

    public Voucher(String name, String description) {
        this.name = name;
        this.description = description;
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

    public int getDiscountCount() {
        return discountCount;
    }

    public void setDiscountCount(int discountCount) {
        this.discountCount = discountCount;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", discount=" + discountCount +
                ", access=" + access +
                '}';
    }
}
