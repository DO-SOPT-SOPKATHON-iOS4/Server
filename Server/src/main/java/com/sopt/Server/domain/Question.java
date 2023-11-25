package com.sopt.Server.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "QUESTIONS")
public class Question {

    @Id @Getter
    @Column(name = "question_id")
    private Long id;

    private String question_content;
}
