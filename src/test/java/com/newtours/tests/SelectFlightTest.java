package com.newtours.tests;

import org.testng.annotations.Test;

import com.newtours.pages.MercuryReservation2Page;
import com.newtours.pages.MercuryReservationPage;
import com.newtours.pages.MercurySignOnPage;
import com.newtours.utilities.BaseTest;
import com.newtours.utilities.Constants;

public class SelectFlightTest extends BaseTest{

	@Test
	public void selectFlights() {
		MercurySignOnPage.login();
		MercuryReservationPage.roundTrip.click();
		MercuryReservationPage.passengers.select("2");
		MercuryReservationPage.departure(Constants.airport_sanFrancisco, Constants.month_may, "21");
		MercuryReservationPage.arrival(Constants.airport_seattle, Constants.month_october, "12");
		MercuryReservationPage.businessClass.click();
		MercuryReservationPage.airline.select(Constants.airline_blueSkiesAirlines);
		MercuryReservationPage.continueNext.click();
		MercuryReservation2Page.selectFlights(MercuryReservation2Page.unifiedAirlines363, MercuryReservation2Page.pangeaAirlines632);
		MercuryReservation2Page.signOff();
	}

}
