import java.util.*;
import java.util.ArrayList;
public class Array
{
public static void main(String args[])
{
ArrayList<String> Hidden=new ArrayList<String>();
Hidden.add("ram");
Hidden.add("hari");
Hidden.add("mani");
Hidden.add("arun");
System.out.println(Hidden);
String element=Hidden.get(2);
System.out.println("Third element:" +element);
Hidden.remove(1);
System.out.println("After the one element from the list:\n"+ element);
}
}