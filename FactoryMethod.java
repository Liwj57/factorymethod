package FacMethod;
/*
 * 工厂接口
 */
interface Calculator {
    Operation createOperation();
}
 
/*
 * 加法操作工厂
 */
class Addop implements Calculator {
    public Operation createOperation() {
        return new OperationAdd();
    }
}
 
/*
 * 减法操作工厂
 */
class Minusop implements Calculator {
    public Operation createOperation() {
        return new OperationMinus();
    }
}
 
/*
 * 乘法操作工厂
 */
class Multiop implements Calculator {
    public Operation createOperation() {
        return new OperationMul();
    }
}
 
/*
 * 除法操作工厂
 */
class Divop implements Calculator {
    public Operation createOperation() {
        return new OperationDiv();
    }
}
 
 
abstract class Operation {
    public abstract int getResult(int a, int b);
}
 
/*
 * 加法操作
 */
class OperationAdd extends Operation {
    public int getResult(int a, int b) {
        return a + b;
    }
}
 
/*
 * 减法操作
 */
class OperationMinus extends Operation {
    public int getResult(int a, int b) {
        return a - b;
    }
}
 
/*
 * 乘法操作
 */
class OperationMul extends Operation {
    public int getResult(int a, int b) {
        return a * b;
    }
}
 
/*
 * 除法操作
 */
class OperationDiv extends Operation {
    public int getResult(int a, int b) {
        return a / b;
    }
}
 

public class FactoryMethod{
    public static void main(String[] args) {
        int result = -1;
        Calculator factory = null;
        Operation operation = null;
        
        factory = new Addop();
        operation = factory.createOperation();
        result = operation.getResult(5, 2);
        System.out.println("5 + 2 = " + result);
        
        factory = new Minusop();
        operation = factory.createOperation();
        result = operation.getResult(5, 2);
        System.out.println("5 - 2 = " + result);
        
        factory = new Multiop();
        operation = factory.createOperation();
        result = operation.getResult(5, 2);
        System.out.println("5 * 2 = " + result);
        
        factory = new Divop();
        operation = factory.createOperation();
        result = operation.getResult(5, 2);
        System.out.println("5 / 2 = " + result);

    }
}