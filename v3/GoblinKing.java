public class GoblinKing extends Monster {
  public String _name;
  public int _baseDamage;

  public String about() {
    return "He just swings his club and sends the goblins flying.";
  }

  public GoblinKing() {
    super();
    _health = 350;
    _baseDamage = 30; 
  }

  public String getRole () {
    return "Goblin King";
  }

}
