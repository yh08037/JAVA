# 01/23 멀티채팅 프로그램 1


## 1.  자바에서 I/O 클래스 사용

  - 자바에 I/O(Input / Output) class는 크게 두 가지 부류 나뉨

  (1) byte stream 계열 : 1byte 단위로 데이터 입출력

    대표 클래스
    InputStream   : 1byte 단위로 read, 추상화 클래스
    OutputStream : 1byte 단위로 write, 추상화 클래스
    
    FileInputStream     :  1byte 단위로 파일에서 read
    FileOutputStream  :  1byte 단위로 파일에 write
    
    BufferedInputStream    :  버퍼 기능 제공 
    BufferedOutputStream : 버퍼 기능 제공 



* 문자열 -> 바이트배열   
  ``` java
  String str = "가나다";
  str.getBytes("euc-kr");
  ```
* 바이트배열 -> 문자열
  ``` java
  byte[] b = new byte[1024];
  String msg = new String( b , "euc-kr" );  
  ```
* flush() : buffer 있는 데이터 지금 출력
  trim()  : 빈 공백 제거



* 문자 입출력시 주의사항

  : 영문 / 숫자 / 기호 등은 1byte로 표현이 가능
   (아스키코드표에서 확인)

  : 한글은 1byte 표현이 불가능(아스키코드표에 없음!)

  : 한글을 표시하기 위한 규약인 character-set 은

    utf-8 / euc-kr 두 가지를 주로 사용


  : utf-8 - 한글 처리를 위해 3byte 사용

    euc-kr - 한글 처리를 위해 2byte 사용
