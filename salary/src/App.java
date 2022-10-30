class Employees {
    protected double monthlySalary;
    double getSalary() {
        return 12*monthlySalary;
    }
}

class Programmer extends Employees {
    Programmer() {
        monthlySalary = 100;
    }
    double getSalary() {
        return 12*monthlySalary + 50;
    }

    public String toString() {
        return "Gaji Programmer " + getSalary();
    }
}

class SalesPerson extends Employees {
    double BonusFee;
    double getSalary() {
        return 12*monthlySalary + BonusFee;
    }

    void setBonusFee(double Sales) {
        this.BonusFee = Sales*0.2;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Programmer programmer = new Programmer();
        System.out.println(programmer);
    }
}
