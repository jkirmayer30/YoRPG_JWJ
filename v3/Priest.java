public class Priest extends Protagonist {
  public String _name;
  public int _baseDamage;

  public Priest(String name) {
    super(name);
    _defense = 15; // 5 added to defense is heals
  }

  public static String about() {
    return "Heals for 5 health after every round.";
  }

}
