package task8;

public class Array implements IShow{
    int[] numbers;

    public Array(int[] numbers) {
        this.numbers = numbers;
    }


    @Override
    public void print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    @Override
    public void print(String info) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " : " + info);
        }
    }
}
