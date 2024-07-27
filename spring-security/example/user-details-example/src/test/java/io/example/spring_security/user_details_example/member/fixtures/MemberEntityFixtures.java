package io.example.spring_security.user_details_example.member.fixtures;

import io.example.spring_security.user_details_example.member.entity.MemberEntity;
import io.example.spring_security.user_details_example.member.entity.factory.MemberEntityFactory;
import java.util.List;

public class MemberEntityFixtures {

  public static List<MemberEntity> adminMembersForCreate1(){
    return List.of(
        new MemberEntityFactory().createMember("a@email.com", "aaaaaaa", "ROLE_ADMIN,ROLE_USER"),
        new MemberEntityFactory().createMember("b@email.com", "bbbbbbb", "ROLE_ADMIN"),
        new MemberEntityFactory().createMember("c@email.com", "ccccccc", "ROLE_ADMIN,ROLE_USER")
    );
  }

}
