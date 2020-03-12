package com.testrunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framworkeilty.basiccls;
import com.webopertion.Tc_Userlogin;

public class webruner extends Tc_Userlogin {
@Test
	public static void testexecution() throws IOException {
		// TODO Auto-generated method stub
getbrowser("Chrome");
tc_01_userlogin();
	}

}
