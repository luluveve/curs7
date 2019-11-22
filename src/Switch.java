public class Switch {
    public static void main(String[] args) {
        int dayofWeek = 2;
                switch (dayofWeek) {
                    case 1:
                        System.out.println("Luni");
                        break;
                    case 2:
                        System.out.println("Marti");
                        break;
                    case 3:
                        System.out.println("Miercuri");
                        break;
                    case 4:
                    case 5:
                        System.out.println("Joi/Vineri");
                        break;
                    default:
                        System.out.println("nu stiu");
                }
    }
}
