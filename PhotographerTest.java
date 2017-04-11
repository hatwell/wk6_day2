import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogueCamera analogueCamera;

  @Before
  public void before() {
    photographer = new Photographer("Susan");
    digitalCamera = new DigitalCamera("Canon D5 big zoom lens I dunno");
    analogueCamera = new AnalogueCamera("I have film in me!!");
  }

  @Test
  public void photographerHasName(){
    assertEquals("Susan", photographer.getName());
  }

  @Test
  public void addCameraToPrintables(){
    photographer.addCamera(digitalCamera);
    assertEquals(1, photographer.printablesLength());
  }

  @Test public void removeCameraFromPrintables(){
    photographer.addCamera(digitalCamera);
    photographer.addCamera(analogueCamera);
    photographer.removeCamera(digitalCamera);
    assertEquals(1, photographer.printablesLength());
  }


}
