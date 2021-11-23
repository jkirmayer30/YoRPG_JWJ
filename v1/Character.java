package v1;

public class Character {
  public String _name;
  public int _health;
  public int _baseDamage;
  public int _damageMult;

  public Character() {
    _health = 50;
    _baseDamage = 10;
    _damageMult = 1;
  }

  public Character(
          String name
  ) {
    _name = name;
    _health = 50;
    _baseDamage = 10;
    _damageMult = 1;
  }

  public Character(
          String name,
          int health
  ) {
    _name = name;
    _health = health;
    _baseDamage = 10;
    _damageMult = 1;
  }

  public Character(
          String name,
          int health,
          int baseDamage
  ) {
    _name = name;
    _health = health;
    _baseDamage = baseDamage;
    _damageMult = 1;
  }

  public String getName() {
    return _name;
  }

  public boolean isAlive() {
    return _health > 0;
  }

  public int attack(Character m) {
    return m.getAttacked(_damageMult*_baseDamage);
  }

  public int getAttacked(int damage) {
    if (Math.random()>0.5){
      _health -= damage*_damageMult;
      if (_damageMult ==0){
        System.out.println("You did no damage. You missed");
      }
      System.out.println(_damageMult);
      return damage*_damageMult;
    }
    return 0;
  }

}
