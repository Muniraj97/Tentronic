package org.sing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Implementation {
	public static void main(String[] args) {
		HDFCDataBase r=new HDFCDataBase();
		r.setUserId("muni@123");
		r.setPassword(1234);
		HDFCDataBase r1=new HDFCDataBase();
		r1.setUserId("raj@346");
		r1.setPassword(5678);
		HDFCDataBase r2=new HDFCDataBase();
		r2.setUserId("ram@4455");
		r2.setPassword(9988);
	//	String userId = r.getUserId();
		//System.out.println(userId);
		//int password = r.getPassword();	
        //System.out.println(password); 
        //String userId1 = r1.getUserId();
        //System.out.println(userId1);
        //int password1 = r1.getPassword();
        //System.out.println(password1);
        //String userId2 = r2.getUserId();
        //System.out.println(userId2);
        //int password2 = r2.getPassword();
        //System.out.println(password2);
		//List<HDFCDataBase> j=new ArrayList<HDFCDataBase>();
		//j.add(r);
		//j.add(r1);
		//j.add(r2);
		//for(HDFCDataBase a:j) {
		//String userId = a.getUserId();
		//System.out.println(userId);
		//int password = a.getPassword();			//System.out.println(password);
		//Set<HDFCDataBase> m=new HashSet <HDFCDataBase>();
		//m.add(r);
		//m.add(r1);
		//m.add(r2);
		//for(HDFCDataBase e:m) {
			//String userId = e.getUserId();
			//System.out.println(userId);
			//int password = e.getPassword();
			//System.out.println(password);
		
		
		Map<String,Integer> q=new LinkedHashMap();
	q.put("muni@123",1234);
		q.put("raj@346",5678);
		q.put("ram@4455",9988);
		//System.out.println(q);
		Set<java.util.Map.Entry<String, Integer>> entrySet = q.entrySet();
		for(java.util.Map.Entry<String, Integer> t:entrySet) {
		System.out.println(t);
		String key = t.getKey();
		System.out.println(key);
		Integer value = t.getValue();
		System.out.println(value);
System.out.println("hi");
System.out.println("muni");
System.out.println("raj");
			}
		
		
		
		
		
		
		
		
		
		
		
}
}