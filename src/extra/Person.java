package extra;

public class Person {
String Name;
String Superpower;

public String getName() {
	return Name;
}
public String getSuperpower() {
	return Superpower;
}
public void setName(String name) {
	this.Name = name;
}
public void setSuperpower(String superpower) {
	this.Superpower = superpower;
}
public String toString() {
	return Name + "has mad " + Superpower +" skill.";
}
}
