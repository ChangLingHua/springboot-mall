package com.hua.springbootmall.rawmapper;

import com.hua.springbootmall.constant.ProductCategory;
import com.hua.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {

        Product product = new Product();
        product.setProduct_id(resultSet.getInt("product_id"));
        product.setProduct_name(resultSet.getString("product_name"));

        // 得到從資料庫取出的數據
        String categoryStr = resultSet.getString("category");
        // 將字串轉換成 Enum 類型
        ProductCategory category = ProductCategory.valueOf(categoryStr);
        product.setCategory(category);
        //product.setCategory(ProductCategory.valueOf(resultSet.getString("category")));

        product.setImage_url(resultSet.getString("image_url"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock(resultSet.getInt("stock"));
        product.setDescription(resultSet.getString("description"));
        product.setCreated_date(resultSet.getDate("created_date"));
        product.setLast_modified_date(resultSet.getDate("last_modified_date"));

        return product;
    }
}
