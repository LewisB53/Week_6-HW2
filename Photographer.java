import java.util.*;

public class Photographer{

  private ArrayList<Printable> cameras;



  public Photographer(){
    this.cameras = new ArrayList<Printable>();
  }


  public int cameraCount(){
   return this.cameras.size();
  }


  public void addCamera(Printable food){
    this.cameras.add(food);
  }


  public int nutritionValue(){
    return 4;
  }


}
