package hometask_2_1.workers;

import hometask_2_1.SalaryTypes;
import hometask_2_1.Worker;

public class Engineer extends Worker {
    private SalaryTypes salaryType;
    private int salary;
    private final double PROFIT_COEFFICIENT = 2.0;

    public Engineer(SalaryTypes salaryType, int salary) {
        this.salaryType = salaryType;
        this.salary = salary;
    }

    public SalaryTypes getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(SalaryTypes salaryType) {
        this.salaryType = salaryType;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public int calcSalary() {
        if (this.salaryType == SalaryTypes.HOURLY) return this.salary * 40;
        return this.salary;
    }

    @Override
    public double calcProfitForTheCompany() {
        return this.calcSalary() * this.PROFIT_COEFFICIENT;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "salaryType=" + salaryType +
                ", salary=" + salary +
                ", PROFIT_COEFFICIENT=" + PROFIT_COEFFICIENT +
                "} ";
    }
}
