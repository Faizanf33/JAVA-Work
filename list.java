import java.util.*;

public class list {
	public static void main(String[] args) {
		ArrayList <String> colors = new ArrayList <String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Pink");
		colors.add("Yellow");
		colors.add("Purple");
		colors.add("White");
		colors.add("Black");
		colors.add("Magenta");
		colors.add("Orange");
		
		int index = Integer.valueOf(args[0]);
		System.out.println("Size of colrs list = " + colors.size());
		System.out.println("Colors contains red = " + colors.contains("Red"));
		System.out.println("Colors index " + index + " = " + colors.get(index - 1));
		System.out.println("Colors = " + colors);
		Collections.sort(colors);
		System.out.println("Sorted colors = " + colors);
		colors.clear();
		System.out.println("Clearing color list..");	
	}
}
