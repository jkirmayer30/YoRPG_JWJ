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

  public static String about() {
    return "Never misses an attack.";
  }

  public int attack(Character m) {
    int totalDamage = 0;
    totalDamage = _baseDamage * _damageMult - _defense;
    return m.reduceHealth(totalDamage);
  }

}
