package test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class solution1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 
		//����3. ������ ���ݾ� �������� ���� ���޵Ǿ���ϴ� �ݾ��� ����

		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner("4 15.00 15.01 3.00 3.01 0");
		//Scanner sc = new Scanner("3 10.00 20.00 30.00 0");
		      		
		int N = sc.nextInt(); //�ο���
		BigDecimal[] people = new BigDecimal[N];
		BigDecimal sum = new BigDecimal(0);
		BigDecimal avg = new BigDecimal(0);

		BigDecimal diffVal = new BigDecimal(0);
		BigDecimal answer = new BigDecimal(0);
		
		for (int  test_case = 0 ; test_case < N ; test_case++){
		   people[test_case] = sc.nextBigDecimal();
		   sum = sum.add(people[test_case]);
		   //0�� ������ ����
		  
		}

		if(sc.nextInt() == 0){
			 //���
			 avg = sum.divide(BigDecimal.valueOf(N)).setScale(2, RoundingMode.DOWN);
	    }  
		System.out.println("���: "+avg+":"+ N);

		
		for (int  test_case = 0 ; test_case < N ; test_case++){
		    diffVal = people[test_case].subtract(avg);
            if(diffVal.compareTo(new BigDecimal(0)) < 0){            	
            	diffVal = diffVal.multiply(new BigDecimal(-1));
            }
    		System.out.println("#����: "+test_case+":"+ diffVal);

    		answer = answer.add(diffVal);
		   
		}
		answer = answer.divide(new BigDecimal(2));
		
		System.out.println("#SOLUTION 1 diffVal : "+ answer);
	}
}
