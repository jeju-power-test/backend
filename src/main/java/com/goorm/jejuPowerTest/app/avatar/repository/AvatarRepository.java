package com.goorm.jejuPowerTest.app.avatar.repository;

import com.goorm.jejuPowerTest.app.avatar.entity.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {
    Optional<Avatar> findByPositiveAndNegative(String positive, String negative);
}
