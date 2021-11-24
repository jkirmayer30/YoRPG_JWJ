public class Warrior extends Protagonist {
  public String _name;
  public int _baseDamage;

  public Warrior(String name) {
    _name = name;
    _health = 100;
    _baseDamage = 20;
    _damageMult = 1;
    _defense = 10;
  }

  public static String about() {
    return "A specialize attack is thriced instead of doubled.";
  }

  public void specialize() {
    this._damageMult = 3;
  }

  public void normalize() {
    this._damageMult = 1;
  }

}
