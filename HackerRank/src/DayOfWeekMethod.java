public class DayOfWeekMethod {
    public static void main(String[] args) {
        int day = 25;
        int month = 12;
        int year = 2059;
        String weekD="";
//        if(year>2000 & year<3000) {
            int calkDay = day - 1;;
            int calkMonthS = month - 1;
            int calkYear = year - 1;
            int calkMonth = 0;

            switch (calkMonthS) {
                case 0:
                    calkMonth = 0;
                    break;
                case 1:
                    calkMonth = 31;
                    break;
                case 2:
                    calkMonth = 59;
                    break;
                case 3:
                    calkMonth = 90;
                    break;
                case 4:
                    calkMonth = 120;
                    break;
                case 5:
                    calkMonth = 151;
                    break;
                case 6:
                    calkMonth = 181;
                    break;
                case 7:
                    calkMonth = 212;
                    break;
                case 8:
                    calkMonth = 243;
                    break;
                case 9:
                    calkMonth = 273;
                    break;
                case 10:
                    calkMonth = 304;
                    break;
                default:
                    calkMonth = 334;
                    break;
//            case 12:calkMonth=365;break;
            }


//            int temp = calkYear / 4;
//            int leapYears = calkYear - (temp * 4);
        int leapYears = calkYear / 4;
            int commonYears = calkYear - leapYears ;
        int sumDaysInYears = leapYears * 366 + commonYears * 365;
        if ((year % 4 == 0 || (year % 400 == 0 && year % 100 != 0))&&month>=3) {
            sumDaysInYears++;
        }
            int sum = calkMonth + calkDay + sumDaysInYears;
            int tempSum=(sum / 7);
        int weekDay = sum - tempSum* 7;

            switch (weekDay) {
                case 1:
                    weekD = "monday";
                    break;
                case 2:
                    weekD = "tuesday";
                    break;
                case 3:
                    weekD = "wednesday";
                    break;
                case 4:
                    weekD = "thursday";
                    break;
                case 5:
                    weekD = "friday";
                    break;
                case 6:
                    weekD = "saturday";
                    break;
                case 0:
                    weekD = "sunday";
                    break;
            }
//        }
        System.out.println(weekD);
    }
}
