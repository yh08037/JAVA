
# 01/16 자바의 기본 문법 

## 1. 조건문

   ``` java
   if (조건문) {
       [참일 경우 실행]
   } else {
       [거짓일 경우 실행]
   } 
   ```

   : switch ~ case 문

   ``` java
   int x = 10;
   
   switch( x ) {
       case 10:
           [10일 경우 실행]
	   break;
       case 9:
           [9일 경우 실행]
           break;
   }
   ```

   

  * switch ~case 문의 경우 지정된 값이 특정 case에 해당되면 
    하위 case를 모두 실행, 따라서 특정 case만 실행 후 종료 하기위해 
    break 문을 사용


## 2. 연산자

   : ++, -- 
   : +=, -=
   : &&, &, ||, |   => 두 개 모인놈이 더 똑똑


  && - 앞에 조건이 false 라면 뒤에 조건 확인 하지 않음
  &  - 앞의 조건에 상관없이 뒤에 조건 확인

  || - 앞에 조건이 true 라면 뒤에 조건 확인 하지 않음
  |  - 앞의 조건에 상관없이 뒤에 조건 확인


## 3. 반복문
    : for
    : while, do~while 

## 4. 배열

(1) int[] x = {10,20,30};

(2) int[] x = new int[3];
     x[0] = 10;
     x[1] = 20;
     x[2] = 30;

(3) int[] x = new int[]{10,20,30};


## 5. 메소드(method)  - 재활용 하기 위해서 사용, 중복되는 코드 제거


  * 정의방법
  ```
    접근제한자   리턴형    메소드이름  ( 파라미터)  {
    }
  ```
``` java
  public  int  add(int x, int y) {
       int result = x + y;
       return result;   	//리턴형이 존재하는 경우 필수
  }
```  
 * 접근제한자 종류 (4가지)
 
 	`public  - protected - default - private`

 * 리턴형 종류
 
 	- 기본자료형
 	- Object
 	- void : 리턴값이 없는경우


