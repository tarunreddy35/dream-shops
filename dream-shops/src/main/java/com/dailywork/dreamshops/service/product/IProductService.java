package com.dailywork.dreamshops.service.product;

import java.util.List;

import com.dailywork.dreamshops.Dto.ProductDto;
import com.dailywork.dreamshops.model.Product;
import com.dailywork.dreamshops.request.AddProductRequest;
import com.dailywork.dreamshops.request.ProductUpdateRequest;

public interface IProductService {

    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category,String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);
    
    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}
