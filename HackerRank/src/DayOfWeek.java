import java.io.*;

public class DayOfWeek {
    public static void main(String[] args) throws IOException {

//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
                int day = 29;
        int month = 10;
        int year = 1972;
        String res = findDay( month,  day, year);
        System.out.println(res);
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }

    static String findDay(int month, int day, int year) {
//        int day = 29;
//        int month = 10;
//        int year = 1972;
        String weekD="";
        if(year>2000 & year<3000) {
            int calkDay = day - 1;
            int calkMonthS = month - 1;
            int calkMonth = 0;
            int calkYear = year - 1;

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


            int temp = calkYear / 4;
            int leapYears = calkYear - (temp * 4);
            int sumDaysInYears = leapYears * 366 + (calkYear - leapYears) * 365;
            int sum = calkMonth + calkDay + sumDaysInYears;
            int weekDay = sum - (sum / 7) * 7;
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
                    weekD = "THURSDAY";
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
        }
        return weekD;
    }
}

//        int day=29;
//        int month=10;
//        int year=1972;
//        int calkDay=day-1;
//        int calkMonthS=month-1;
//        int calkMonth=0;
//        int calkYear=year-1;
//
//                switch (calkMonthS) {
//                    case  0:
//                        calkMonth=0;
//                        break;
//                    case 1:
//                        calkMonth = 31;
//                        break;
//                    case 2:
//                        calkMonth = 59;
//                        break;
//                    case 3:
//                        calkMonth = 90;
//                        break;
//                    case 4:
//                        calkMonth = 120;
//                        break;
//                    case 5:
//                        calkMonth = 151;
//                        break;
//                    case 6:
//                        calkMonth = 181;
//                        break;
//                    case 7:
//                        calkMonth = 212;
//                        break;
//                    case 8:
//                        calkMonth = 243;
//                        break;
//                    case 9:
//                        calkMonth = 273;
//                        break;
//                    case 10:
//                        calkMonth = 304;
//                        break;
//                    default:
//                        calkMonth = 334;
//                        break;
////            case 12:calkMonth=365;break;
//                }
//
//
//        int temp=calkYear/4;
//        int leapYears=calkYear-(temp*4);
//        int sumDaysInYears=leapYears*366+(calkYear-leapYears)*365;
//        int sum=calkMonth+calkDay+sumDaysInYears;
//        int weekDay=sum-(sum/7)*7;






