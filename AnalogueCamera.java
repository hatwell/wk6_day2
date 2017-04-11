public class AnalogueCamera implements Printable {

  private String details;

  public AnalogueCamera(String details){
    this.details = details;
  }

  public String printDetails(){
    return this.details;
  }
}
