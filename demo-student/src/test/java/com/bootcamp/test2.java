package com.bootcamp;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class test2 {
  private static Student s1=new Student("tom");

  /* @BeforeAll
  public  static void setup() {
     s1 = new Student("tom");

  } */
  @Test
  void _01_testaddsubject(){
    Assertions.assertEquals(1, s1.addsubject(Subject.Chinese, 55).size());
    Assertions.assertEquals(2, s1.addsubject(Subject.English, 45).size());
    //Assertions.assertEquals(3, s1.addsubject(Subject.Chinese, 45).size());
    Assertions.assertTrue(s1.getSubjects().containsKey(Subject.Chinese));
    Assertions.assertTrue(s1.getSubjects().containsKey(Subject.English));

  }
  @Test 
  void _02_testcheckscore(){
    Assertions.assertEquals(55, s1.checkscore(Subject.Chinese));
    Assertions.assertEquals(45, s1.checkscore(Subject.English));

  }
  @Test
  void _03_testcheckaverageScore(){
    Assertions.assertEquals(50, s1.checkaverageScore());

  }

}