package Costumer;

public class Costumer {
    private String name;
    private String address;
    private String email;
    private long mobileNumber;
    private boolean premiumMemberShip;

    public Costumer(String name, String address, String email, int mobileNumber, boolean premiumMemberShip) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.premiumMemberShip = premiumMemberShip;
        System.out.println("costumer name = " + this.name + "address=  " + address + "email =" + email + "mobile number" + " =" + mobileNumber + "premium member ship =" +premiumMemberShip);
    }

    public Costumer() {
        name = "";
        address = "";
        email = "";
        mobileNumber = 0;
        premiumMemberShip = false;
        System.out.println("costumer name = " + this.name + "address=  " + address + "email =" + email + "mobile number" + " =" + mobileNumber + "premium member ship =" + premiumMemberShip);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public boolean isPremiumMemberShip() {
        return premiumMemberShip;
    }

    public void setPremiumMemberShip(boolean premiumMemberShip) {
        this.premiumMemberShip = premiumMemberShip;
    }

    public void displayCostumer() {
        System.out.println("costumer name =" + name);
        System.out.println("costumer address =" + address);
        System.out.println("costumer email =" + email);
        System.out.println("costumer mobile number =" + mobileNumber);
        System.out.println("costumer premium member ship =" + premiumMemberShip);


    }


}
