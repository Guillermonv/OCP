package com.example.OCP.advancedClassDesing.nestedClasses.memberInnerClass;

import java.io.Serializable;

/**
 * Created by guille on 10/14/18.
 */

/**
 Member inner class
 can be declared public protected private or use default access
 can extend and implement any class
 can be final or abstract
 cannot declare static fields or methods
 can access members of the outer class including private members
 **/

public class Outter {

  private String greeting = "Hi";

  private final class MemberInner implements Serializable{

      public int repeteat = 3;
      public void go() {
          for (int i=0 ; i< repeteat; i++)
              System.out.println(greeting);
      }
  }

  public void callInner(){
      MemberInner inner = new MemberInner();
      inner.go();
  }

  public static void main (String ...args){
      Outter memberInnerClass = new Outter();
      memberInnerClass.callInner();

      //MemberInner inner = new MemberInner(); will fail
      MemberInner inner = new Outter().new MemberInner();
      inner.go();
  }
}
