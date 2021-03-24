
public class A {void m1(A a) {System.out.print("A");}}
class B extends A {void m1(B b) {System.out.print("B");}}
class C extends B {void m1(C c) {System.out.print("C");}}
class D {
  public static void main(String[] args) {
    A a1 = new A(); B b1 = new B(); C c1 = new C(); A c2 = new C();
    c2.m1(a1); c2.m1(b1); c2.m1(c1);
}}