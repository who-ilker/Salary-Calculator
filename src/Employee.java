public class Employee {
    String name;
    double salary;
    int weeklyWorkHours;
    int hireYear;

    Employee (String name, double salary, int weeklyWorkHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.weeklyWorkHours = weeklyWorkHours;
        this.hireYear = hireYear;
    }
    public double tax(double salary){
        int taxPercentage = 3;  // if the salary is more than 1000 liras
        double tax;
        if (salary <= 1000.0){
            tax = 0;
            return tax;
        }else {
            tax = salary * (taxPercentage / 100.0);
            return tax;
        }
    }
    public double bonus(int weeklyWorkHours) {
        double bonusMoney = 0;
        if(weeklyWorkHours > 40){
            bonusMoney = (weeklyWorkHours - 40) * 30.0;
            return bonusMoney;
        }
        return bonusMoney;
    }
    public double raiseSalary(int hireYear){
        int whichYearNow = 2021;
        int timeOfYear = whichYearNow - hireYear;
        double percentOfRaise = 0.0;
        if(timeOfYear > 19){
            percentOfRaise = 15 / 100.0;
            double amountOfRaise = this.salary * percentOfRaise;
            //this.salary += amountOfRaise;
            return amountOfRaise;
        }else {
            if(timeOfYear > 9){
                percentOfRaise = 9 / 100.0;
                double amountOfRaise = this.salary * percentOfRaise;
                //this.salary += amountOfRaise;
                return amountOfRaise;
            }else {
                percentOfRaise = 5 / 100.0;
                double amountOfRaise = this.salary * percentOfRaise;
                //this.salary += amountOfRaise;
                return amountOfRaise;
            }
        }
    }
    public void process_RaiseBonusTax (){
        double bonusMoney = bonus(this.weeklyWorkHours);
        double taxAmount = tax(this.salary);
        double amountOfRaise = raiseSalary(this.hireYear);

        this.salary += bonusMoney - taxAmount + amountOfRaise;
    }
    public void printInfo(Employee e){
        System.out.println("*****************************************");
        System.out.println("Name: "+e.name);
        System.out.println("Salary: "+e.salary);
        System.out.println("Weekly working hour: "+e.weeklyWorkHours);
        System.out.println("Date of begin to work: "+e.hireYear);
        System.out.println("------");
        double tax = tax(this.salary);
        double bonus = bonus(this.weeklyWorkHours);
        double amountOfRaise = raiseSalary(this.hireYear);
        System.out.println("Tax: " +tax);
        System.out.println("Bonus: " +bonus);
        System.out.println("Salary with tax and bonus: "+(this.salary - tax + bonus));
        System.out.println("Salary increase amount: " +amountOfRaise);
        process_RaiseBonusTax();
        System.out.println("Total Next Salary: "+this.salary);
    }
}