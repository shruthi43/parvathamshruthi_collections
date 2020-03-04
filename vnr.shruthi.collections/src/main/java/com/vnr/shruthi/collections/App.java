package com.vnr.shruthi.collections;

import org.apache.logging.log4j.*;

public class App 
{
    public static void main( String[] args )
    {
    	final Logger LOGGER = LogManager.getLogger(CustomList.class.getName());
    	CustomList<String> customList=new CustomList<String>(10);
    	customList.add("car");
    	customList.add("bus");
    	customList.add("auto");
    	customList.add("train");
    	customList.add("helicopter");
    	customList.add("plane");    	
    	customList.add("cycle");
    	customList.add("ship");
    	customList.add("boat");
    	customList.add("bike");
    	LOGGER.debug("Custom list of automobiles:-----");
    	customList.print();
    	
    	LOGGER.debug("The size of custom List is "+customList.size());
    	
    	LOGGER.debug("After inserting at index positon 3\tThe old value is:"
    	+customList.set(2,"tricycle"));
    	LOGGER.debug("The custom list is-----");
    	customList.print();
    	
    	LOGGER.debug("The element at index 3 is :"+customList.fetch(2));

    	customList.remove(4);
    	LOGGER.debug("After removing element at index 5 the list is");
    	customList.print();
    }
}
