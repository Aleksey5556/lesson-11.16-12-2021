package geekBrains;

public class HomeWorkApp  {
    public static void main(String[] args) {
        printThreeWords();
    }

    public static void   printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

   public static void main(String[] args) {
       checkHomework();
   }

    public static void checkHomework() {
        int a = 25;
        int b = 30;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

  public static void main(String[] args) {
       printColor();
   }
    public static void printColor() {
        int value = 50;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >= 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    
   public static void main(String[] args) {
       compareNumbers();
   }
    public static void compareNumbers() {
        int a = 15;
        int b = 75;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a <= b");
        }
    }
}
