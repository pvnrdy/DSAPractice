import java.util.Stack;

public class ParenthesisOne {
    public static void main(String [] args) {
        String inputString = "{{[}}";
        boolean isValidParenthesis = isValidParenthesis(inputString);
        System.out.println(isValidParenthesis);
    }

    public static boolean isValidParenthesis(String inputString) {
        char inputStringAsCharArray [] = inputString.toCharArray();
        Stack<Character> bracketsStack = new Stack<>();
        for(int i = 0 ; i < inputStringAsCharArray.length; i++) {
            if(inputStringAsCharArray[i] == '(' || inputStringAsCharArray[i] == '{' || inputStringAsCharArray[i] == '[') {
                bracketsStack.push(inputStringAsCharArray[i]);
            } else if(inputStringAsCharArray[i] == ')' || inputStringAsCharArray[i] == '}' || inputStringAsCharArray[i] == ']') {
                //PavanToDo
                //There is a flaw, you have to check which one to pop using stack.pop()
                //We haven't implemented that
                bracketsStack.pop();
            }
        }
        return bracketsStack.isEmpty() ? true : false;
    }
}