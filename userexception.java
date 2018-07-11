class MyException extends Exception
{
public MyException(String s)
{
super(s);
}
}
class userexception
{
public static void main(String args[])
{
int age=Integer.parseInt(args[1]);
try{
if(args.length==2)
try
{
if(age>=18 && age<=60)
System.out.println(args[0] + " 's " + " " + "age is"+  age);
else
{
throw new MyException("age is mismatch");
}
}
catch(MyException e)
{
System.out.println(e);
}
else
{
throw new MyException("length is not correct");
}
}
catch(MyException e)
{
System.out.println(e);
}
}
}
