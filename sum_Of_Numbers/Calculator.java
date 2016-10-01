package mcginty.jennifer.sum_Of_Numbers;

/**
 * Created by nosec on 9/26/2016.
 */
public class Calculator {
    Display display = new Display();

    int add(int n, int c){
        display.printInt(n + c);
        return n + c;
    }

}
