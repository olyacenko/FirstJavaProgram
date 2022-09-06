public class Calc {
    public static void main(String[] args){
        calcIfElse(10,7, '+');
        calcIfElse(10,7, '-');
        calcIfElse(10,7, '*');
        calcIfElse(10,7, '/');
        calcIfElse(10,7, '0');
        calcSwitchCase(10,9,'+');
        calcSwitchCase(10,9,'-');
        calcSwitchCase(10,9,'*');
        calcSwitchCase(10,9,'/');
    }
    static void calcIfElse(double paramA, double paramB, char operation){
        if(operation == '+'){
            System.out.println(paramA + paramB);
        }else if(operation == '-'){
            System.out.println(paramA - paramB);
        }else if(operation == '*'){
            System.out.println(paramA * paramB);
        }else if(operation == '/'){
            System.out.println(paramA / paramB);
        }else {
            System.out.println("Incorrect type of operation");
        }
    }
    static void calcSwitchCase(double paramA, double paramB, char operation){
        double result=0;
        switch (operation){
            case '+':
                result = paramA + paramB;
                break;
            case '-':
                result = paramA - paramB;
                break;
            case '*':
                result = paramA * paramB;
                break;
            case '/':
                result = paramA / paramB;;
                break;
            default:
                System.out.println("Incorrect type of operation");

        }
        System.out.println("Результат операции " + operation + " = " + result);
    }
}
