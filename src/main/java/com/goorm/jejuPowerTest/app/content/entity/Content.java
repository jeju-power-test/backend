package com.goorm.jejuPowerTest.app.content.entity;

import com.goorm.jejuPowerTest.app.base.entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor(access = PROTECTED)
public class Content extends BaseEntity {

    @Column(nullable = false)
    private String answer;

    @Column(columnDefinition = "TEXT")
    private String commentary;

    @Column()
    String imageA;

    @Column()
    String imageB;
}
