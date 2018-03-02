/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product;

import java.util.Date;

/**
 *
 * @author louiseahokas
 */
public class ProductBuilder 
{
    private int id;
    private String productName;
    private String productImageUrl;
    private Date lastUpdated;
    
    /** 
     * Builder for {@link Product}
     * 
     * @return a {@link Product} instance.
     */
    public Product build()
    {
        if((id < 0)
                || ("".equals(this.productName) || this.productName.trim().isEmpty())
                || ("".equals(this.productImageUrl) || this.productImageUrl.trim().isEmpty())
                || (this.lastUpdated == null)
                ){
            throw new IllegalStateException("ProductBuilder is not in a buildable state");
        }
        
        return new Product(
            this.id,
            this.productName,
            this.productImageUrl,
            this.lastUpdated
        );
            
    }
      
    /**
     * Setter for {@link ProductBuilder#id} 
     * @param id the unique id for the {@link Product}
     * @return 
     */
    public ProductBuilder id(int id)
    {
        if(id < 0) {
            throw new IllegalArgumentException("Id can't be less than 0.");
        }
        this.id = id;
        return this;
    }
    
    /**
     * Setter for {@link ProductBuilder#productName} 
     * @param productName the productName for the {@link Product}
     * @return a {@link ProductBuilder} instance
     */
    public ProductBuilder productName(String productName) {
        if (productName == null || productName.trim().isEmpty()) {
           throw new IllegalArgumentException("Product name cannot be null or empty."); 
        }
        this.productName = productName;
        return this;
    }
    
    /**
     * Setter for {@link ProductBuilder#productImageUrl} 
     * @param productImageUrl the productImageUrl for the {@link Product}
     * @return a {@link ProductBuilder} instance
     */
    public ProductBuilder productImageUrl(String productImageUrl) {
        if (productImageUrl == null || productImageUrl.trim().isEmpty()) {
           throw new IllegalArgumentException("Product image url cannot be null or empty."); 
        }
        this.productImageUrl = productImageUrl;
        return this;
    }
    
    /**
     * Setter for {@link ProductBuilder#lastUpdated} 
     * @param lastUpdated the date the product was last updated for the {@link Product}
     * @return a {@link ProductBuilder} instance
     */
    public ProductBuilder lastUpdated(Date lastUpdated) {
        if (lastUpdated == null) {
           throw new IllegalArgumentException("Date cannot be null."); 
        }
        this.lastUpdated = lastUpdated;
        return this;
    }
}
