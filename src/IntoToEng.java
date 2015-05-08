import java.util.Scanner;
public class IntoToEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();

	        System.out.println(translateEng(input));

	    }

	    //���l���p�󂷂�ϊ����郁�\�b�h
	    static String translateEng(int n) {
	    	String[] number = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
	    	String[] boss = {"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred"};
	    	int k=n;
	    	String ans = "";
	    	if(n==0)return "zero";
	    	
	    	if(k>999){
	    		ans = number[k/1000]+" thousand";
	    		k=k%1000;
	    		if(k!=0) ans += " ";
	    	}
	    	if(k>99){
	    		ans = number[k/100]+" hundred";
	    		k=k%100;
	    		if(k!=0) ans += " ";
	    	}
	    	
	    	int forBoss = k/10;
	    	int forNumber = k%10;
	        if(forNumber==0) ans += boss[forBoss];
	        else if(k>=21 && forNumber!=0) ans += boss[forBoss]+" "+number[forNumber];
	        else ans += number[k];
	        
	    	return ans;
	}

}
