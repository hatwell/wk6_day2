import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogueCamera analogueCamera;

  @Before
  public void before() {
    photographer = new Photographer("Susan");
    digitalCamera = new DigitalCamera();
    analogueCamera = new AnalogueCamera();
  }

  @Test
  public void photographerHasName(){
    assertEquals("Susan", photographer.getName());  
  }



}
