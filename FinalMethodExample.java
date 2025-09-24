public class FinalMethodExample {
        public class Employee{
            String name;
            double salary;
            Employee(String name, double salary){
                this.name = name;
                this.salary = salary;
            }
            public final void calculateBonus(){
                double bonus = salary * 0.1;
                System.out.println(name + "'s Bonus: " + bonus);

            }
        }
    
    class Manager extends Employee{
        Manager(String name, double salary){
            super(name, salary);

        }
        }

        // void calculateBonus(){
        //     System.out.println("Bonus: "+bonus);
        // }
        public static void main(String[] args) {
            FinalMethodExample f = new FinalMethodExample();
            FinalMethodExample.Manager m = f.new Manager("Alice", 90000);
            m.calculateBonus();
        }
    }
