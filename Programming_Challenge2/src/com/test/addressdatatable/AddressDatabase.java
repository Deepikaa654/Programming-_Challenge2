package com.test.addressdatatable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressDatabase {

	public static void main(String[] args) {
		
		List<AddressRecords> list=new ArrayList<AddressRecords>();

        list.add(new AddressRecords(1, "Java", "4086411349", "NewYork"));
        list.add(new AddressRecords(2,"Test", "3092252345", "Illinois"));
       
       /* // Iterating the list values
        for(int i=0;i<list.size();i++){
            System.out.println("Id: "+list.get(i).getId());
            System.out.println("Name: "+list.get(i).getName());
            System.out.println("Phone: "+list.get(i).getPhone());
            System.out.println("Address: "+list.get(i).getAddress());     
        }*/

        Iterator<AddressRecords> itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

	}

}
