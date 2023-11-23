package kg.app.calculatorjavafx;

public class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String msg){
        super(msg);
    }
}