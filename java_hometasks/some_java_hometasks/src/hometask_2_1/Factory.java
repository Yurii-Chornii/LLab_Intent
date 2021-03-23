package hometask_2_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Factory {
    private final List<Worker> WORKERS = new ArrayList<>();
    private final int MONTHLY_CAPITAL;
    private int occupiedCapital;


    public Factory(int MONTHLY_CAPITAL) {
        this.MONTHLY_CAPITAL = MONTHLY_CAPITAL;
    }

    public boolean add(Worker worker){
        int salary = worker.calcSalary();
        if(this.MONTHLY_CAPITAL - this.occupiedCapital >= salary){
            this.WORKERS.add(worker);
            this.occupiedCapital += salary;
            return true;
        }
        return false;
    }

    public int getAvgSalariesSum(){
        return this.occupiedCapital;
    }


    public double calcProfit(){
        Iterator<Worker> iterator = WORKERS.iterator();
        double sum = 0;
        while (iterator.hasNext()){
            Worker next = iterator.next();
            sum += next.calcProfitForTheCompany();
        }
        return sum;
    }

    public double calcExpectedCapital(){
        int unusedCapital = this.MONTHLY_CAPITAL - this.occupiedCapital;
        if (unusedCapital > 0){
            return this.calcProfit() + unusedCapital;
        }
        return this.calcProfit();
    }

    @Override
    public String toString() {
        return "Factory{" +
                "WORKERS=" + WORKERS +
                ", MONTHLY_CAPITAL=" + MONTHLY_CAPITAL +
                ", occupiedCapital=" + occupiedCapital +
                '}';
    }
}
