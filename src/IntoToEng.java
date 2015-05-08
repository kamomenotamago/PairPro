import java.util.Scanner;
public class IntoToEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();

	        System.out.println(translateEng(input));

	    }

	    //数値を英訳する変換するメソッド
	    static String translateEng(int n) {
	    	String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
	    	String[] boss = {"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred"};
	    	
	    	int[] scan = new scan[5];
	    	while(k>=10){
	    		
	    	}
	    	
	    	/*int forBoss = n/10;
	    	int forNumber = n%10;
	        if(forNumber==0) return boss[forBoss];
	        if(n>=21) return boss[forBoss]+" "+number[forNumber];
	        else return number[n];*/
	}

}
