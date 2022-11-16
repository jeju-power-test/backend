package com.goorm.jejuPowerTest.app.avatar.repository;

import com.goorm.jejuPowerTest.app.avatar.entity.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {
}
