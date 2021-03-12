package hometask_1;

public class Main {

    public static void main(String[] args) {
        //task 1:
//        Practice in the automatic typing
//        Write a program that prints prime numbers between [2, 100] to the console.
//                Use the% operator and loops to accomplish this task.

        for (int i = 2; i < 100; i++) {
            if (isPrimeNumber(i)) System.out.print(" " + i);
        }




        //task 2:
        //    Implement a class hierarchy:
        //        The Box class is a container; it can contain other shapes. The add () method takes Shape as input.
        //        It is necessary to add new shapes as long as we have enough space for them in the Box (we will only count the volume, ignoring the form. Let's say we're pouring liquid). If there is not enough space to add a new shape, then the method should return false.

//        Box box = new Box(1000);
//        System.out.println(box.add(new Triangle(10, 15)));
//        System.out.println(box.add(new Square(10, 5)));
//        System.out.println(box.add(new Circle(25)));
//        System.out.println(box.add(new Triangle(10, 15)));
//        System.out.println(box.add(new Square(10, 5)));
//        System.out.println(box.add(new Circle(25)));
//        System.out.println(box.add(new Triangle(10, 15)));
//        System.out.println(box.add(new Square(10, 5)));
//        System.out.println(box.add(new Circle(10)));
//        System.out.println(box.add(new Triangle(10, 15)));
//        System.out.println(box.add(new Triangle(10, 15)));
//        System.out.println(box.add(new Square(10, 5)));
//        System.out.println(box);

    }


    private static boolean isPrimeNumber(int number) {
        if (number == 2) return true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    ;
}


