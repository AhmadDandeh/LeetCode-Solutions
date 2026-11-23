class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = new String[]{"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        int[] months = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int years = year - 1971;
        int leapDays = countLeapYears(year - 1) - countLeapYears(1970);
        if (isLeapYear(year) && month > 2) leapDays++;
        int totalDays = years * 365 + leapDays + months[month - 1] + day - 1;
        return days[totalDays % 7];
    }

    private int countLeapYears(int year) {
        return year / 4 - year / 100 + year / 400;
    }

    private boolean isLeapYear(int year) {
        return year % 400 == 0 ||
              (year % 4 == 0 && year % 100 != 0);
    }
}