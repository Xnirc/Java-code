public class EmployeeManagement{
        int id ;
        String name;
        class Address{
            String city;
            String state;
            String country;
            Address(String city, String state, String country){
                this.city=city;
                this.state=state;
                this.country=country;
            }
            void displayAddress(){
            System.out.println("Employee ID: "+id+" Name: "+name);
            System.out.println("City: "+city+" State: "+state+" Country: "+country);
            }
        }
        public static void main(String[] args) {
            EmployeeManagement emp = new EmployeeManagement();
            emp.id=101;
            emp.name="John Doe";
            EmployeeManagement.Address addr = emp.new Address("New York", "NY", "USA");
            addr.displayAddress();
    }
    
    
}
