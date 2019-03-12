import java.util.ArrayList;
import java.util.List;

public class check {
	//int s=0;
	public static void main(String[] args) {
	
		List<String> ls=new ArrayList<>();
		ls.add("debleena");
		ls.add("daoman");
		ls.add("tester");
		System.out.println(convertUsingJava8(ls));
		
	}
	
	public static String convertUsingStringBuilder(List<String> names)
	{
	    StringBuilder namesStr = new StringBuilder();
	    for(String name : names)
	    {
	        namesStr = namesStr.length() > 0 ? namesStr.append(",").append(name) : namesStr.append(name);
	    }
	    return namesStr.toString();
	}
	
	public static String convertUsingJava8(List<String> names)
	{
	    return String.join(",", names);
	}
}

