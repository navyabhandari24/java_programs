import java.util.List;
import java.util.ArrayList;
public class ListTester1
{
public static void main(String[] args)
{
List<String> nameList = new ArrayList<>();
nameList.add(1,"One");
nameList.add(2,"Two");
for(String no:nameList)
{
System.out.println(no);
}
}
}
