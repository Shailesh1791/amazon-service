package com.shailesh1791.amazon_service.mapper;

import com.shailesh1791.amazon_service.dto.ProductDTO;
import com.shailesh1791.amazon_service.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO toDto(Product product);

    Product toEntity(ProductDTO productDTO);
}
