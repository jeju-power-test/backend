package com.goorm.jejuPowerTest.app.view.repository;

import com.goorm.jejuPowerTest.app.view.entity.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ViewRepository extends JpaRepository<View, Long> {

}
