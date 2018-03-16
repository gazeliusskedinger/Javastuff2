package number4;

public class StringVSStrinbuilder {
	
	public static void main(String[] args){
		
		String str = "A";
		String longStr = "This is a long String of text that will be added to the existing string, for testing the difference between the two";
	    long[] result = new long[10];
	    long endResult = 0;
	    
	    //Testing Stringbuilder short string.
	    for(int i = 0; i < 10;i++){
	    	System.gc();
	    	StringBuilder sb = new StringBuilder();
	    	long times = 0;
	    	long time = 0;
	    	Long before;
	    	// medans en sekund går räkna hur många gånger den gör.  
	    	while(time < 1000000000){
	    		before = System.nanoTime();
	    		sb.append(str);
	    		time = time+(System.nanoTime()- before);
	    		times++;
	    	}
	    	
	    	System.out.println("sbLetter: "+times);
	    	result[i]=times;
	    	
	    }
	    for(int k = 0;k < 10;k++){
    		endResult = endResult+result[k];
    	}
    	endResult = endResult/10;
    	System.out.println("end result: " + endResult);
    	
    	endResult = 0;
    	Runtime rt = Runtime.getRuntime();
    	System.out.println(rt.freeMemory()/1000000);
    	System.gc();
    	System.out.println(rt.freeMemory()/1000000);
    	//Testing Stringbuilder long string.
	    for(int i = 0; i < 10;i++){
	    	System.gc();
	    	StringBuilder sb = new StringBuilder();
	    	long times = 0;
	    	long time = 0;
	    	Long before;
	    	// medans en sekund går räkna hur många gånger den gör. 
	    	while(time < 1000000000){
	    		before = System.nanoTime();
	    		sb.append(longStr);
	    		time = time+(System.nanoTime()- before);
	    		times++;
	    	}
	    	
	    	System.out.println("sbString: "+times);
	    	result[i]=times;
	    	
	    }
	    for(int k = 0;k < 10;k++){
    		endResult = endResult+result[k];
    	}
    	endResult = endResult/10;
    	System.out.println("end result: " + endResult);
    	
    	endResult = 0;
    	System.out.println(rt.freeMemory()/1000000);
    	System.gc();
    	System.out.println(rt.freeMemory()/1000000);
    	String theString = "";
    	
	    //Testing Stringbuilder short string.
	    for(int i = 0; i < 10;i++){
	    	theString = "";
	    	System.gc();
	    	StringBuilder sb = new StringBuilder();
	    	long times = 0;
	    	long time = 0;
	    	Long before;
	    	// medans en sekund går räkna hur många gånger den gör.  
	    	while(time < 1000000000){
	    		before = System.nanoTime();
	    		theString = theString + str; 
	    		time = time+(System.nanoTime()- before);
	    		times++;
	    	}
	    	
	    	System.out.println("StringLetter: "+times);
	    	result[i]=times;
	    	
	    }
	    for(int k = 0;k < 10;k++){
    		endResult = endResult+result[k];
    	}
    	endResult = endResult/10;
    	System.out.println("end result: " + endResult);
    	
    	endResult = 0;
    	
    	
    	System.out.println(rt.freeMemory()/1000000);
    	System.gc();
    	System.out.println(rt.freeMemory()/1000000);
    	//Testing Stringbuilder long string.
	    for(int i = 0; i < 10;i++){
	    	theString ="";
	    	System.gc();
	    	StringBuilder sb = new StringBuilder();
	    	long times = 0;
	    	long time = 0;
	    	Long before;
	    	// medans en sekund går räkna hur många gånger den gör. 
	    	while(time < 1000000000){
	    		before = System.nanoTime();
	    		theString = theString +longStr;
	    		time = time+(System.nanoTime()- before);
	    		times++;
	    	}
	    	
	    	System.out.println("StringLong: "+times);
	    	result[i]=times;
	    	
	    }
	    for(int k = 0;k < 10;k++){
    		endResult = endResult+result[k];
    	}
    	endResult = endResult/10;
    	System.out.println("end result: " + endResult);
    	System.out.println(rt.freeMemory()/1000000);
    	System.gc();
    	System.out.println(rt.freeMemory()/1000000);
	
	}
	
}
