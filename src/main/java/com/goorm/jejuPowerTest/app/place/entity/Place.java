package com.goorm.jejuPowerTest.app.place.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
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
public class Place extends BaseEntity {

    @Column(nullable = false)
    String title;

    @Column(columnDefinition = "TEXT")
    String description;

    @Column(nullable = false)
    String url;

    @Column(nullable = false)
    String image;
}
