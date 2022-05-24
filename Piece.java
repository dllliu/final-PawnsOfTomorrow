
public abstract class Piece{

  private String color;
  private String type;

  public Piece(String type, String color){
    this.type = type;
    this.color = color;
  }

  public String getColor(String color){
    return this.color;
  }

  public String getType(String type){
    return this.type;
  }

  public String setType(String type){
    this.type = type;
  }

  public int getValue(){
    return this.type.getValue();
  }
}
