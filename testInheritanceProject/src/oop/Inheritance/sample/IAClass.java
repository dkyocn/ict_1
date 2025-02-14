package oop.Inheritance.sample;

/**
 * 인터페이스(완벽한 추상 클래스) 끼리 상속 시에도 extends 사용함
 * 인터페이스 상송에는 다중 상속 허용함
 */
public interface IAClass extends IBClass, ICClass {

}

interface IBClass {}

interface ICClass {}