package com.java.week2.multithread;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
import java.util.Collection;

public class SyncTest {
	public static final int NUMBER_TO_USE = 1000000;
	
	public static void main(String[] args) {
		final Controller controller = new Controller();
		System.out.println("Before Adding");
		
		controller.addSome(NUMBER_TO_USE);
		
		System.out.println("Before Remove");
		
		TimerTask getBufferTask = new TimerTask() {
			public void run() {
				TestBuffer buffer = controller.getBuffer();
				buffer.getBuffer();
			}
		};

		Timer getBufferTimer = new Timer(true);
		getBufferTimer.scheduleAtFixedRate(getBufferTask, 0, 33);
		
		for(int i=0;i<NUMBER_TO_USE;i++){
			controller.remove();
		}
		
		System.out.println("Done");
	}
}

class Controller{
	Tuple3f defaultColor = new Tuple3f();
	Map<Tuple3f, TestBuffer> colorToBufferMap = new HashMap<Tuple3f, TestBuffer>();
	int i=0;
	
	public void addSome(Integer toAdd) {
		TestBuffer buffer = getBuffer();

		for (int j=0;j<toAdd;j++) {
			buffer.add(i++);
		}
	}

	public void remove() {
		TestBuffer oldBuffer = getBuffer();
		oldBuffer.remove(i++);
	}

	public TestBuffer getBuffer() {
		TestBuffer buffer = null;
		if (colorToBufferMap.containsKey(defaultColor)) {
			buffer = colorToBufferMap.get(defaultColor);
		} else {
			buffer = new TestBuffer();
			colorToBufferMap.put(defaultColor, buffer);
		}
		return buffer;
	}
}

class TestBuffer{
	private Collection<Object> list = new ArrayList<Object>();
	private boolean insideGetBuffer = false;
	
	public TestBuffer(){
		System.out.println("Creating a TestBuffer");
	}
	
	synchronized public void add(Object item) {
		list.add(item);
	}
	
	synchronized public void remove(Object item) {
		if(insideGetBuffer){
			System.out.println("Broke Synchronization ");
			System.out.println(item);
		}
	}
	
	synchronized public void getBuffer() {
		insideGetBuffer = true;
		try{
			int i=0;
			for(Object item : list) {
				if(item != null){
					i++;
				}
			}
		}finally{
			insideGetBuffer = false;
		}
	}
}

class Tuple3f {
	public float x;
	public float y;
	public float z;

	public Tuple3f() {
		this.x = 1;
		this.y = 0;
		this.z = 0;
	}

	public boolean equals(Object t1) {
		try {
			Tuple3f t2 = (Tuple3f) t1;
			return (this.x == t2.x && this.y == t2.y && this.z == t2.z);
		} catch (NullPointerException e2) {
			return false;
		} catch (ClassCastException e1) {
			return false;
		}
	}

	public int hashCode() {
		long bits = 1L;
		bits = 31L * bits + (long) ((x == 0) ? 0l : Float.floatToIntBits(x));
		bits = 31L * bits + (long) ((y == 0) ? 0l : Float.floatToIntBits(y));
		bits = 31L * bits + (long) ((z == 0) ? 0l : Float.floatToIntBits(z));
		return (int) (bits ^ (bits >> 32));
	}
}