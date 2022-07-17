package genericity01;

public class Contact implements Info{
    private String address;
    private String telephone;

    public Contact(String address,String telephone){
        this.setAddress(address);
        this.setTelephone(telephone);
    }
    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return this.getAddress()+","+this.getTelephone();
    }
}
