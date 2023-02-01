package vouchers;

public class Voucher {

    private String name, description;
    private int discountCount, discountPercent;
    private boolean access;

    private String compress;

    public Voucher(String name, String description, int discountCount, int discountPercent, boolean access) {
        this.name = name;
        this.description = description;
        this.discountCount = discountCount;
        this.discountPercent = discountPercent;
        this.access = access;

        compress(name,  description,  discountCount,  discountPercent,  access);
    }

    public Voucher(String name, String description, int discountCount, boolean access) {
        this.name = name;
        this.description = description;
        this.discountCount = discountCount;

        compress(name,  description,  discountCount,  access);
    }

    public Voucher(String name, String description, boolean access) {
        this.name = name;
        this.description = description;
        this.access = access;

        compress(name,  description,  access);
    }

    public Voucher() {
    }

    public String getName() {
        return name;
    }

    public String create(int length, String characters, int spaceBetweenCharacters) {
        String voucher = "";
        for (int i = 0; i < length; i++) {
            if (i == spaceBetweenCharacters) {
                voucher += "-";
            }
            voucher += characters.charAt((int) (Math.random() * characters.length()));
        }
        return voucher;
    }

    public String create(int length, String characters) {
        String voucher = "";
        for (int i = 0; i < length; i++) {
            voucher += characters.charAt((int) (Math.random() * characters.length()));
        }
        return voucher;
    }

    public String getDescription() {
        return description;
    }


    public int getDiscountCount() {
        return discountCount;
    }


    public boolean isAccess() {
        return access;
    }


    public int getDiscountPercent() {
        return discountPercent;
    }


    @Override
    public String toString() {
        return "Voucher{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", discountCount=" + discountCount +
                ", discountPercent=" + discountPercent +
                ", access=" + access +
                '}';
    }


    private void compress(String name, String description, int discountCount, int discountPercent, boolean access) {
        System.out.println("Compressing...");
        compress = name + description + discountCount + discountPercent + access;
        compress = "name= " + name + "\ndescription= " + description + "\ndiscountCount= " + discountCount + "\ndiscountPercent= " + discountPercent + "\naccess= " + access;
    }

    public void compress(String name, String description, int discountCount, boolean access) {
        System.out.println("Compressing...");
        compress = name + description + discountCount + discountPercent;
        compress = "name= " + name + "\ndescription= " + description + "\ndiscountCount= " + discountCount + "\naccess= " + access;
    }

    public void compress(String name, String description, boolean access) {
        System.out.println("Compressing...");
        compress = name + description + discountCount;
        compress = "name= " + name + "\ndescription= " + description + "\naccess= " + access;
    }

    public String getCompress() {
        return compress;
    }
}
