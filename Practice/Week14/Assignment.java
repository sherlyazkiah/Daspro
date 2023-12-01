package Week14;

public class Assignment {
    public static void main(String[] args) {
        int n;
        descendingSeqRecursive(n=5);
        System.out.print(descSeqRecursive(n=5));
        System.out.print(sumRecursive(n=5));
    }

    static void descendingSeqRecursive(int n) {
        if(n==0) {
            System.out.print("0\n");
        } else {
            System.out.print(n+" ");
            descendingSeqRecursive(n-1);
        }
    }

    static String descSeqRecursive(int n) {
        if(n==0) {
            return ("0\n");
        } else {
            return (n+" ").concat(descSeqRecursive(n-1));
        }
    }

    static int sumRecursive(int n) {
        if(n==1) {
            return 1;
        } else {
            return n + sumRecursive(n-1);
        }
    }
}
