public class Dragon extends Monster {
  public String _name;
  public int _baseDamage;

  public String about() {
    return "Has strong scales. Swords and sticks are not effective. ";
  }

  public Dragon() {
    super();
    _health = 300;
    _defense = 20; 
  }

}
