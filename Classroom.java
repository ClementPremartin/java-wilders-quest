public class Classroom {
    public static void main(String[] args){

        //jeanjean recive a new instance of the Wilder class
        Wilder jeanjean = new Wilder("Jeanjean");

        //getter  usage
        System.out.println("Wilder of the month is " + jeanjean.getFirstname());

        //instance method
        System.out.println(jeanjean.whoAmI(jeanjean.getFirstname(), jeanjean.getAware()));

        //setter usage
        jeanjean.setAwaring(true);

        System.out.println("after using setter method : ");

        //instance method
        System.out.println(jeanjean.whoAmI(jeanjean.getFirstname(), jeanjean.getAware()));
    }
}
