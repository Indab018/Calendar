import java.util.Calendar;  
public class CalendarExample1 {  
   public static void main(String[] args) {  
   Calendar calendar = Calendar.getInstance();  
   System.out.println("The current date is : " + calendar.getTime());  
   calendar.add(Calendar.DATE, -10);  
   System.out.println("10 days ago: " + calendar.getTime());  
   calendar.add(Calendar.MONTH, 3);  
   System.out.println("5 months later: " + calendar.getTime());  
   calendar.add(Calendar.YEAR, 05);  
   System.out.println("05 years later: " + calendar.getTime());  
   }  
}  
