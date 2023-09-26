package com.tekgrp.patterns.creational.builder;
/**
 *  
 * @author Gaurav Joshi
 * @Date 26-Sep-23
 *
 */
public class MediumCoke extends Coke{
    
    @Override
    public String name() {
         return "500 ml Coke";  
    
    }

    @Override
    public String size() {
       
        return "Medium Size";
    
    }

    @Override
    public float price() {
    
        return  35.0f;
    
    }
    
    
}
