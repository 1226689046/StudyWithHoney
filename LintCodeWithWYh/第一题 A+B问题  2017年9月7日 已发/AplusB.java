public class AplusB{
    public static void main(String[] args){
	AplusB ab = new AplusB();
	ab.add(1,2);
	ab.addWithoutPlus(2,3);
	
    }

    public void add(int a,int b){
	System.out.println(a+b);
    }
    public void addWithoutPlus(int num_1 , int num_2){
	int sum;
	int arr;
	do{
	    sum = num_1 ^num_2;
	    arr = (num_1 &num_2)<<1;
	    num_1  = sum;
	    num_2 = arr;
	}while(arr!=0);

	System.out.println("without+"+sum);
    }
}