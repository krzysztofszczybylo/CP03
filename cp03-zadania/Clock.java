
public class Clock
{
   static int hour;
   static int minute;
   
   public Clock(){
       
   }
   public Clock(int hour, int minute){
       this.hour = hour;
       this.minute = minute;
    
   }
   static String setClock(int hour, int minute){
       if (minute > 59){
           return("00:00");
       }
       else{
           return(hour+":"+minute);
       }
       
   }
   static String setClock(){
       return("00:00");
   }
   static void displayTime(){
       System.out.println(setClock());
   }
   static int addOneMinute(int minute){
       minute = minute + 1;
       return(minute);
   }
   static String setAlarm(){
       return null;
   }
   public static void main (String[] args){
       Clock clock1 = new Clock();
       
       clock1.setClock(12,47);
       clock1.displayTime();
       
   }
}
