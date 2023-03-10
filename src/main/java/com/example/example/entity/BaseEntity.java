package com.example.example.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public class BaseEntity {
    @CreationTimestamp
    @Column(updatable = false) //업데이트할떄는 관여하지않음.
    private LocalDateTime createdTime; //글쓴시간 기준

    @UpdateTimestamp
    @Column(insertable = false) //글쓸때 관여 하지않음
    private LocalDateTime updatedTime; //수정시간 나타냄

}
