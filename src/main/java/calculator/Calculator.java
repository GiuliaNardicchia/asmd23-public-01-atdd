package calculator;

import java.util.*;

public class Calculator {
    private List<Integer> numbers = new LinkedList<>();

    public void enter(int i){
        numbers.add(i);
        if (numbers.size() > 2){
            throw new IllegalStateException();
        }
    }

    public void add(){
        checkNumberSize();
        numbers.set(0, numbers.get(0) + numbers.get(1));
        numbers.remove(1);
    }

    private void checkNumberSize() {
        if (numbers.size() != 2){
            throw new IllegalStateException();
        }
    }

    public void subtract() {
        checkNumberSize();
        numbers.set(0, numbers.get(0) - numbers.get(1));
        numbers.remove(1);
    }

    public void multiply() {
        checkNumberSize();
        numbers.set(0, numbers.get(0) * numbers.get(1));
        numbers.remove(1);
    }

    public int getResult(){
        if (numbers.size() != 1){
            throw new IllegalStateException();
        }
        return numbers.get(0);
    }
}
