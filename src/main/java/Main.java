import java.util.*;

public class Main {
    public static void main(String[] args)  {
        List<Integer> arrayList =new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int[][] arrayNumber = new int[3][3];
        int count = 1;
        System.out.println("Пользователь, введите число для сравнения");
        int comparison= scanner.nextInt();
        System.out.println("Пользователь, заполните массив");
            for (int i = 0; i < arrayNumber.length; i++) {
                for (int j = 0; j < arrayNumber[i].length; j++) {
                    System.out.println("Введите число " + count);
                    count++;
                    int userNumber = scanner.nextInt();
                    arrayNumber[i][j]=userNumber;
                    arrayList.add(userNumber);
                }
            }
        Optional<Integer> min = arrayList.stream().min(Integer::compare);
        Optional<Integer> max = arrayList.stream().max(Integer::compare);
        int sumMinMax = min.get()+max.get();


        if(sumMinMax<comparison){
            for (int i = 0; i < arrayNumber.length; i++) {
                for (int j = 0; j < arrayNumber[i].length; j++) {
                    if(arrayNumber[i][j]<0){
                        arrayNumber[i][j]=0;
                    }
                }

            }
        }

        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = 0; j < arrayNumber[i].length; j++) {
                System.out.print(arrayNumber[i][j] + "\t");
            }
            System.out.println();
        }
            }

    }








