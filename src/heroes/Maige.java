package heroes;

public class Maige extends Hero {
    @Override
    public void firePrimary() {
        mana -=15;
    }

    @Override
    public void fireSecondary() {
      mana -=40;
    }

    @Override
    public void receiveHit() {
       hp -=30;
    }
}
