package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution2 {
	static Map<String, char[][]> map = new HashMap<String, char[][]>();
    static char[][][] a = new char[10][5][3];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 
		//����4. LCD ���÷��� ����

		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner("2 1");
		      		
		
		int s = sc.nextInt(); //���ڸ� ǥ���ϴ� ũ�� 1<= s <=10
		String n = sc.next(); //����� ����
		
		setNumber();
		//setDisplayChange(s,n);
		/*for (int  test_case = 0 ; test_case < N ; test_case++){
		   people[test_case] = sc.nextBigDecimal();
		   sum = sum.add(people[test_case]);
		   //0�� ������ ����
		  
		}

		if(sc.nextInt() == 0){
			 avg = sum.divide(BigDecimal.valueOf(N)).setScale(2, RoundingMode.DOWN);//���
	    }  
		System.out.println("���: "+avg+":"+ N);

		
		for (int  test_case = 0 ; test_case < N ; test_case++){
		    diffVal = people[test_case].subtract(avg);//.setScale(0, RoundingMode.DOWN);
            if(diffVal.compareTo(new BigDecimal(0)) < 0){            	
            diffVal = diffVal.multiply(new BigDecimal(-1));
            }
    		System.out.println("#����: "+test_case+":"+ diffVal);

		    	answer=answer.add(diffVal);
		   
		}
		answer=answer.divide(new BigDecimal(2));
		*/
		for (int k = 1; k <= 9; k++) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 3; j++) {

					System.out.print(a[k][i][j]);
				}
				System.out.println("");
			}
		}
		System.out.println("#SOLUTION 2 END!");
	}

	private static void setNumber() {
	//	Map<String, char[][]> map = new HashMap<String, char[][]>();

//		a = new char[5][3];
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 3; j++) {
//				a[i][j] = ' ';
//			}
//		}

		a[1][0][2] = a[1][2][2] = a[1][4][2] = '|';  //1

		a[2][0][1] = a[2][2][1] = a[2][4][1] = '_';  //2
		a[2][1][2] = a[2][3][0] = '|';
		
		a[3][0][1] = a[3][2][1] = a[3][4][1] = '_';  //3
		a[3][1][2] = a[3][3][2] = '|';
		
		a[4][2][1] = a[4][2][2] = '_';  //4
		a[4][0][0] = a[4][1][0] = a[4][0][1] = a[4][1][1] = a[4][3][1] = a[4][4][1]= '|';
		
		a[5][0][1] = a[5][2][1] = a[5][4][1] = '_';  //5
		a[5][1][0] = a[5][3][2] = '|';
		
		a[6][0][1] = a[6][2][1] = a[6][4][1] = '_';  //6
		a[6][1][0] = a[6][3][0] = a[6][3][2] = '|';
		
		a[7][0][1] = a[7][0][2] =  '_';  //7
		a[7][1][0]  = a[7][1][2] = a[7][2][2] = a[7][3][2] =  a[7][4][2] = '|';
		
		a[8][0][1] = a[8][2][1] = a[8][4][1] = '_';  //8
		a[8][1][0] =  a[8][2][0] = a[8][3][0] = a[8][4][0] = a[8][1][2] = a[8][3][2] = '|';
		
		a[9][0][1] = a[9][2][1] = a[9][4][1] = '_';  //9
		a[9][2][0] = a[9][2][2] =a[9][1][0]  = a[9][1][2] = a[9][3][2] =a[9][4][2] = '|';
	}
	
	private static void setDisplayChange(int s, String n){
		int row = 2*s+3; //��
		int col = s+2;  //��
		
		for (int  i=0 ; i < row ; i++){
           for(int  j=0 ; j < col ; j++){
        	   if("1".equals("n") &&  i%2==0 && j==col-1){
        			a[1][i][j] = a[1][i][j] = '|';
        	   }
       		System.out.print(a[i][j]);

           }
   		System.out.print("\n");

		}

	}
	
	
	
}
