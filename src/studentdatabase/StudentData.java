
package studentdatabase;

public class StudentData {

    public static void main(String[] args) {
        Student stu1 = new Student ("56845632", "John", "Jones");
        System.out.println("Student registered: " + stu1.getName());
        if (stu1.getBalance()==0) {
            System.out.println("Please make a deposit\n");
        }
        stu1.makeDeposit(1000);
        stu1.showCourses();
        stu1.enroll("History");
        System.out.println("");
                

    }
}

class Student {
        private String firstname;
        private String secondname;
        private String name;
        private String SSN;
        private static final String staticiD = "8578";
        private String UserID;
        public double balance = 0;
        private String email;
        private String phone;
        private String city;
        private String state;
        private String course;
        private double fee = 500;
    
    //constructors
        public Student(String SSN, String firstname, String secondname){
            this.email = firstname + secondname + "@university.com";
        this.SSN = SSN;
        this.name = firstname + " " + secondname;
        setUserID();
    }
        
        public void makeDeposit(double amount) {
            balance = balance + amount;
            System.out.println("Deposit successful");
            checkBalance();
        }
        public void pay(double fee) {
            balance = balance - fee;
        }
        public void checkBalance(){
            System.out.println("Current balance: " + balance + "\n");
        }
        public void enroll(String course){
            setCourse(this.course);
            System.out.println("You have enrolled to " + course);
            pay(fee);
        }
        public void showCourses(){
            System.out.println("Available courses: ");
            System.out.println("[Maths]\n[Literature]\n[History]");
            System.out.println("");
        }
        
        
     //getters setters
        private void setUserID() {
        int random;
        random = 1000 + (int) (Math.random()*8000);
        UserID = staticiD + "" + random + "" + SSN.substring(4);
    }
        public String getUserID() {
            return UserID;
    }
    
        public void setName (String name) {
       this.name = name;
    }
        public String getName() {
        return name;
    }
        
        public void setEmail (String email) {
       this.email = email;
    }
        public String getEmail() {
            return email;
    }
        
        public void setPhone (String phone) {
       this.phone = phone;
    }
        public String getPhone() {
            return phone;
    }
        
        public void setCity (String city) {
       this.city = city;
    }
        public String getCity() {
            return city;
    }
        
        public void setState (String state) {
       this.state = state;
    }
        public String getState() {
            return state;
    }
        public double getBalance() {
            return balance;
    }
        public void setCourse(String course){
            this.course = course;
        }
        
        
}
