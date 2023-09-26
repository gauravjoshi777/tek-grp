package tekgrp;

/**
 *  
 * @author Gaurav Joshi
 * @Date 26-Sep-23
 *
 */
import java.io.IOException;
import com.tekgrp.patterns.creational.builder.OrderBuilder;
import com.tekgrp.patterns.creational.builder.OrderedItems;

public class BuilderDemo {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        OrderBuilder builder=new OrderBuilder();
        
        OrderedItems orderedItems=builder.preparePizza();
        
        orderedItems.showItems();
        
        System.out.println("\n");
        System.out.println("Total Cost : "+ orderedItems.getCost());
        
    }
}
