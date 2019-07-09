package com.visa.prj.dao;

import java.util.ResourceBundle;

public class MobiledaoFactory {
	
	private static String NAME="";
	
	static {
		ResourceBundle res=ResourceBundle.getBundle("config");
		NAME=res.getString("MOBILE_DAO").trim();
	}

	public static Mobiledao getMobiledao() {
		// TODO Auto-generated method stub
		//return new MobiledaoMangoimpl();
		try {
			return (Mobiledao) Class.forName(NAME).newInstance();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
