package hu.webler;

import hu.webler.exception.CustomException;
import hu.webler.service.ArithmeticalOperation;

public class Application {

    public static void main(String[] args) {

        double result;
        try {
            result = new ArithmeticalOperation().perform(10, 2);
            System.out.println(result);
        } catch (CustomException e) {
            e.printStackTrace();
        }

        try {
            result = new ArithmeticalOperation().perform(10, 0);
            System.out.println(result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        try {
            result = new ArithmeticalOperation().perform(100, 2);
            System.out.println(result);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
