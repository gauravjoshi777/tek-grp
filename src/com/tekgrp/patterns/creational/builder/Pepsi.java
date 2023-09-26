package com.tekgrp.patterns.creational.builder;
/**
 *  
 * @author Gaurav Joshi
 * @Date 26-Sep-23
 *
 */
public abstract class Pepsi extends ColdDrink {

    @Override
    public abstract  String name();

    @Override
    public abstract  String size();
    
    @Override
    public abstract  float price(); 
    
}
