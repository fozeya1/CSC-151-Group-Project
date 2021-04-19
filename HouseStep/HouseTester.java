public class HouseTester {
        public static void main(String[] args) {
            House house1 = new House("Colonial", 700, 500, 3, 0.7);
            House house2 = new House("Ranch", 500, 650, 2, 0.5);
            
            System.out.println("House 1");
            System.out.println(house1.toString());
            System.out.println();
            
            System.out.println("House 2");
            System.out.println(house2.toString());
            System.out.println();
            
            if (house1.compareArea(house2) < 0) {
                System.out.println("House 1 has a smaller area than House 2.");
                return;
            }
            
            if (house1.compareArea(house2) > 0) {
                System.out.println("House 1 has a larger area than House 2.");
                return;
            }
            
            System.out.println("Both houses have equal areas.");
        }
    }
