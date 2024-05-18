/*  [X] Built in Array container
    [X] Initial Capacity 5
    []  CheckCapacity Method
    []  Single Default Constructor
    []  Container Generics
    []  Throw Exceptions
    []  Array should be treated as ring buffer
*/
public class ArrayDeque {
    E[] arr;
    static final int INITIAL_CAPACITY=5;
    int front, rear,size;

    ArrayDeque(){
        arr=new arr[INITIAL_CAPACITY];
        front =-1;
        rear=-1;
        size=0;
    }

    



}
