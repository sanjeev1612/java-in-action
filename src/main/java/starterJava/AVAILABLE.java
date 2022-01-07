package starterJava;

public enum AVAILABLE {
  PRESENT("AVAILABLE- AVA") , ABSENT("UNAVAILABLE- UA");

  AVAILABLE(String available) {
    this.name=available;
  }

  private String name ;

  public String getName() {
    return name;
  }
}
