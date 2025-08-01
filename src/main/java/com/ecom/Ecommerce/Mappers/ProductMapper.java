//package com.ecom.Ecommerce.Mappers;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.Named;
//
//import com.ecom.Ecommerce.DTO.ProductDTO;
//import com.ecom.Ecommerce.Entity.Product;
//import com.ecom.Ecommerce.Entity.ProductImage;
//
//@Mapper(componentModel = "spring")
//public interface ProductMapper {
//
//    // Map Entity -> DTO
//    @Mapping(target = "images", source = "images", qualifiedByName = "imagesToStrings")
//    ProductDTO toDto(Product product);
//
//    // Map DTO -> Entity
//    @Mapping(target = "images", source = "images", qualifiedByName = "stringsToImages")
//    Product toEntity(ProductDTO productDTO);
//
//    // Convert ProductImage list to String list
//    @Named("imagesToStrings")
//    default List<String> mapImagesToStrings(List<ProductImage> images) {
//        if (images == null) return null;
//        return images.stream()
//                .map(ProductImage::getUrl) // field is 'url'
//                .collect(Collectors.toList());
//    }
//
//    // Convert String list to ProductImage list
//    @Named("stringsToImages")
//    default List<ProductImage> mapStringsToImages(List<String> imageUris) {
//        if (imageUris == null) return null;
//        return imageUris.stream()
//                .map(uri -> {
//                    ProductImage img = new ProductImage();
//                    img.setUrl(uri);
//                    img.setPrimary(false);
//                    return img;
//                })
//                .collect(Collectors.toList());
//    }
//}
