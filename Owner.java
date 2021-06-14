package GOFO;

import java.util.Vector;




public class Owner extends User{
    Ewallet ewallet=new Ewallet();
    private Playground[] playgrounds=new Playground[1000];
    private Booking[] bookings=new Booking[1000];
    public static Vector<Owner> owners = new Vector<Owner>();

int ocount=0;
    public Owner(String userName, String address, String email, String password, String nationalId, String phoneNumber) {
        super(userName, address, email, password, nationalId, phoneNumber);
        owners.add(ocount, this);
        ocount++;
    }

    public void setEwallet(Ewallet ewallet) {
        this.ewallet = ewallet;
    }

    public void setPlaygrounds(Playground[] playgrounds) {
        this.playgrounds = playgrounds;
    }

    public void setBookings(Booking[] bookings) {
        this.bookings = bookings;
    }

    public Ewallet getEwallet() {
        return ewallet;
    }

    public Playground[] getPlaygrounds() {
        return playgrounds;
    }

    public Booking[] getBookings() {
        return bookings;
    }
    public Booking[] viewBooking(){
        return bookings;
    }
}
