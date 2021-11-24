public class Dragon extends Monster {
  public String _name;
  public int _baseDamage;

  public String about() {
    return "Has strong scales. Swords and sticks are not effective. "
  }

  public Dragon() {
    _health = 150;
    _baseDamage = 20;
    _damageMult = 1;
    _defense = 15;
  }

}
