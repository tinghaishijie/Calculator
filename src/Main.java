import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        System.out.print(i + ".请输入运算语句：");
        while(in.hasNext()){
            String input = in.nextLine();
            int result = Calculate.getsInstance().calculate(input);

            System.out.println("计算结果：" + result + "\r\n");
            System.out.print(++i + ".请输入运算语句：");
        }
    }
}
