package day02;
/*
문제1. 밥값이 얼마더라?
메뉴 주문 개수에 따른 계산서를 출력하시오.
요구사항
1. 메뉴의 가격은 아래와 같음
     - 돈까스: 8000원
     - 칼국수: 6000원
     - 왕만두: 5000원
2. 숫자들이 오른쪽 정렬된 것에 유의할 것 (printf)

------------
출력 예
-----------

돈가스 X 16 = 128000
칼국수 X  6 =  48000
왕만두 X  1 =   5000
========================
총합: 181000
*/

public class Receipt {

    // 1. donNum, kalNum, wangNum
   int donNum = 16;
   int kalNum = 8;
   int wangNum = 1;
   
   // 2. 돈가스 합계변수, 칼국수 합계변수, 왕만두 합계변수 
   // donSum, kalSum, wangSum
   int donSum = 8000 * donNum;
   int kalSum = 6000 * kalNum;
   int wangSum = 5000 * wangNum;
   
   // 3. 밥값 계산 변수(total) 
   //  위 3개의 합계값을 더한다.
   int total = donSum + kalSum + wangSum;
   // 4. 생성자
   public Receipt() {
	   
	   
   }
   
   // 계산서 출력 매소드 정의
   
   // 5. 
   public void cal(){
	   System.out.printf("%s X %2d = %6d\n", "돈가스", donNum, donSum);
       System.out.printf("%s X %2d = %6d\n", "칼국수", kalNum, kalSum);
       System.out.printf("%s X %2d = %6d\n", "왕만두", wangNum, wangSum);
       System.out.printf("==========================\n");
       System.out.printf("총합: %d\n", total);
    }

   public static void main(String[] args) {
     Receipt receipt = new Receipt();
     receipt.cal();
   }
}
