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
	    	String[] number = {"","one","two","three","four","five","six","seven","eight","nine"};
	        return number[n];
	}

}
