package com.shailesh1791.amazon_service.service;

import com.shailesh1791.amazon_service.dto.ProductDTO;
import com.shailesh1791.amazon_service.dto.SearchProductDTO;
import com.shailesh1791.amazon_service.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IProductService {

    public ProductDTO getProductByProductId(long productId);

    public List<ProductDTO> getAllProducts();

    public ProductDTO getProductByProductName(String productName);

    public ProductDTO saveProduct(ProductDTO product);

    public ProductDTO updateProduct(long productId, ProductDTO product);

    public void deleteProduct(long productId);

    public Page<Product> searchProduct(SearchProductDTO searchProductDTO);

    public int countProductByCategory(String category);
}
