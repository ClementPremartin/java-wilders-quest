public class Wilder {

    //attributes
    private String firstname;
    private boolean awaring;

    //constructors
    public Wilder(String firstname){
        this.firstname = firstname;
        this.awaring = false;
    }

    //getters

    public String getFirstname(){
        return this.firstname;
    }

    public boolean getAware(){
        return this.awaring;
    }

    //setters
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setAwaring(boolean awaring){
        this.awaring = awaring;
    }

    //instance method
    public String whoAmI(String firstname, boolean awaring){
        awaring ? System.out.println("Je m'appelle " + this.firstname + "and i am aware") : System.out.println("Je m'appelle " + this.firstname + "and i am not aware");
    }

}
