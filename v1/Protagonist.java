public class Protagonist extends Character {
  public String _name;
  public int _baseDamage;

  public Protagonist(int hp) {
    super(hp);
  }

  public Protagonist(String name, int hp) {
    super(name,hp);
  }

  public void specialize() {
    this._damageMult = 2;
  }

  public void normalize() {
    this._damageMult = 1;
  }

}
