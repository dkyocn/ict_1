package oop.Inheritance.sample;

/**
 * 클래스가 인터페이스를 상속받을 수 있음 : implements 사용
 * 인터페이스 상속에는 다중 상속이 가능함 : 인터페이스 여러 개 상속 받을 수 있음
 */
public class SubClass implements ISuper1, Isuper2, java.io.Serializable {

}

interface ISuper1 {}

interface Isuper2 {}