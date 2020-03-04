package com.vnr.shruthi.collections;
import java.util.AbstractList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomList<T> extends AbstractList<T>
{
	T[] arr;
	final Logger LOGGER = LogManager.getLogger(CustomList.class.getName());
	private int cnt=0;
    CustomList(T[] array)
	{
		arr=array;
	}
	 @SuppressWarnings("unchecked")
	CustomList(int i) {
	   arr=(T[]) new Object[i];
	}
	public T get(int index)
	{
		return(arr[index]);
	}
	public T set(int index,T element)
	{
		T temp=arr[index];
		arr[index]=element;
		return(temp);
	}
	public int size() 
	{
		return arr.length;
	}
	public void print()
	{
		
		for(T i:arr)
	    	LOGGER.debug(i);
	}
	public T fetch(int index)
	{
		return(arr[index]);
	}
	public boolean add(T element)
	{
		if(cnt<=arr.length) {
		arr[cnt++]=element;
		return(true);
		}
		return(false);
		
	}
	public T remove(int index)
	{
		T element=null;
		int i;
		if(index<0 || index>arr.length)
			{LOGGER.debug(" positon does not exist");
			return(element);}
		element=arr[index];
		for(i=index;i<arr.length;i++)
			{if(i==arr.length-1)
				break;
			arr[i]=arr[i+1];}
		  arr[i]=null;
		return(element);		
	}
	
}
