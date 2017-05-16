import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  DigitalCamera digitalCamera;

  @Before 
  public void before() {
    photographer = new Photographer();
    digitalCamera = new DigitalCamera(); 
  }


  @Test
  public void hasNoCameras(){
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canAddCamera(){
    photographer.addCamera(digitalCamera);
    assertEquals(1, photographer.cameraCount());
  }








  }