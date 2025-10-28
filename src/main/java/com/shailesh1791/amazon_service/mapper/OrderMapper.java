package com.shailesh1791.amazon_service.mapper;

import com.shailesh1791.amazon_service.dto.OrderDTO;
import com.shailesh1791.amazon_service.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDTO toDto(Order order);

    Order toEntity(OrderDTO orderDTO);
}
