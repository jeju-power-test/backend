package com.goorm.jejuPowerTest.app.avatar.entity;

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
public class Avatar extends BaseEntity {
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String image;

    String positive;

    String negative;
    @Column(nullable = false)
    Long friend;
}
