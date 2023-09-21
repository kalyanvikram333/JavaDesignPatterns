package com.ds.finals;

import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface Shape{
	void draw();
}

public class Temp {
	

	public static void main(String[] args) {
		
		
		Shape rectangle= () -> System.out.println("Rectangle");
		rectangle.draw();
		
		Shape circle = () -> System.out.println("circle");
		circle.draw();
		
		Shape square= ()->System.out.println("square");
		square.draw();
		
		
		Function<String, Integer> f= ( s)-> s.length() ;
		System.out.println(f.apply("kal"));
		
		Consumer<String> c=(i)->System.out.println(i);
		c.accept("TEMP");
		
		Supplier<LocalDateTime> s=()->LocalDateTime.now();
		System.out.println(s.get());
		
		BiConsumer<String, String> b=(String s1,String s2)->System.out.println(s1+" "+s2);
		b.accept("hii", "Hello");
		
		Runnable run=()->{System.out.println("run method of runnable called");};
		Thread t=new Thread(run);
		t.start();
		
	}
	
}
