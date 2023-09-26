package com.tekgrp.patterns.creational.builder;
/**
 *  
 * @author Gaurav Joshi
 * @Date 26-Sep-23
 *
 */
public class SmallMasalaPizza extends VegPizza{
    
    @Override
    public float price() {
        return 100.0f;
    }

    @Override
    public String name() {
    
        return  "Masala Pizza";
    
    }

    @Override
    public String size() {
       return  "Samll Size";
    }
    
}
