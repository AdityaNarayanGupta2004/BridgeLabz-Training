package annotationandreflection;

import java.util.ArrayList;

public class UsingSuppressUncheckedWarning {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(10);
		String s = (String) list.get(0);
		System.out.println(s);
	}
}
