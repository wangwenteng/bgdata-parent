package cn.itcast_06_mySerializable;

import java.io.Serializable;
import java.util.Date;

public class Task implements Runnable, Serializable {

	private static final long serialVersionUID = 1L;

	
	public void run() {
		System.out.println(new Date());
	}

}
