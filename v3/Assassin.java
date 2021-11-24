public class Assassin extends Protagonist {
  public String _name;
  public int _baseDamage;

  public Assassin(String name) {
    super(name);
  }

  public static String about() {
    return "A marksman with a bow who never misses an attack. Special attacks have a 10% chance of dealing 10x damage.";
  }

  public int attack(Character m) {
    int totalDamage = 0;
    totalDamage = _baseDamage * _damageMult - _defense;
    return m.reduceHealth(totalDamage);
  }

}
