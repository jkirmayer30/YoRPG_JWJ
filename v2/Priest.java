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

  public String about() {
    return "A priest? Are you immortal?."
  }

  public void specialize() {
    this._damageMult = 2;
  }

  public void normalize() {
    this._damageMult = 1;
  }

}
