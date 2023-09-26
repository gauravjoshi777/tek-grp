package com.tekgrp.patterns.creational.builder;
/**
 *  
 * @author Gaurav Joshi
 * @Date 26-Sep-23
 *
 */
public abstract class NonVegPizza extends Pizza {

    @Override
    public abstract float price();

    @Override
    public abstract String name();

    @Override
    public abstract String size();
       
}
