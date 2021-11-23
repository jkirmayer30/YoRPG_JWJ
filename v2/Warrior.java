// Needs fix (only basic template)

public class Warrior extends Protagonist {
  public String _name;
  public int _baseDamage;

  public Warrior() {
    super();
  }

  public Warrior(String name) {
    super(name);
  }

  public void specialize() {
    this._damageMult = 3;
  }

  public void normalize() {
    this._damageMult = 2;
  }

}
