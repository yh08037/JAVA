
# 01/18 String 클래스

## 1. String 클래스의 2가지 특징

  (1) 암시적인 객체 생성을 지원 
  ``` java
  String str = "ABC";   -> 가능
  ```
   * 문자열의 값 비교는 .equals()메소드 사용할것

  (2) 불변적인 특징을 가짐
  ``` java
      String name = "ABC";    //메모리에"ABC" 생성
      name = name + "D";      //메모리에 "ABCD" 추가생성
      name = name + "E";      //메모리에 "ABCDE"추가생성
      //최종적으로 "ABC", "ABCD", "ABCDE" 세 개가 메모리에 존재
  ```
  
  * 자바에서는 문법적으로 객체 할당(new)은 존재하나 반대 개념인 객체해제는 문법적으로 존재하지 않음
    
  * 대신 GC(Gabage Collector)가 불필요한 메모리 자원을 해제해준다

  * 따라서 String class를 변경이 빈번하게 일어나는 문자열 저장을 위해 사용하면 성능저하 또는 불필요한 메모리릭 문제가 생길 수 있음
      
  * 하드웨어 자원이 PC에 비해 상대적으로 부족한 모바일에서는 문자열 변경이 자주 일어나는 경우에 String class를 사용하지 말것
     대신 StringBuffer class등을 사용할 것


## 2. StringTokenizer class


* 숫자 -> 문자열  :   숫자 + "~"

* 문자열 -> 숫자 

	* 문자열 -> int 형으로
  	```java
	Integer.parseInt( "7" );
	```

	* 문자열 -> double 형으로
	``` java  
  	Double.parseDouble("0.3");
	```
	
	* 문자열 -> byte 형으로
	``` java
	Byte.parseByte("10");
	```


## 3. method overriding




* eclipse 기본 단축키

 - 한줄 지우기    : Ctrl + d

 - 주석 처리      : Ctrl + /

 - 들여쓰기 조정  : Ctrl + Shift + f

 - 자동 완성      : Ctrl + Space

 - import 	 : Ctrl + Shift + o

 - 실 행	         : Ctrl + F11

