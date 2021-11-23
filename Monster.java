public class Monster {
  public String _name;
  public int _health;
  public int _baseDamage;
  public int _damageMult;

  public Monster() {
    _health = 50;
    _baseDamage = 10;
    _damageMult = 1;
  }

  public Monster(String name) {
    _name = name;
    _health = 50;
    _baseDamage = 10;
    _damageMult = 1;
  }

  public String getName() {
    return _name;
  }

  public boolean isAlive() {
    return _health > 0;
  }

  public int attack(Protagonist m) {
    return m.getAttacked(_damageMult*_baseDamage);
  }

  public int getAttacked(int damage) {
    if (Math.random()>0.5){
      _health -= damage*_damageMult;
      return damage*_damageMult;
    }
    return 0;
  }

  public void specialize() {
    _damageMult = 2;
  }

  public void normalize() {
    _damageMult = 1;
  }

}
