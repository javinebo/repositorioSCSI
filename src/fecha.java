import java.util.*;

class fecha {
	public static void main(String[] args) {
		Date d = new Date();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(d);
		System.out.print("La fecha actual es: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.print(" - ");
		System.out.print(c.get(Calendar.MONTH) + 1);
		System.out.print(" - ");
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(d);
	}
} 