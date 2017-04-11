import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogueCamera analogueCamera;

  @Before
  public void before() {
    photographer = new Photographer();
    digitalCamera = new DigitalCamera();
    analogueCamera = new AnalogueCamera();
  }



}
