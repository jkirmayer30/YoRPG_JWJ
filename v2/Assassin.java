public class Assassin extends Protagonist {
  public String _name;
  public int _baseDamage;

  public Assassin(String name) {
    _name = name;
    _health = 100;
    _baseDamage = 20;
    _damageMult = 1;
    _defense = 10;
  }

  public String about() {
    return "An assassin never misses."
  }

  public void specialize() {
    this._damageMult = 3;
  }

  public void normalize() {
    this._damageMult = 2;
  }

  public int attack(Character m) {
    int totalDamage = 0;
    totalDamage = _baseDamage * _damageMult - _defense;
    return m.reduceHealth(totalDamage);
  }

}
