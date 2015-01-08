class Day {
  private int dayOfMonth;
  private int month;
  private int year;

  public static final string JANUARY = "JANUARY";
  public static final string FEBRUARY = "FEBRUARY";
  public static final string MARCH = "MARCH";
  public static final string APRIL = "APRIL";
  public static final string MAY = "MAY";
  public static final string JUNE = "JUNE";
  public static final string JULY = "JULY";
  public static final string AUGUST = "AUGUST";
  public static final string SEPTEMBER = "SEPTEMBER";
  public static final string OCTOBER = "OCTOBER";
  public static final string NOVEMBER = "NOVEMBER";
  public static final string DECEMBER = "DECEMBER";

  private static final int[] daysInMonth =     {31,28,31,30,31,30,31,31,30,31,30,31};
  private static final int[] daysInMonthLeap = {31,29,31,30,31,30,31,31,30,31,30,31};

  private static final int daysInYear = 365;
  private static final int daysInLeapYear = 366;

  private static final int BEGINNING_OF_EPOCH_YEAR = 1582;

  public Day(int dayOfMonth, int month, int year){
    this.dayOfMonth = dayOfMonth;
    this.month = month;
    this.year = year;
  }

  public Day(int dayOfYear, int year){
    boolean leapYear = Day.isLeapYear(year);
    int month = Day.getMonthFromDayOfYear(dayOfYear, leapYear);
    int dayOfMonth = Day.getDayOfMonthFromDayOfYear(dayOfYear, month, leapYear);
    this.month = month;
    this.dayOfMonth = dayOfMonth;
    this.year = year;
  }

  public Day(int numberOfDaysSinceTheBeginningOfTheEpoch){
    this(Day.getDaysOfYearFromDaysSinceEpoch(numberOfDaysSinceTheBeginningOfTheEpoch),
         Day.getYearFromDaysSinceEpoch(numberOfDaysSinceTheBeginningOfTheEpoch));
  }

  static public boolean isLeapYear(int year){
    return ((year > 1582) && (year % 4 == 0) && ((year % 100 != 0) && (year % 400 != 0)));
  }

  private static int getYearFromDaysSinceEpoch(int days){
    int yearNow = BEGINNING_OF_EPOCH_YEAR;
    while( ( days < 365 && !(Day.isLeapYear(yearNow)) ) && ( days < 366 && Day.isLeapYear(yearNow) )) {
      days = (Day.isLeapYear(yearNow) ? days - daysInLeapYear : days - daysInYear);
      yearNow++;
    }
    return yearNow;
  }

  private static int getDaysOfYearFromDaysSinceEpoch(int days){
    int yearNow = BEGINNING_OF_EPOCH_YEAR;
    while( ( days < 365 && !(Day.isLeapYear(yearNow)) ) && ( days < 366 && Day.isLeapYear(yearNow) )) {
      days = (Day.isLeapYear(yearNow) ? days - daysInLeapYear : days - daysInYear);
      yearNow++;
    }
    return days;
  }

  private static int getDayOfMonthFromDayOfYear(int dayOfYear, int month, boolean leapYear){
    int daysSoFar = 0;
    int[] daysInMonth = (leapYear ? Day.daysInMonth : Day.daysInMonthLeap);
    for (int i = 0; i < month - 1; i++) {
      daysSoFar += daysInMonth[i];
    }
    return dayOfYear - daysSoFar;
  }

  private static int getMonthFromDayOfYear(int dayOfYear, boolean leapYear){
    int daysSoFar = 0;
    int month = 1;
    int[] daysInMonth = (leapYear ? Day.daysInMonth : Day.daysInMonthLeap);
    for (int  i = 0; i < daysInMonth.length; i++) {
      daysSoFar += daysInMonth[i];
      if (daysSoFar >= dayOfYear ) {
        month = i+1;
        break;
      }
    }
    return month;
  }

  public String monthName(){}

  public static void main(String[] args) {
  }
}