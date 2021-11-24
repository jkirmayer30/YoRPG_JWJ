public class GoblinKing extends Monster {
  public String _name;
  public int _baseDamage;

  public String about() {
    return "He just swings his club. Sends 7 goblins flying."
  }

  public GoblinKing() {
    _health = 120;
    _baseDamage = 40;
    _damageMult = 1;
    _defense = 10;
  }

}
