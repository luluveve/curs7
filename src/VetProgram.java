public class VetProgram {
    public static void main(String[] args) {
        Bear winnie = new Bear();
        Lion simba = new Lion ();
        Chicken kfc = new Chicken ();
        Vet marcel = new Vet ();

        marcel.makeShot(simba);
        marcel.makeShot(kfc);
        marcel.makeShot(winnie);
    }
}
