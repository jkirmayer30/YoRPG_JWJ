public class Character {
  public String _name;
  public int _health;
  public int _baseDamage;

  public Character() {
    _health = 50;
    _baseDamage = 10;
  }

  public Character(String name) {
    _name = name;
    _health = 50;
    _baseDamage = 10;
  }

  public String getName() {
    return _name;
  }

  public boolean isAlive() {
    return _health > 0;
  }

  public int attack(Character m) {
    return m.getAttacked(_baseDamage);
  }

  public int getAttacked(int damage) {
    if (Math.random()>0.5){
      _health -= damage;
      return damage;
    }
    return 0;
  }

}
