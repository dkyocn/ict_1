# ict_1
ict인재개발원 프로그램

> 기본 규칙
>> 1. 당일 작업한 내용 ReadMe 작성!
>> 2. 당일 작업한 내용 branch 새로 생성하여 저장 후 PR요청
>> 3. 새로 생성된 branch 확인 후 추후 master branch와 merage
>> 4. 마크다운 사용 링크(https://gist.github.com/ihoneymon/652be052a0727ad59601)

## 1일차
- java 21버전 설치
  - https://jdk.java.net/archive/
  - 환경 변수 설정
- eclipse 설치
- java 8, 21 버전 docs 내려받음
- 주석, print, 단축기 syso(System.out.println)
---
## 2일차
- 패키지 생성 시 . 사용가능
  - second.menu(패키지 명).TestMenu(클래스 명).java(확장자)
- 다른 패키지의 메서드 호출, 메서드 생성자 생성방법
### 자료형
  - 논리형
    - boolean(1bit)
  - 정수형
    - byte(1byte)
    - short(2byte)
    - int(4byte)
    - long(8byte)
  - 실수형
    - float(4byte)
    - double(8byte)
  - 한문자
    - char(2byte, '')
  - 문자열
    - String("")
- 변수 초기화 및 자료 형변환
- Wrapper 클래스(대문자로 시작하는 자료형)
- final : 변경 불가 변수
---
## 3일차
### Scanner
  > **사용 시 import 필요!!**
  >> **import java.util.Scanner**\
  >> 같은 클래스 내에서 한번 close하면 다음 메서드 실행 시 다시 열리지 않는 에러있음
  - 각 자료형 별 scanner 사용 방식
    - char 빼고 next(자료형)() 방식으로 사용
- charAt(index)
  - String에서 하나의 문자 추출
  - subString(index,index) 대체 사용 가능
    - 두 개의 차이점 리턴 값 다름 // charAt(char), subString(String)
- next()와 nextLine() 차이
  - next()는 공백 전까지만 출력, nextLine은 공백과 함께 입력된 값 전부 출력
    > **주의) 중간에 nextLine() 사용 시 이전 입력으로 인해 enter가 buffer에 남아있어 clear해주지 않으면\
    >  입력 받지 않음!**
- 8진수, 10진수, 16진수 표기법
  - 8진수 : 0XX(ex.023 -> 8진수 23), %o
  - 16진수 : 0xXX(ex.0xf7 -> 16진수 f7), %x
### 형 변환
- cast 연산자 사용
  - (바꿀자료형) 값 또는 변수 (ex. double num; -> int num1 = (int)num;)
- 자동 형변환
  - 자료형이 다른 값끼리 계산 될때, 메모리 할당 크기가 큰 변수에 작은 자료형 값이 대입될 때\
    **(이 외의 형변환은 강제적으로 해야함)**
  - **byte와 short 자료형 계산 결과는 무조건 int**
  - int와 char 서로 형변환 가능
