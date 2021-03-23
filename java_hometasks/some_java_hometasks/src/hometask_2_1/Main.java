package hometask_2_1;

import hometask_2_1.workers.Engineer;
import hometask_2_1.workers.Manager;
import hometask_2_1.workers.SeniorEngineer;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory(30000);

        for (int i = 0; i < 10; i++) {
            System.out.println(factory.add(getNewRandomWorker()));
        }

        System.out.println(factory.getAvgSalariesSum());

        System.out.println(factory.calcProfit());

        System.out.println(factory.calcExpectedCapital());

    }

    public static Worker getNewRandomWorker(){
        Random random = new Random();
        int r6 = random.nextInt(6);

        if (r6 == 0){
            return new Engineer(SalaryTypes.HOURLY, random.nextInt(10) + 10);
        }else if (r6 == 1){
            return new Engineer(SalaryTypes.MONTHLY, 5000);
        }else if (r6 == 2){
            return new SeniorEngineer(SalaryTypes.MONTHLY, 10000);
        }else if (r6 == 3){
            return new SeniorEngineer(SalaryTypes.HOURLY, random.nextInt(10) + 20);
        }else if (r6 == 4){
            return new Manager(SalaryTypes.MONTHLY, 4000, 2000);
        }else{
            return new Manager(SalaryTypes.HOURLY, random.nextInt(10) + 10, 2000);
        }
    }
}
