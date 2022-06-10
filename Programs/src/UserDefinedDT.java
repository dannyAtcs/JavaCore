import java.util.Scanner;

enum Months
{
	Jan,
	Feb,
	March,
	April,
	may,
	June,
	JUly,
    August,
    Sept,
    Oct,
    Nov,
    Dec;
	
	public static void display()
	{
		System.out.println("ALL THE MONTHS HAS COME WITH NEW CHALLENGES");
	}
}


public class UserDefinedDT {

	Months mon;

	public UserDefinedDT(Months mon) {
		
		this.mon = mon;
	}
	
	public void Print()
	{
		switch(mon)
		{
		case Jan: System.out.println("Jan is month of kites");
		break;
		case Feb: System.out.println("feb is leap year");
		break;
		case March: System.out.println("March is month of exams");
		break;
		case April: System.out.println("April is month of exams");
		break;
		case June: System.out.println("June is month of Summer vacations");
		break;
		case JUly: System.out.println("July is month of school reopening");
		break;
		case August: System.out.println("August is month of independance");
		break;
		case Sept: System.out.println("Sept is month of Nothing");
		break;
		case Oct: System.out.println("Oct is month of Festivals");
		break;
		case Nov: System.out.println("Nov is month of Childrens");
		break;
		case Dec: System.out.println("Dec is month of Winter Vacations");
		break;
		default : System.out.println("INVALID MONTH");
		}
	}
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Month:  ");
		String month  = Sc.nextLine();
		UserDefinedDT ob = new UserDefinedDT(Months.valueOf(month));
		ob.Print();
		
		Sc.close();
	}
}
