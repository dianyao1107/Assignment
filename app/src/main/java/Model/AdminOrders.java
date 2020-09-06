package Model;

public class AdminOrders
{
    private String name, address, city, state, date, time, totalAmount;

    public AdminOrders(String name, String address, String city, String state, String date, String time, String totalAmount) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.date = date;
        this.time = time;
        this.totalAmount = totalAmount;
    }

    public AdminOrders(){

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
}
