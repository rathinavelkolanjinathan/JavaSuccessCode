package Javacorecode.jdk8;


@FunctionalInterface
public interface MathOperation<Intetger>  {

    //SAM -- Single Abstract Method.
    //identifier abstract is optional
    Integer operate(Integer operand);

    default MathOperation<Integer> add(Integer o){
        return (o1) -> operate(o1) +   o;
    }

    default MathOperation<Integer> multiply(Integer o){
        return (o1) -> operate(o1) * o;
    }

    default MathOperation<Integer> subtract(Integer o){
        return (o1) -> operate(o1) -   o;
    }

    default MathOperation<Integer> divide(Integer o){
        return (o1) -> operate(o1) / o;
    }

    default Integer getResult() {
        return operate(0);
    }

    default void print(){
        System.out.println("result=" + getResult());
    }

    //static helper to initialize
    static Integer init(Integer input) {
        return input  ;
    }

}
