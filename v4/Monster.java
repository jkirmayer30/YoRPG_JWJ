public class Monster extends Character {
  public int _baseDamage;
  public int _damageMult;
  public int _defense;

  public Monster() {
    super();
    _health = 300;
    _baseDamage = 20;
    _damageMult = 1;
    _defense = 10;
  }
}