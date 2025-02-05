# ict_1
ict인재개발원 프로그램

> 기본 규칙
>> 1. 당일 작업한 내용 ReadMe 작성!
>> 2. 당일 작업한 내용 branch 새로 생성하여 저장 후 PR요청
>> 3. 새로 생성된 branch 확인 후 추후 master branch와 merage
>> 4. 마크다운 사용 링크(https://gist.github.com/ihoneymon/652be052a0727ad59601)
>> 5. 마크다운 표 생성 방법(https://velog.io/@dirn0568/Github-ReadMe-%EC%9E%91%EC%84%B1%EB%B2%95%ED%91%9C-%EB%B1%83%EC%A7%80-%EC%9D%B4%EB%AF%B8%EC%A7%80-%EC%B2%A8%EB%B6%80-%ED%86%A0%EA%B8%80)

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
---
## 5일차
### 연산자
- 단항 연산자
- 이항 연산자
  > 이항 연산자는 연산을 진행하기 전 피연산자의 타입을 일치 시킴\ 
  > 피연산자 중 표현 범위 크기가 더 큰 것으로 형변환
  >> byte, char, int => int  
  >> char < int -> int < int \ 
  >> float > double -> double > double
  - 산술, 비교, 논리
- 삼항 연산자
  - 조건 ? (ture) : (flase)
- 대입 연산
### hashCode()와 toString()
- hashCode()
  - 객체가 가진 주소
- toString()
  - 객체 이름
### 접근제한자
|접근제한자|적용대상|접근할 수 없는 클래스|
|:---:|:---:|:---:|
|public|클래스,필드,생성자,메서드|없음|
|protected|필드,생성자,메서드|자식 클래스가 아닌 다른 패키지에 소속된 클래스|
|default|클래스,필드,생성자,메서드|다른 패키지에 소속된 클래스|
|private|필드,생성자,메서드|모든 클래스|
### 대입연산자
- 순수대입연산자 : =
- 복합대입연산자
  - 산술대입연산자 : +=, -=, *=, ...
  - 쉬프트대입연산자 : <<=, >>=, >>>=, ...
  - 비트대입연산자 : &=, ^=, |=
### 쉬프트 연산자
> java에서는 산술연산자로 사용됨
- <<,>>,>>>(자바에서만 제공)
  - 정수 << 자리이동값
- <<,>> 비어있는 왼쪽 부호비트 채움
- '>>>' 비어있는 왼쪽 무조건 0 채움(음수가 양수로 바뀜)
### 일반 논리 연산자
> &&, ||와 같은 논리연산자는 앞이 true/false이면 뒤 쪽 논리를 실행하지 않지만\
 &,|와 같은 비트논리연산자는 앞 결과와 관계없이 끝까지 실행함
### Random
- java.lang.Math의 Math.random
  - 0.0 <= x <= 1.0
  - 원하는 범위의 정수 : (int)(Math.random() * 끝값) + 시작값
- java.util.Random
  - 원하는 범위의 정수 : random.nextInt(원하는 범위의 정수)
---
## 6일차
### 제어문 1
#### if 문
> if문 뒤에 실행할 코드가 한줄이면 {} 생략 가능
<pre><code>
// if - else 문
if(조건) {
  [true 일 때 실행 코드]
} else {
  [false 일 때 실행 코드]

// if - else if - else 문
if(조건1) {
  [조건1이 true 일 때 실행 코드]
} else if(조건2){
  [조건2가 true 일 때 실행 코드]
} else {
    [전부 false 일 때 실행 코드]
}</code></pre>
#### switch 문
> 판단 기준 부분에는 조건식 불가\
> break; 사용해야 switch 문 종료
<pre><code>
switch(판단기준) {
  case 값:
    [실행 코드]
    break;
}
</code></pre>
## 7일차
### 제어문 2
#### for 문
<pre><code>
// for 문
for(초기식; 조건식; 증감식) {
  반복 실행 할 코드
}

// 다중 for 문
for(초기식; 조건식; 증감식) {
  for(초기식; 조건식; 증감식) {
    반복 실행 할 코드
  }
}
</code></pre>
#### while 문 / do-while 문
> while문과 do-while문은 while()이 true일 동안에 계속 loop됨\
> break 사용시 while문 강제 종료됨\
> 두 구문의 차이 조건이 맞는지 체크하는 시점의 차이이다.
<pre><code>
// while 문
while(조건) {
  반복 실행 할 코드
}

// do - while 문
do {
  반복 실행 할 코드
} while(조건)
</code></pre>
