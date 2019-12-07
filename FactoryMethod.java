package FacMethod;
/*
 * �����ӿ�
 */
interface Calculator {
    Operation createOperation();
}
 
/*
 * �ӷ���������
 */
class Addop implements Calculator {
    public Operation createOperation() {
        return new OperationAdd();
    }
}
 
/*
 * ������������
 */
class Minusop implements Calculator {
    public Operation createOperation() {
        return new OperationMinus();
    }
}
 
/*
 * �˷���������
 */
class Multiop implements Calculator {
    public Operation createOperation() {
        return new OperationMul();
    }
}
 
/*
 * ������������
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
 * �ӷ�����
 */
class OperationAdd extends Operation {
    public int getResult(int a, int b) {
        return a + b;
    }
}
 
/*
 * ��������
 */
class OperationMinus extends Operation {
    public int getResult(int a, int b) {
        return a - b;
    }
}
 
/*
 * �˷�����
 */
class OperationMul extends Operation {
    public int getResult(int a, int b) {
        return a * b;
    }
}
 
/*
 * ��������
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