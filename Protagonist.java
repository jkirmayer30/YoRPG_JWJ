public class Protagonist extends Character {
  public String _name;
  public int _health;
  public int _baseDamage;
  public int _damageMult;

  public Protagonist() {
    super();
  }

  public Protagonist(String name) {
    super(name);
  }

  public void specialize() {
    _damageMult = 2;
  }

  public void normalize() {
    _damageMult = 1;
  }
  public int getAttacked(int damage) {
    if (Math.random()>0.5){
      _health -= damage*_damageMult;
      return damage*_damageMult;
    }
    return 0;
  }

}
