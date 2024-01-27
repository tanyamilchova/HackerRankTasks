package OOP2;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class FlowerTestCase {



        public static class Flower {
            String name = "Flower";

            String whatsYourName() {
                return "I have many names and types";
            }
        }

        public static class Jasmine extends Flower {
            @Override
            String whatsYourName() {
                return "Jasmine";
            }
        }

        public static class Lily extends Flower {
            @Override
            String whatsYourName() {
                return "Lily";
            }
        }

        public static class Lotus extends Flower {
            @Override
            String whatsYourName() {
                return "Lotus";
            }
        }

        public static class Region {
            String yourNationalityFlower() {
                Flower fl = new Flower();
                return fl.whatsYourName();
            }
        }

        public static class WestBengal extends Region {
            public String name="WestBengal";
            @Override
            String yourNationalityFlower() {
                Jasmine j = new Jasmine();
                return j.whatsYourName();
            }

            public String getName() {
                return name;
            }
        }

        public static class AndhraPradesh extends Region {
            public String name="AndhraPradesh";

            public String getName() {
                return name;
            }

            @Override
            String yourNationalityFlower() {
                Lily l = new Lily();
                return l.whatsYourName();
            }
        }

        public static Object createObject(String className) throws Exception {
            // Use reflection to get the class object based on the class name
            Class<?> clazz = Class.forName(className);

            // Get the constructor of the class (assuming it has a parameterless constructor)
            Constructor<?> constructor = clazz.getDeclaredConstructor();

            // Make the constructor accessible if it's not public
            constructor.setAccessible(true);

            // Create an instance of the class using the constructor
            return constructor.newInstance();
        }

        static void printResult(Region city) {
            String fl = city.yourNationalityFlower();
            System.out.println(fl);
        }

        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            String regionName = sc.nextLine();
//            Object r =  createObject(regionName);
            AndhraPradesh r1=new AndhraPradesh();
            String name1=r1.name;
            WestBengal r2= new WestBengal();
            String name2=r2.name;
            if (regionName.equals(name1)) {
                printResult(r1);
            }else if (regionName.equals(name2)) {
                printResult(r2);
            }
        }
    }



