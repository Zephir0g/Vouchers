package vouchers;

import java.util.Arrays;
import java.util.Base64;

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

        compress(name, description, discountCount, discountPercent, access);
    }

    public Voucher(String name, String description, int discountCount, boolean access) {
        this.name = name;
        this.description = description;
        this.discountCount = discountCount;

        compress(name, description, discountCount, access);
    }

    public Voucher(String name, String description, boolean access) {
        this.name = name;
        this.description = description;
        this.access = access;

        compress(name, description, access);
    }

    public Voucher() {
    }

    public Voucher(String compressString) {
        getDecompress(compressString);
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


    private void cp(Voucher v){
        System.out.println("C C...");

    }

    private void compress(String name, String description, int discountCount, int discountPercent, boolean access) {
        System.out.println("Compressing...");
        compress = "name= " + name + "\ndescription= " + description + "\ndiscountCount= " + discountCount + "\ndiscountPercent= " + discountPercent + "\naccess= " + access;
    }

    public void compress(String name, String description, int discountCount, boolean access) {
        System.out.println("Compressing...");
        compress = "name= " + name + "\ndescription= " + description + "\ndiscountCount= " + discountCount + "\naccess= " + access;
    }

    public void compress(String name, String description, boolean access) {
        System.out.println("Compressing...");
        compress = "name= " + name + "\ndescription= " + description + "\naccess= " + access;
    }

    public String setCompress() {

        return Base64.getEncoder().encodeToString(compress.getBytes());
    }

    public void getDecompress(String compress) {
        System.out.println("Decompressing...");
        Coder base64 = new Coder();
        String decompress = base64.decode(compress);

        String[] decompressArray = decompress.split("\\n");
        for (String s : decompressArray) {
            if (s.contains("name= ")) {
                this.name = s.substring(6);
            } else if (s.contains("description= ")) {
                this.description = s.substring(13);
            } else if (s.contains("discountCount= ")) {
                this.discountCount = Integer.parseInt(s.substring(15));
            } else if (s.contains("discountPercent= ")) {
                this.discountPercent = Integer.parseInt(s.substring(17));
            } else if (s.contains("access= ")) {
                this.access = Boolean.parseBoolean(s.substring(8));
            }
        }

    }

}

