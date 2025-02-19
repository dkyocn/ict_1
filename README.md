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
---
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
---
## 8일차
### 배열
#### 1차원 배열
- 1차원 배열 선언 방법
  - 자료형[] 배열명;
  - 자료형 배열명[];
  - 배열명 = new 자료형[갯수]
  - 자료형[] 배열명 = new 자료형[첨자]
  - 자료형[] 레퍼런스변수 = {초기값, 초기값, 초기값}
  - 자료형[] 레퍼런스변수 = new 자료형[]{초기값, 초기값, 초기값}
- 배열 기본값
  - int -> 0
  - String -> null
  - boolean -> false
---
## 9일차
### 배열
#### 다차원 배열
- 2차원 배열 선언 방법
  - 자료형[][] 배열명;
  - 자료형 []배열명[];
  - 자료형 배열명[][];
- 2차원배열.length -> 행 개수
- 2차원배열[i].length -> 열 개수
> **2차원 배열 생성 시 열의 개수가 각각 다른 가변 배열 생성 가능!!**
#### 정렬
> 정렬 방식
>> select, bubble, insert, quick, mearge, radix, dual-pivot
<pre><code>
// select(이진탐색) / 오름차순
	public void sortAscending(int[] arr) {
		
		for(int step = 0; step < arr.length; step++) { // 각 단계별 반복, 값을 정할 기준 위치
			for(int i = step+ 1; i<arr.length; i++) { // 값을 비교하는 반복
				if(arr[step]>arr[i]) { // 앞자리의 값이 크면 두 값을 교환
					swap(arr, step, i); // 작은 값을 계속 앞으로 보내는 방식
				}
				
			}
		}
	}
</code></pre>
---
## 10일차
### 객체지향프로그래밍(OOP) - 1
#### OOP의 3대 특징
- 캡슐화
- 상속
- 다형성
#### 클래스 용도
- 실행용 클래스 : main() 메서드 포함
- 기능 제공용 클래스 : 주로 메서드로만 구성됨
- 데이터 저장용 클래스 : vo(value object), do(domain object), dto(data transfer object) 로 표현(캡슐화)
#### 필드 선언
<pre><code>
// 기본
private String sname;
private String major;
private double score;
private String grade;
private int rank;
// 정적
private static int count;
// 상수
public static final int MAX = 5; // 생성할 수 있는 최대 객체 수
</code></pre>
#### OverLoading(오버로딩)
> 오버로딩(중복 작성)의 조건 : 매개변수가 달라야 함(개수, 자료형 )
<pre><code>
// 기본 생성자
public Student() {}
// 오버로딩한 생성자
public Student(int sno, String sname) {
	// 전달 값은 필드 초기화에 사용됨
	// 필드 명 = 전달 값;
	this.sno = sno;
}
// 오버로딩한 생성자 2
public Student(int sno, String sname, String major, double score, String grade, int rank) {
	this.sno = sno;
	this.sname = sname;
	this.major = major;
	this.score = score;
	this.grade = grade;
	this.rank = rank;
}
</code></pre>
---
## 11일차
### 객체지향프로그래밍(OOP) - 2
> 접근제한자 설계 시 기호
> - public +
> - default ~
> - protected #
> - private -
#### Getter 와 Setter 
> **Setter**
> - 객체 안의 필드(인스턴스변수)의 값 변경하는 메서드
<pre><code>
// setter 생성 예
public void setName(String name) {
	this.name = name; // 여기서 this.name은 필드에 선언되어 힙메모리에 저장된 변수
}
// setter 사용 예
School school = new School(); // 생성자 주입
school.setName("카일"); 
</code></pre>
> **Getter**
> - 필드에 기록된 값을 읽어서, 요구하는 쪽으로 넘기는 메소드
<pre><code>
// getter 생성 예
public String getName() {
	return this.name;
}
// Getter 사용 예
School school = new School(); // 생성자 주입
String name = school.getName(); 
</code></pre>
---
## 12일차
### 객체지향프로그래밍(OOP) - 3
#### 큐와 스택
- 큐 - FIFO
- 스택 - LIFO
#### 객체 배열
- **객체 배열 초기화**
  - 객체[] 변수명 = new 객체[배열 크기];
  - 객체[] 변수명 = {new 객체, new 객체, ....};
