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


  public String getAllCamDetails(){
    String allDetails = "";
    for (Printable camera : this.cameras)
      allDetails += camera.printDetails();
    System.out.println(allDetails);
    return allDetails;
  }
}
