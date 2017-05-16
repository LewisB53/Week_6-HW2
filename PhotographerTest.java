import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogueCamera analogueCamera;

  @Before 
  public void before() {
    photographer = new Photographer();
    digitalCamera = new DigitalCamera(); 
    analogueCamera = new AnalogueCamera();
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

  @Test
  public void canGetCamDetails(){
    assertEquals("Nikon 34T, Noise reduction filter, Hi-resolution", digitalCamera.printDetails());
  }








  }