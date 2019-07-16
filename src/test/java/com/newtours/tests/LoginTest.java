package com.newtours.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.newtours.pages.MercuryReservationPage;
import com.newtours.pages.MercurySignOnPage;
import com.newtours.utilities.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void login() {
		MercurySignOnPage.login();
		Assert.assertTrue(MercuryReservationPage.flightFinderBanner.isPresent(), "Unable to Log In");
		MercurySignOnPage.signOff();
		Assert.assertTrue(MercurySignOnPage.signOnBanner.isPresent(), "Unable to Log Off");
	}

}