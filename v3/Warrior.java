public class Warrior extends Protagonist {
  public int _baseDamage;

  public Warrior(String name) {
    super(name);
    this._baseDamage = 40;
  }

  public static String about() {
    return "A specialized attack does triple damage.";
  }

  public void specialize() {
    this._damageMult = 3;
  }

  public void normalize() {
    this._damageMult = 1;
  }

}
