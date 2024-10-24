public class Main{
    public static void main(String[] args) {
        // Creating an instance of Samsong (which inherits from Phone)
        Samsong samsong = new Samsong();
        System.out.println(samsong);
        System.out.println("___________\n");
        
        // Creating an instance of Tecno (which inherits from Phone)
        Tecno tecno = new Tecno();
        System.out.println(tecno);
        System.out.println("___________\n");
        
        // Anonymous class instance overriding the toString() method
        Phone anonymousPhone = new Phone("Anonymous Phone", 6, 128, 6000) {
            @Override
            public String toString() {
                return "This is an anonymous class for a phone with custom toString()\n" +
                       "Model: " + Model + "\n" +
                       "Ram: " + Ram + "GB" + "\n" +
                       "Storage: " + Storage + "GB" + "\n" +
                       "Battery: " + Battery + "MaH\n";
            }
        };
        System.out.println(anonymousPhone);
    }
    
    // Nested Phone class
    public static class Phone {
        public String Model;
        public int Ram;
        public int Storage;
        public int Battery;
    
        // Constructor for the Phone class
        public Phone(String model, int ram, int storage, int battery) {
            this.Model = model;
            this.Ram = ram;
            this.Storage = storage;
            this.Battery = battery;
        }
    
        // Overriding toString method to display phone info
        @Override
        public String toString() {
            return "Phone info {" + "\n" +
                   "Model = " + Model + "\n" +
                   "Ram = " + Ram + "GB" + "\n" +
                   "Storage = " + Storage + "GB" + "\n" +
                   "Battery = " + Battery + "MaH" + "\n" +
                   "}";
        }
    }
 
    // Nested class Samsong that extends Phone
    public static class Samsong extends Phone {
        public Samsong() {
            super("Samsong A21", 8, 120, 7000);  // Calls the parent class constructor
        }
    }

    // Nested class Tecno that extends Phone
    public static class Tecno extends Phone {
        public Tecno() {
            super("Camon CX Air", 4, 64, 5000);  // Calls the parent class constructor
        }
    }
}