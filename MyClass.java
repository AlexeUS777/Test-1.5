import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
    public static void main(String [] args){

        //1.Пользователь вводит два числа. Возвести второе в степень первого.
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter your numbers separated by spaces:");
//        int q = scanner.nextInt();
//        int q1 = scanner.nextInt();

//        double q2 = Math.pow(q1, q);
//        System.out.println(q2);

        //2.Пользователь вводит три числа. Возвести 1 в степень 2, и результат в степень 3.
//        System.out.print("Please enter your numbers separated by spaces:");
//        int w = scanner.nextInt();
//        int w1 = scanner.nextInt();
//        int w2 = scanner.nextInt();
//
//        double ww1 = Math.pow(w, w1);
//        double wwResult = Math.pow(ww1, w2);
//        System.out.println(wwResult);

        //3.Решить предыдущую задачу, но Math.pow можно использовать только на одной строчке вашей программы
        // (хоть и много раз).
//        System.out.print("Please enter your numbers separated by spaces:");
//        int e = scanner.nextInt();
//        int e1 = scanner.nextInt();
//        int e2 = scanner.nextInt();
//
//        double ee1 = Math.pow(e, e1); System.out.println(Math.pow(ee1, e2));
        //Не совсем понял, так имелось ввиду?) Просто написано главное на одной строчке, но можно много раз.

        //4.Пользователь вводит, две строки. Найти разницу в длине.
//        System.out.print("Please enter your first word:");
//        String r = scanner.nextLine();
//        System.out.print("Please enter your second word:");
//        String r1 = scanner.nextLine();
//        int rr = r.length();
//        int rr1 = r1.length();
//        int rrs = Math.abs(rr - rr1);
//        System.out.println(rrs);

        //5.Пользователь вводит три строки. Найти разницу в длине самой короткой и самой длинной.
//        System.out.print("Please enter your first word:");
//        String t = scanner.nextLine();
//        System.out.print("Please enter your second word:");
//        String t1 = scanner.nextLine();
//        System.out.print("Please enter your third word:");
//        String t2 = scanner.nextLine();
//
//        int tt = t.length();
//        int tt1 = t1.length();
//        int tt2 = t2.length();
//
//        if((tt > tt1) && (tt > tt2) && (tt1 < tt2)){
//            System.out.println(tt - tt1);
//        } else if((tt > tt1) && (tt > tt2) && (tt2 < tt1)){
//            System.out.println(tt - tt2);
//        } else if((tt1 > tt) && (tt1 > tt2) && (tt < tt2)){
//            System.out.println(tt1 - tt);
//        } else if((tt1 > tt) && (tt1 > tt2) && (tt2 < tt)){
//            System.out.println(tt1 - tt2);
//        } else if((tt2 > tt) && (tt2 > tt1) && (tt < tt1)){
//            System.out.println(tt2 - tt);
//        } else if((tt2 > tt) && (tt2 > tt1) && (tt1 < tt)){
//            System.out.println(tt2 - tt1);
//        }

        //6.Решить предыдущую задачу, не используя операторы >,< итд.
//        System.out.print("Please enter your first word:");
//        String y = scanner.nextLine();
//        System.out.print("Please enter your second word:");
//        String y1 = scanner.nextLine();
//        System.out.print("Please enter your third word:");
//        String y2 = scanner.nextLine();
//
//        int yy = y.length();
//        int yy1 = y1.length();
//        int yy2 = y2.length();
//
//        int[]numbers = {yy, yy1, yy2};
//        int minY = Arrays.stream(numbers).min().getAsInt();
//        int maxY = Arrays.stream(numbers).max().getAsInt();
//        System.out.println(maxY - minY);
        //Долго думал над этой задачей, много гуглил, решил забежать вперёд и сделать через массивы, не совсем ещё всё
        //понятно, но в основном разобрался. Подскажите, пожалуйста, можно ли было ещё каким-то способом решить эту
        //задачу?(интересно просто).
        // И ещё можете подробно объснить и расписать про эту строку кода:
        //int minY = Arrays.stream(numbers).min().getAsInt(); то есть я правильно понимаю: Arrays.stream преобразует
        // массив в поток, потом берётся наш массив и просто с помощью min или max мы получаем минимальное или
        // максимальное значиние, а getAsInt() возвращает нам значение, правильно?

        //7.Сделать калькулятор для трех чисел: пользователь вводит первое, потом оператор, второе, оператор, третье.
        // Посчитать первое на второе, потом результат с третьим. Пример: 11 + 4 * 20; Вывод: 300.
//        System.out.print("Please enter math expression:");
//        double u = scanner.nextDouble();
//        char uu = scanner.next().charAt(0);
//        double u1 = scanner.nextDouble();
//        char uu1 = scanner.next().charAt(0);
//        double u2 = scanner.nextDouble();
//
//        System.out.println("=");
//
//        if((uu == '+') && (uu1 == '+')){
//            System.out.println(u + u1 + u2);
//        } else if((uu == '+') && (uu1 == '-')){
//            System.out.println(u + u1 - u2);
//        } else if((uu == '+') && (uu1 == '*')){
//            System.out.println((u + u1) * u2);
//        } else if((uu == '+') && (uu1 == '/')){
//            System.out.println((u + u1) / u2);
//        } else if((uu == '-') && (uu1 == '+')){
//            System.out.println(u - u1 + u2);
//        } else if((uu == '-') && (uu1 == '-')){
//            System.out.println(u - u1 - u2);
//        } else if((uu == '-') && (uu1 == '*')){
//            System.out.println((u - u1) * u2);
//        } else if((uu == '-') && (uu1 == '/')){
//            System.out.println((u - u1) / u2);
//        } else if((uu == '*') && (uu1 == '+')){
//            System.out.println(u * u1 + u2);
//        } else if((uu == '*') && (uu1 == '-')){
//            System.out.println(u * u1 - u2);
//        } else if((uu == '*') && (uu1 == '*')){
//            System.out.println(u * u1 * u2);
//        } else if((uu == '*') && (uu1 == '/')){
//            System.out.println(u * u1 / u2);
//        } else if((uu == '/') && (uu1 == '+')){
//            System.out.println(u / u1 + u2);
//        } else if((uu == '/') && (uu1 == '-')){
//            System.out.println(u / u1 - u2);
//        } else if((uu == '/') && (uu1 == '*')){
//            System.out.println(u / u1 * u2);
//        } else if((uu == '/') && (uu1 == '/')){
//            System.out.println(u / u1 / u2);
//        }

        //8.Решить предыдущую задачу, но операции считать по приоритету (умножение и деление выше сложения вычитания).
        // Предыдущий пример даст ответ 11 + 80 равно 91.
//        System.out.print("Please enter math expression:");
//        double i = scanner.nextDouble();
//        char ii = scanner.next().charAt(0);
//        double i1 = scanner.nextDouble();
//        char ii1 = scanner.next().charAt(0);
//        double i2 = scanner.nextDouble();
//
//        System.out.println("=");
//
//        if((ii == '+') && (ii1 == '+')){
//            System.out.println(i + i1 + i2);
//        } else if((ii == '+') && (ii1 == '-')){
//            System.out.println(i + i1 - i2);
//        } else if((ii == '+') && (ii1 == '*')){
//            System.out.println(i + i1 * i2);
//        } else if((ii == '+') && (ii1 == '/')){
//            System.out.println(i + i1 / i2);
//        } else if((ii == '-') && (ii1 == '+')){
//            System.out.println(i - i1 + i2);
//        } else if((ii == '-') && (ii1 == '-')){
//            System.out.println(i - i1 - i2);
//        } else if((ii == '-') && (ii1 == '*')){
//            System.out.println(i - i1 * i2);
//        } else if((ii == '-') && (ii1 == '/')){
//            System.out.println(i - i1 / i2);
//        } else if((ii == '*') && (ii1 == '+')){
//            System.out.println(i * i1 + i2);
//        } else if((ii == '*') && (ii1 == '-')){
//            System.out.println(i * i1 - i2);
//        } else if((ii == '*') && (ii1 == '*')){
//            System.out.println(i * i1 * i2);
//        } else if((ii == '*') && (ii1 == '/')){
//            System.out.println(i * i1 / i2);
//        } else if((ii == '/') && (ii1 == '+')){
//            System.out.println(i / i1 + i2);
//        } else if((ii == '/') && (ii1 == '-')){
//            System.out.println(i / i1 - i2);
//        } else if((ii == '/') && (ii1 == '*')){
//            System.out.println(i / i1 * i2);
//        } else if((ii == '/') && (ii1 == '/')){
//            System.out.println(i / i1 / i2);
//        }

        //9.Вывести английский алфавит.
//        int o = 97;
//        while (o <= 122){
//            System.out.println((char)o);
//            o++;
//        }

        //10.Пользователь вводит N. Вывести букву английского алфавита по счету N.
//        System.out.println("Please enter the letter number:");
//        int p = scanner.nextInt();
//        System.out.println((char)p);
        //Не совсем понятно написано условие задачи, ну я так понял, что пользователь вводит номер и по нему мы уже
        //выводим букву, правильно?

        //11.Вывести случайную букву английского алфавита.
//        double a = Math.random();
//        double a1 = a * 26 + 97;
//        int a2 = (int) Math.floor(a1);
//
//        System.out.println((char) a2);

        //12.Вывести случайное число от 11 до 22.
        double s = Math.random();
        double s1 = s * 12 + 11;
        int s2 = (int) Math.floor(s1);

        System.out.println(s2);

        //У меня ещё вопрос такой: почему в предыдущем задании, при указии границы в 26 символов, программа выводит 26
        //символ, а в данном задании, если указать вместо 12 число 11, то 22 не никогда не выведется?


    }
}
