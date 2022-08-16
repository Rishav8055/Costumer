package Costumer;

public class Costumer {
    private String name;
    private String address;
    private String email;
    private int    mobileNumber;
    private boolean premiumMemberShip;

    public Costumer(String name, String address, String email, int mobileNumber, boolean premiumMemberShip) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.premiumMemberShip = premiumMemberShip;
    }

    public Costumer() {
        name ="";
        address = "";
        email = "";
        mobileNumber =0;
        premiumMemberShip = false;
        System.out.println("costumer name = "+this.name+"address=  "+address+"email ="+email+"mobile number" +
                " ="+mobileNumber+"premium member ship ="+ false);


    }
}
