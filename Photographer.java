  import java.util.*;

  public class Photographer {

    private String name;
    private ArrayList<Printable> printables;

    public Photographer(String name){
      this.name = name;
      this.printables = new ArrayList<Printable>();
    }

    public String getName() {
      return this.name;
    }

    public int printablesLength(){
      return this.printables.size();
    }

    public void addCamera(Printable printable){
      this.printables.add(printable);
    }

    public void removeCamera(Printable printable){
      this.printables.remove(printables.indexOf(printable));
    }

  }
