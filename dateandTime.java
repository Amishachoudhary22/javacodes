 public static String findDay(int month, int day, int year) {
           Calendar calendar = Calendar.getInstance();
           calendar.set(year, month - 1, day); 
           int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        
           String[] daysOfWeek = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

   
           return daysOfWeek[dayOfWeek];
    }

}
