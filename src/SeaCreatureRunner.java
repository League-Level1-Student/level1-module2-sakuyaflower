

public class SeaCreatureRunner {
static SeaCreature spongebob = new SeaCreature( "Spongebob");
static SeaCreature patrick = new SeaCreature("Patrick");
static SeaCreature squidward = new SeaCreature("Squidward");
public static void main(String[] args) {
	System.out.println(spongebob.getName());
	spongebob.eat();
	spongebob.laugh();
	System.out.println(patrick.getName());
	patrick.eat();
	patrick.laugh();
	System.out.println(squidward.getName());
	squidward.laugh();
	squidward.eat();
}


}
