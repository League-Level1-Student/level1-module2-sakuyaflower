package extra;

public class RunnerForTaco {
static Person Bob = new Person();
static Person KAInJENNIE = new Person();
static Person Irene = new Person();
public static void main(String[] args) {
	
Bob.setSuperpower("superpower");
Bob.setName("Bob ");
KAInJENNIE.setSuperpower("superpower");
KAInJENNIE.setName("Kai and Jennie ");
Irene.setSuperpower("superpower");
Irene.setName("Irene ");
System.out.println(Bob.toString());
System.out.println(KAInJENNIE.toString());
System.out.println(Irene.toString());
}
}