#### static Getter & Setter
<pre><code>
// setter
public static void setBookcount(int bookCount) {
	// static 메서드 안에는 this 레퍼런스 없음
	Book.bookCount = bookCount; // 파라메터와 지역변수의 이름이 다를 시 Book. 없이 바로 저장 가능
}
// getter
public static int getBookCount() {
	return bookCount;
}
</code></pre>
#### 초기화 블럭
<pre><code>
public class BookManager {	
	private Book[] bar;
	Scanner sc;
	private static int count; 
	
	// 생성자보다 먼저 실행됨
	{
		bar = new Book[10];
		new Scanner(System.in);	
	}
	
	// static 필드 초기화 블럭
	static {
		count = 0;
	}
}

</code></pre>
---
## 13일차
### 객체지향프로그래밍(OOP) - 3
#### Class(클래스)
- public class 클래스명{}  -> 공개하는 클래스로 다른 패키지에서 사용 가능함
- class 클래스명{} -> 디폴트 클래스로 다른 패키지에서 사용 못함
> 클래스 사용법
> - 같은 패키지 안에 있는 클래스 끼리는 import 하지 않고 사용 가능
> - 다른 패키지 안에 있는 클래스가 사용하려면 사용하려는 클래스가 public 이면서 import 선언해야 사용 가능
> 	- 레퍼헌스 변수명 = new 클래스명();
#### Method(메서드)
> **Method 종류**
> - 매개변수 리턴 전부 없는 메서드 ->  void test(){}
> - 매개변수는 있지만 리턴 없는 메서드 -> void test(int num) {}
> - 매개변수는 없지만 리턴이 있는 메서드 -> String test() {}
> - 매개변수와 리턴 전부 있는 메서드 -> String test(int num) {}
---
## 14일차
### 상속(Inheritance)
- 클래스 재사용 목적
- 다른 클래스가 가지고 있는 맴버들을 새로 작성할 클래스에서 직접 만들지 않고 상속을 받음으로 써 새 클래스가 자신의 맴버처럼 사용할 수 있는 기능
> - 클래스 상속 시 extends, 인터페이스 상속 시 implements
> - 인터페이스 상속 시 여러 개 상속 가능, 클래스 상속 시 단일 상속만 가능
> - 클래스 인터페이스 모두 상속 시 클래스 먼저 상속 받은 후 인터페이스 상속\
> (extends 클래스명 implements 인터페이스 명)
---
## 15일차
### 다형성(Polymorphism)
> 메서드의 매개변수 하나가 여러 종류의 클래스 타입을 처리할 수 있는 기능\
> **부모 클래스 타입의 레퍼런스가 후손객체의 주소를 받을 수 있다.**
- ex) AA가 BB의 부모클래스 일 때 AA aob = new BB(); -> 자동으로 AA클래스 형으로 형변환 됨
- 부모 클래스 타입을 후손 클래스 타입으로 바꾸는 것은 자동 처리가 되지 않음
---
## 16일차
### 추상(abstract) 클래스와  interface
#### 추상(abstract) 클래스
> - 클래스 내에 abstract 클래스가 하나라도 존재하면 해당 클래스 abstract 클래스로 생성해야 함
> - 자손 클래스에서는 부모 클래스의 abstract 클래스를 전부 오버라이딩 해야 하며\
> 접근제한자를 반드시 따라가야함
<pre><code>
// abstract 클래스(부모 클래스)
public abstract class 클래스명 {	
	public abstract void abstMethod();
	public abstract void testMethod();
}

// 자손 클래스
public class 클래스명 extends 부모클래스명 {
	@Override
	public void abstMethod() {
		(메서드 구현)
	}

	@Override
	private void testMethod() { <- 접근제한자가 부모클래스와 달라 error!!
		(메서드 구현)
	}
}

</code></pre>
#### interface
> - interface 생성 시 public abstract가 생략 되어있음
> - interface 상속받아 구현 시 반드시 public 사용해야 함
<pre><code>
// interface 클래스(부모 클래스)
public interface 클래스명 {
	(public abstract 생략) int div(int a, int b);
	int sum(int a, int b);
}

// 자손 클래스
public class 클래스명 implements 부모클래스명 {
	@Override
	public int div(int a, int b) {
		return a / b;
	}
	// interface는 기본적으로 public abstract가 생략되어 있어 public 이 외의 접근제한자 사용 시 error
	@Override
	private int sum(int a, int b){
		return a+ b;
	}
	
}
</code></pre>
### String 관련 클래스
