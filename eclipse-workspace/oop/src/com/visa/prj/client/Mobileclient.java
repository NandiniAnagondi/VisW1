package com.visa.prj.client;

import com.visa.prj.dao.Mobiledao;
import com.visa.prj.dao.MobiledaoFactory;
import com.visa.prj.entity.Mobile;

public class Mobileclient {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		
		Mobiledao mobiledao=MobiledaoFactory.getMobiledao();
			
		mobiledao.addMobile(m);

	}

}
