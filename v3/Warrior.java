public class Warrior extends Protagonist {
  public int _baseDamage;

  public Warrior(String name) {
    super(name);
    _baseDamage = 40;
  }

  public static String about() {
    return "A skilled swordsman with an extra sharp blade that deals extra damage. Specialized attacks deal triple damage.";
  }

  public void specialize() {
    this._damageMult = 3;
  }

  public void normalize() {
    this._damageMult = 1;
  }

  public String getRole () {
    return "Warrior";
  }

}
