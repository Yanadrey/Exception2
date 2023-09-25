import java.util.Scanner;

public class HomeWork2
{
   public static void main(String[] args) throws Exception{

      //Задача 2

      try {
          int d = 0;
          double catchedRes1 = 8 / d;
          System.out.println("catchedRes1 = " + catchedRes1);
       } catch (ArithmeticException e) {
          System.out.println("Catching exception: " + e);
       }

      //Задача 3

      try {
             int a = 90;
             int b = 3;
             System.out.println(a / b);
             printSum(23, 234);
             int[] abc = { 1, 2 };
             abc[3] = 9;
         
         } catch (NullPointerException ex) {
             System.out.println("Указатель не может указывать на null!");
         } catch (IndexOutOfBoundsException ex) {
             System.out.println("Массив выходит за пределы своего размера!");
         } catch (Throwable ex) {
               System.out.println("Что-то пошло не так...");
         }

         inputFloat();
         inputNotEmpty();
      }
      public static void printSum(Integer a, Integer b) {
         System.out.println(a + b);    
      
      }

      //Задача 1
      //Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
      //и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
      //вместо этого, необходимо повторно запросить у пользователя ввод данных.

      public static void inputFloat() {
         Scanner scanner = new Scanner(System.in);         
         System.out.println("Введите дробное число:");
         try{
            Float number = scanner.nextFloat();
            System.out.println("Введенное число: "+ number);
         } catch (RuntimeException e){
            System.out.println("Было введено не дробное число. Повторите ввод!");
            inputFloat();
         }

      }

      //Задача 4
      //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
      //Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

      public static void inputNotEmpty() {
         Scanner scanner = new Scanner(System.in);         
         System.out.println("Введите строку:");         
         RuntimeException EmptyException = new RuntimeException("Нельзя вводить пустые строки!");
         try{
            String string = scanner.nextLine();
            if (string.isEmpty())                     
            throw EmptyException;
            else
            System.out.println("Введенная строка: "+ string);   
         } catch(RuntimeException e){
            System.out.println("Нельзя вводить пустые строки! Повторите ввод!");
            inputNotEmpty();
         }
           
      }
}
