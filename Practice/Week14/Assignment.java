package Week14;

public class Assignment {
    public static void main(String[] args) {
        int n;
        descendingSeqRecursive(n=5);
    }

    static void descendingSeqRecursive(int n) {
        if(n==0) {
            System.out.print("0\n");
        } else {
            System.out.print(n+" ");
            descendingSeqRecursive(n-1);
        }
    }
}
