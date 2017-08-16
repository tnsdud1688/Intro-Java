public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String room = "";
		int coursenum = 0;
		int coursetime = 0;
		while (true) {
			System.out.println("Please input the course number.");
			coursenum = console.nextInt();
			System.out.println("Please input the time of your course, 8-12 for morning, and 1-5 for afternoon: ");
			coursetime = console.nextInt();

			switch (coursenum) {
			case 1100:
				if (coursetime >= 8 && coursetime <= 12)
					room = "E119";
				else if (coursetime >= 1 && coursetime <= 5)
					room = "E210";
				break;
			case 1101:
				if (coursetime >= 8 && coursetime <= 12)
					room = "E118";
				else if (coursetime >= 1 && coursetime <= 5)
					room = "E119";
				break;
			case 1102:
				if (coursetime >= 8 && coursetime <= 12)
					room = "E117";
				else if (coursetime >= 1 && coursetime <= 5)
					room = "E118";
				break;
			case 1103:
				if (coursetime >= 8 && coursetime <= 12)
					room = "E210";
				else if (coursetime >= 1 && coursetime <= 5)
					room = "E117";
				break;
			case 1104:
				if (coursetime >= 8 && coursetime <= 12)
					room = "E211";
				else if (coursetime >= 1 && coursetime <= 5)
					room = "E212";
				break;
			case 1105:
				if (coursetime >= 8 && coursetime <= 12)
					room = "E213";
				else if (coursetime >= 1 && coursetime <= 5)
					room = "E211";
				break;
			case 1106:
				if (coursetime >= 8 && coursetime <= 12)
					room = "E214";
				else if (coursetime >= 1 && coursetime <= 5)
					room = "E213";
				break;
			case 1107:
				if (coursetime >= 8 && coursetime <= 12)
					room = "E215";
				else if (coursetime >= 1 && coursetime <= 5)
					room = "E214";
				break;
			case 1108:
				if (coursetime >= 8 && coursetime <= 12)
					room = "E216";
				else if (coursetime >= 1 && coursetime <= 5)
					room = "E215";
				break;
			case 1109:
				if (coursetime >= 8 && coursetime <= 12)
					room = "E217";
				else if (coursetime >= 1 && coursetime <= 5)
					room = "E216";
				break;
			case 1110:
				if (coursetime >= 8 && coursetime <= 12)
					room = "E212";
				else if (coursetime >= 1 && coursetime <= 5)
					room = "E217";
				break;
			}
			System.out.println("Your classroom is " + room + "!");
		}
	}
}
