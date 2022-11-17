package com.goorm.jejuPowerTest.app.content.repository;

import com.goorm.jejuPowerTest.app.content.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
}
