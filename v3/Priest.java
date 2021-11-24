public class Priest extends Protagonist {
  public String _name;
  public int _baseDamage;

  public Priest(String name) {
    _name = name;
    _health = 100;
    _baseDamage = 20;
    _damageMult = 1;
    _defense = 15; // 5 added to defense is heals
  }

  public static String about() {
    return "Heals for 5 health after every round.";
  }

  public void specialize() {
    this._damageMult = 2;
  }

  public void normalize() {
    this._damageMult = 1;
  }

}
