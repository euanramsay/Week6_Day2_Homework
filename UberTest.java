import static org.junit.Assert.assertEquals;
import org.junit.*;

public class UberTest{
  Uber uber;
  Cat cat;
  Dog dog;
  Person person;

  @Before 
  public void before() {
    uber = new Uber("John");
    cat = new Cat();
    dog = new Dog();
    person  = new Person();
  }

  @Test
  public void hasName(){
    assertEquals( "John", uber.getName()); 
  }

  @Test
  public void seatsStartEmpty() {
    assertEquals(0, uber.passengerCount());
  }

  @Test
  public void canPickupPassenger() {
    uber.pickup(cat);
    assertEquals(1, uber.passengerCount());
  }

  @Test
  public void cantPickupWhenSeatIsFull(){
    for (int i = 0; i < 4; i++){
      uber.pickup(dog);
    }
    assertEquals(4, uber.passengerCount());
  }

  @Test
  public void seatIsFull(){
    for (int i = 0; i < 5; i++) {
      uber.pickup(person);
    }
    assertEquals(true, uber.seatsFull());
  }

  @Test
  public void seatShouldBeEmptyAfterDropOff(){
    uber.pickup(cat);
    assertEquals(1, uber.passengerCount());
    uber.dropOff();
    assertEquals(0, uber.passengerCount());
  }

}