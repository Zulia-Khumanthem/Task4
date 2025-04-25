public class  AscendingAndDescending{
    public static void printAscending(int start,int end){
        If (start>end){ // base case
            return;
        }
        System.out.print(start + “ “);
        printAscending(start + 1, end);
    }

    public static void printDescending(int start, int end){
        If (start>end){ // base case
            return;
        }
        System.out.print(start + “ “);
        printAscending(start - 1, end);
    }

    public static void main(String[] args){
        int startAsc=1;
        int endAsc=10;
        int startDes=10;
        int endDes=4;
        System.out.println(“Ascending Order:”);
        printAscending(startAsc,endAsc);

        System.out.println(“Descending Order:”);
        printAscending(startDes,endDes);
    }
}
