package t6_usuwanie_niepotrzebnych_referencji_do_obiektow;

/**
 * Author: Daniel
 */
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(2);

        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
