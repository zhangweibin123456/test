package com.uuid;


public class TestUUID {

	public static void main(String[] args) {
//		UUID uuid = UUID.randomUUID().toString().s;
//		
//		System.out.println(uuid);

		
		
		String str="你好 ${abc} 我";
		str = str.replace("${abc}", "北京");
		System.out.println(str);
		
		
	}

}
