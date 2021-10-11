import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class TimeDate {
	static int dd;
	static int mm;
	static int yyyy;
	TimeDate(int dd, int mm, int yyyy)
	{
		TimeDate.dd = dd;
		TimeDate.mm = mm;
		TimeDate.yyyy = yyyy;
	}
	static int checkLeap(int y)
	{
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
			return 1;
		else
			return 0;
	}
	private static boolean dateValidation(String date)
    {
      boolean status = false;
    if (checkDate(date)) {
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      dateFormat.setLenient(false);
      try {
        dateFormat.parse(date);
        status = true;
      } catch (Exception e) {
        status = false;
      }
    }
    return status;
    }
    
    static boolean checkDate(String date) {
    String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
    boolean flag = false;
    if (date.matches(pattern)) {
      flag = true;
    }
    return flag;
    }
	static void calculate()
	{


		int flag_for_leap = checkLeap(yyyy);

		
		String day[] = { "Sunday", "Monday", "Tuesday",
						"Wednesday", "Thursday", "Friday",
						"Saturday" };
		int m_no[] = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };

		System.out.println(dd+"-"+mm+"-"+yyyy);
		int j;
		if ((yyyy / 100) % 2 == 0) {
			if ((yyyy / 100) % 4 == 0)
				j = 6;
			else
				j = 2;
		}
		else {
			if (((yyyy / 100) - 1) % 4 == 0)
				j = 4;
			else
				j = 0;
		}

		
		int total = (yyyy % 100) + ((yyyy % 100) / 4) + dd
					+ m_no[mm - 1] + j;
		if (flag_for_leap == 1) {
			if ((total % 7) > 0)
				System.out.print(day[(total % 7) - 1]+" ");
			else
				System.out.print(day[6]+" ");
		}
		else
			System.out.print(day[(total % 7)]+" ");
		if (flag_for_leap == 1) {
			System.out.println("is a leap year");
		}
		else{
			System.out.println("Not a leap year");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String date = sc.next();
		String[] values = date.split("/");
		new TimeDate(Integer.parseInt(values[0]),
					Integer.parseInt(values[1]),
					Integer.parseInt(values[2]));
		
		if(dateValidation(date)==true)
			calculate();
        else
            System.out.println("Date is invalid");
		
	}
}
