package com.sample.myapp.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class Member {
   private String memberId;
   private String name;
   private int age;
   private String email;
}