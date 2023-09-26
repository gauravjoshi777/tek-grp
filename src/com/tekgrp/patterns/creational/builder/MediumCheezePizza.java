package com.tekgrp.patterns.creational.builder;
/**
 *  
 * @author Gaurav Joshi
 * @Date 26-Sep-23
 *
 */
 
public class MediumCheezePizza extends VegPizza {

    @Override
    public float price() {
       return  220.f;
    }

    @Override
    public String name() {
        return "Cheeze Pizza";
    }

    @Override
    public String size() {
     return "Medium Size";
    
    }
    
}
