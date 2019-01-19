
public class HandySmurf {
static Smurf handy = new Smurf("Handy Smurf");
static Smurf papa = new Smurf("Papa Smurf");
static Smurf girl = new Smurf("Smurfette");
public static void main(String[] args) {
	System.out.println(handy.getName());
	handy.eat();
	
	System.out.println(papa.getName());
	papa.eat();
	System.out.println(papa.isGirlOrBoy());
	
	System.out.println(girl.getName());
	girl.eat();
	System.out.println(girl.getHatColor());
	System.out.println(girl.isGirlOrBoy());
}
}
