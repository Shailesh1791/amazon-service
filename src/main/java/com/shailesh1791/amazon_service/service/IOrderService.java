package com.shailesh1791.amazon_service.service;

import com.shailesh1791.amazon_service.dto.OrderDTO;
import com.shailesh1791.amazon_service.dto.ProductDTO;
import com.shailesh1791.amazon_service.dto.SearchProductDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IOrderService {

    public OrderDTO getOrderById(long orderId);

    public List<OrderDTO> getAllOrders();

    public OrderDTO saveOrder(OrderDTO orderDTO);

    public OrderDTO updateOrder(long orderId, OrderDTO orderDTO);

    public OrderDTO deleteOrder(long orderId);
}
