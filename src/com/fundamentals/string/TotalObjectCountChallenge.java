package com.fundamentals.string;

/**
 * @author kanhaiya.chhipa
 * 
 * Total 8 Objects (7 String, 1 String Builder)
 *     String how1 = new String("How "); //Two objects (1 in heap + 1 in pool)
		
		String how = "How ";    // No new object
		
		String many ="many ";     // 1 in pool
		String objects = "objects ";   // 1 in pool
		String are = "are ";          //1 in pool
		String created = "created";    // 1 in pool
		
		String how2 = new String("How ");   // 1 in heap
		
		System.out.println(how+many+objects+are+created);   //1 StringBuilder Object, String concatenation operation creates StringBuffer object 
 */
public class TotalObjectCountChallenge {

	public static void main(String[] args) throws InterruptedException {
		
		String how1 = new String("How "); //Two objects (1 in heap + 1 in pool)
		
		String how = "How ";    // No new object
		
		String many ="many ";     // 1 in pool
		String objects = "objects ";   // 1 in pool
		String are = "are ";          //1 in pool
		String created = "created";    // 1 in pool
		
		String how2 = new String("How ");   // 1 in heap
		
		System.out.println(how+many+objects+are+created);   // 1 StringBuilder Object
		
	}
}
