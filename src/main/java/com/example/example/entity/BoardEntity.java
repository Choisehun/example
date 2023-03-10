package com.example.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="boardtest")
@Data
public class BoardEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동증가
    Long id;

    @Column
    private String boardPW;
    @Column(nullable = false)
    private String boardTitle;
    @Column
    private String boardContent;
    @Column
    private String boardHits;



}

