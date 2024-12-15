package de.telran.onlineshop.repository;

import de.telran.onlineshop.entity.OrderItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItemsEntity, Long> {
}
