package com.shailesh1791.amazon_service.repo;

import com.shailesh1791.amazon_service.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderServiceRepo extends JpaRepository<Order,Long> {
}
