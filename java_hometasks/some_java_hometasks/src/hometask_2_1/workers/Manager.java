package hometask_2_1.workers;

import hometask_2_1.SalaryTypes;
import hometask_2_1.Worker;

public class Manager extends Worker {
    private SalaryTypes salaryType;
    private int salary;
    private int monthlyMotivationBonus;
    private final double PROFIT_COEFFICIENT = 2.5;

    public Manager(SalaryTypes salaryType, int salary, int monthlyMotivationBonus) {
        this.salaryType = salaryType;
        this.salary = salary;
        this.monthlyMotivationBonus = monthlyMotivationBonus;
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

    public int getMonthlyMotivationBonus() {
        return monthlyMotivationBonus;
    }

    public void setMonthlyMotivationBonus(int monthlyMotivationBonus) {
        this.monthlyMotivationBonus = monthlyMotivationBonus;
    }

    @Override
    public int calcSalary() {
        if (this.salaryType == SalaryTypes.HOURLY) return (this.salary * 40) + this.monthlyMotivationBonus;
        return this.salary + this.monthlyMotivationBonus;
    }

    @Override
    public double calcProfitForTheCompany() {
        return this.calcSalary() * this.PROFIT_COEFFICIENT;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "salaryType=" + salaryType +
                ", salary=" + salary +
                ", monthlyMotivationBonus=" + monthlyMotivationBonus +
                ", PROFIT_COEFFICIENT=" + PROFIT_COEFFICIENT +
                "} ";
    }
}
