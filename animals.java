class animal
{

public void shout()
{
System.out.println("animals shout");
}
}
class dog extends animal
{
public void shout()
{
System.out.println("Dog shout Bow Bow");
}
}
class horse extends animal
{
public void shout()
{
System.out.println("Horse shout hh hh");
}
}
class cat extends animal
{
public void shout()
{
System.out.println("Cat shout Meaw Meaw");
}
}
public class animals
{
public static  void main(String args[])
{
animal a = new dog();
a.shout();
a= new horse();
a.shout();
a= new cat();
a.shout();
}
}