package com.dailywork.dreamshops.Dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

import com.dailywork.dreamshops.model.Category;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
    private List<ImageDto> images;
}