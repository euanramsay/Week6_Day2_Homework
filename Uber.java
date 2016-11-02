public class Uber{
  private String name;
  private ArrayList<Passenger> seats;

  public Uber(String name){
    this.name = name;
    this.seats = new ArrayList<Passenger>();
  }
  public String getName(){
    return this.name;
  }

  public int passengerCount(){

    return seats.size();
  }

  public void pickup(Passenger passenger) {
    if ( seatsFull() ) {
      return; 
    }
    seats.add(passenger);
  }

  public boolean seatsFull() {
    return (passengerCount() >= 4);
  }

  public void dropOff() {
    seats.clear();
    }
  }

}
  