package twitter.pojo;

public class fibonachi {
    public static void main(String[] args) {
fibonachi fibonachi=new fibonachi();
fibonachi.hesaplama(23);
    }
    public int hesaplama(int a){

        int n1 = 0, n2 = 1, sum = 0;
        int even=0;
        System.out.println(n1 +" "+n2);
        for(int i=2;i<25;i++) {
            sum = n1 + n2;
            System.out.println("  " + sum);
            n1 = n2;
            n2 = sum;
            if(sum/2==0){
                even+=sum;
                System.out.println(even);
            }

        }
        return a+even;

    }
}

