package com.urlmonitor.repository;

import com.urlmonitor.model.Endpoint;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EndpointRepository extends JpaRepository<Endpoint, Long> {
    List<Endpoint> findByUserId(Long userId);
}