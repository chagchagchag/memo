package io.example.spring_security.password_encoder_example.member;

import io.example.spring_security.password_encoder_example.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
