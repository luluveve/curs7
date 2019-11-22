package heroes;

public abstract class Hero {
    protected String name;
    protected int hp;
    protected int mana;

    public abstract void firePrimary ();
    public abstract void fireSecondary ();
    public abstract void receiveHit();
}
