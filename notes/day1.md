# 01/14 자바 개발 환경 구성
## 1. 자바 설치
```
- java.sun.com 접속
- 우측 java SE 선택
    - 왼쪽 자바 아이콘 선택  
    - 라이센스 동의 후
    - OS에 적합한 자바 버전 다운
    	- x86 : 32bit 
	- x64 : 64bit
- 편집툴(개발툴) 설치 - IDE(integrated development environment)
   : Eclipse - www.eclipse.org
   : NetBeans
   : JBuilder
   : 메모장, UltraEditor, EditorPlus ...
```

## 2. 자바 코드 생성, 실행

* 자바 코드가 만족해야할 기본 조건
	- 하나 이상의 클래스가 존재
	- 파일에 확장자가 .java
	- 파일명이 클래스명과 동일
	- 하나의 파일에 두개이상의 클래스 생성이 가능
		(public class 명이 파일명이 되어야 함)


* 자바 컴파일 및 실행
  - 컴파일 : javac.exe 사용
    javac FileName.java
   => 결과물 - FileName.class

  - 실행   : java.exe 사용
    java FileName   (.class 파일이 사용)


* CLI 환경에서의 명령어
  - cd : 디렉토리 변경
  - dir : 디렉토리 내용보기
  - cls : clear screen
  - d: , c:   드라이브 변경   


## 3. 변수 ?
```
    int x       = 10;
   (변수 선언    할당)
```
## 4. 자바의 기본자료형 
```
   - 정수형 : byte - short - int - long  : default int
            (1byte)  (2 )   (4 )  ( 8 )

   - 실수형 : float - double , default double

   - 문자형 : char  ex) char c = 'A';  char c = 65;

   - boolean : true , false
```

## 5. 자바에서의 "=" 의미

  - 기본자료형만 값이 넘어감

  - 기존자료형 이외에 나머지는 모두 주소값이 넘어감
