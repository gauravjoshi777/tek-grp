package com.tekgrp.patterns.creational.builder;
/**
 *  
 * @author Gaurav Joshi
 * @Date 26-Sep-23
 *
 */
public class SmallCheezePizza extends VegPizza{

    @Override
    public float price() {
        return 170.0f;
    }

    @Override
    public String name() {
        return "Cheeze Pizza";
    }

    @Override
    public String size() {
       return "Small size";
        
        
    }

    
   

   
   
    
}
