package com.photon.connecttodoor.test;

import com.jayway.android.robotium.solo.Solo;
import com.photon.connecttodoor.LoginActivity;

import android.test.ActivityInstrumentationTestCase2;

public class LoginActivityTest extends
		ActivityInstrumentationTestCase2<LoginActivity> {
	public Solo solo;

	public LoginActivityTest() {
		super(LoginActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}

	public void testLogin(){
		solo.clickOnButton("signin_button");
	}
	
}
