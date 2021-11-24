public class Golem extends Monster {
  public String _name;
  public int _baseDamage;

  public String about() {
    return "This guy's a tank. Literally a wall made of stone. "
  }

  public Golem() {
    _health = 200;
    _baseDamage = 20;
    _damageMult = 1;
    _defense = 10;
  }

}
