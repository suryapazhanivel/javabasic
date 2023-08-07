package Day2;

public class Datatypesclassroom {

	public static void main(String[] args) {
		String classroom1 = "fan";
		String classroom2 = "chair";
		String classroom3 = "laptop";
		String classroom4 = "AC";
		String classroom5 = "tafanble";
		String classroom6 = "clock";
		String classroom7 = "whiteboard";
		String classroom8 = "window";
		String classroom9 = "door";
		System.out.println(classroom1);
		System.out.println(classroom2);
		System.out.println(classroom3);
		System.out.println(classroom4);
		System.out.println(classroom5);
		System.out.println(classroom6);
		System.out.println(classroom7);
		System.out.println(classroom8);
		System.out.println(classroom9);
		
		int chair = 25;
		int fan = 3;
		int laptop = 10;
		int AC = 2;
		int table = 06;
		int clock = 01;
		int whiteboard = 25;
		int window = 02;
		int door = 02;
		
		System.out.println("No of chair :" + chair);
		System.out.println("No of fan : " + fan);
		System.out.println("No of laptop : " + laptop);
		System.out.println("No of AC : " + AC);
		System.out.println("No of table : " + table);
		System.out.println("No of clock : " + clock);
		System.out.println("No of whiteboard : " + whiteboard);
		System.out.println("No of window : "+  window);
		System.out.println("No of door : "+  door);
		
		String classroomcomponent [] = {"fan", "chair" , "laptop" , "AC", "table", "clock", "whiteboard", "window", "door"};
		System.out.println("classroom things : " +classroomcomponent.hashCode());
	}

}
