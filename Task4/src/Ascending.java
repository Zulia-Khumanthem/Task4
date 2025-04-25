public class  Ascending{
public static void printAscending(int start, int end){
    If (start>end){ // base case
        return;
    }
    System.out.print(start + “ “);
    printAscending(start + 1, end);
}
public static void main(String[ ] args){
    int start = 1;
    int end = 10;
    printAscending(start,end);
}
}
