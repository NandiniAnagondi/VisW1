package com.visa.prj.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class Timetest {



	@Test
	public void testGethrs() {
		Time t1=new Time(23,10);
		int expec=23;
		assertEquals(expec,t1.gethrs());

	}

	@Test
	public void testGetmins() {
		Time t1=new Time(23,10);
		int expec=10;
		assertEquals(expec,t1.getmins());

	}

	@Test
	public void testAddtime() {
		Time t1=new Time(23,10);
		Time t2=new Time(01,50);
		Time expe=new Time(01,0);
		
		assertEquals(expe.gethrs(),Time.addtime(t1,t2).gethrs());
		assertEquals(expe.getmins(),Time.addtime(t1,t2).getmins());
	}

	@Test
	public void testAddtim() {
		Time t1=new Time(23,10);
		Time t2=new Time(01,50);
		Time expe=new Time(01,0);

		assertEquals(expe.gethrs(),t1.addtim(t2).gethrs());
		assertEquals(expe.getmins(),t1.addtim(t2).getmins());
	
	}

}
