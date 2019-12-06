# 01/15 객체지향형 프로그래밍

## 1. OOP(객체지향형 프로그래밍)는 왜 필요??

   - 유지 보수 관리가 편리한 프로그램 -> OOP

   - object는 무엇?

     : 메모리에 올라간 클래스

     : 특정 클래스 메모리에 올리는 문법

      => `Test t = new Test();`


* 컴퓨터 구조에서 CPU는 하드디스크에 있는 내용을 읽을 수 없음.  

  RAM(메모리)에 있는 내용만 읽을 수 있음
  
  자바에서는 메모리에 변수나 메소드를 올려줄때 
  
  해당 되는 변수, 메소드가 포함된 클래스를 통채로 올려줌
  
 - 객체(Object)는 무엇?

	=> 메모리에 올라간 클래스!!  


## 2. static  

   프로그램이 시작될 때 제일 처음 스스로 메모리에 단 한번 올라가며
   프로그램이 끝날 때까지 존재

   : 대표적인 static method => main method


## 3. 객체지향형 프로그램의 출발점

  - 모든 멤버변수 private 선언
  - public 접근제한자를 가지는 getXXX, setXXX 메소드 구현