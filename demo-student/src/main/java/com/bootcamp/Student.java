package com.bootcamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Student {
  private String name;
  private HashMap<Subject,Integer> subjects;

  public Student(String name){
    this.name=name;
    this.subjects=new HashMap<>();

  }
  public HashMap<Subject,Integer> addsubject(Subject s1,Integer score){
    if(this.getSubjects().containsKey(s1)||score<0||score>100){
      throw new IllegalArgumentException();
    }
    this.getSubjects().put(s1, score);

    return this.subjects;
  }
  public Integer checkscore(Subject s1){
    Integer score =-1;
    if(!(this.getSubjects().containsKey(s1))){
      throw new IllegalArgumentException();
    }
    for(Map.Entry<Subject,Integer> test1:this.getSubjects().entrySet()){
      if(s1.equals(test1.getKey())){
        score=test1.getValue();
      }
    } return score;
  }
  public double checkaverageScore(){
    Integer count=0;
    Integer totalScore=0;
    if(this.getSubjects().size()<=0){
      throw new IllegalArgumentException();
    }
    for(Map.Entry<Subject,Integer> test:this.getSubjects().entrySet()){
      count=count+1;
      totalScore=totalScore+test.getValue();
    } return totalScore/count;
  }

  
  
}
