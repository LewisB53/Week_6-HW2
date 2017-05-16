import java.util.*;

public class Photographer{

  private ArrayList<Printable> cameras;



  public Photographer(){
    this.cameras = new ArrayList<Printable>();
  }


  public int cameraCount(){
   return this.cameras.size();
  }


  public void addCamera(Printable camera){
    this.cameras.add(camera);
  }


  public int nutritionValue(){
    return 4;
  }


}
