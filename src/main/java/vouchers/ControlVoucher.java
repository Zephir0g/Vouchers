package vouchers;

public class ControlVoucher extends Voucher {


    public ControlVoucher(String name, String description, int discount, boolean access) {
        super(name, description, discount, access);
    }

    public ControlVoucher(String name, String description, int discount) {
        super(name, description, discount);
    }

    public ControlVoucher(String name, String description) {
        super(name, description);
    }

    public ControlVoucher(String name) {
        super(name);
    }

    public ControlVoucher() {
    }



    public void createVoucher(int length, String characters){
        String voucher = "";
        for (int i = 0; i < length; i++) {
            voucher += characters.charAt((int) (Math.random() * characters.length()));
        }
        System.out.println(voucher);

    }

    public void createVoucher(int length, String characters, int spaceBetweenCharacters){
        String voucher = "";
        for (int i = 0; i < length; i++) {
            if(i == spaceBetweenCharacters){
                voucher += "-";
            }
            voucher += characters.charAt((int) (Math.random() * characters.length()));
        }
        System.out.println(voucher);

    }

}
