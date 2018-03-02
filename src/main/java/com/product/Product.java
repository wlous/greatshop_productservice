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
final public class Product 
{
    final int productId;
    final String productName;
    final String productImageUrl;
    final Date lastUpdated;
    
    Product(int productId, String productName, String productImageUrl, Date lastUpdated)
    {
        this.productId = productId;
        this.productName = productName;
        this.productImageUrl = productImageUrl;
        this.lastUpdated = new Date(lastUpdated.getTime());
    }
    
    public int getProductId()
    {
        return productId;
    }
    
    public String getProductName()
    {
        return productName;
    }
    
    public String getProductImageUrl()
    {
        return productImageUrl;
    }
    
    public Date getLastUpdated()
    {
        return lastUpdated;
    }
    
}
