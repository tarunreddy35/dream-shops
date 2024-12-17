package com.dailywork.dreamshops.service.image;

import com.dailywork.dreamshops.Dto.ImageDto;
import com.dailywork.dreamshops.model.Image;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(Long productId, List<MultipartFile> files);
    void updateImage(MultipartFile file,  Long imageId);
}
