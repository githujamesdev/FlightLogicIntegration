/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.flightlogic.co.ke.main.services;

import com.flightlogic.co.ke.main.utilities.Utils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.text.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author jgithu
 */
public class TripDetails {

    private final Logger loggger = LogManager.getLogger(FlightAvailability.class);
    Utils utility = new Utils();

    public JsonObject tripDetails(String request, String url, JsonObject credentials) {
        JsonObject responseObject = new JsonObject();

        try {

            //JsonObject incomingRequest = new JsonObject(request);
            JsonObject requestObject = JsonParser.parseString(request).getAsJsonObject();
            //  System.out.print("JSON REQUEST" + request);

            JsonObject flightRequestObject = new JsonObject();
            //form request here 

            flightRequestObject.addProperty("user_id", credentials.get("user_id").getAsString());
            flightRequestObject.addProperty("user_password", credentials.get("user_password").getAsString());
            flightRequestObject.addProperty("access", credentials.get("access").getAsString());
            flightRequestObject.addProperty("ip_address", credentials.get("ip_address").getAsString());
            flightRequestObject.addProperty("UniqueID", requestObject.get("UniqueID").getAsString());

            loggger.info("TRIP DETAILS REQUEST |  URL " + url + "  REQ " + flightRequestObject);

            responseObject = utility.flightLogicRequest(flightRequestObject, url);
            loggger.info("TRIP DETAILS RESPONSE  |  " + responseObject);

            if (responseObject.has("errors")) {
                responseObject.addProperty("status", "01");
                responseObject.addProperty("message", "An error occured while processing your request. Please try again later");

                return responseObject;
            }

        } catch (IOException | ParseException ex) {
            loggger.info("Exception  |  " + ex.getMessage());
            responseObject.addProperty("status", "01");
            responseObject.addProperty("message", ex.getMessage());
            responseObject.addProperty("response", "");
        }

        return responseObject;

    }

    public JsonObject cancelTrip(String request, String url, JsonObject credentials) {
        JsonObject responseObject = new JsonObject();

        try {

            //JsonObject incomingRequest = new JsonObject(request);
            JsonObject requestObject = JsonParser.parseString(request).getAsJsonObject();
            //  System.out.print("JSON REQUEST" + request);

            JsonObject flightRequestObject = new JsonObject();
            //form request here 

            flightRequestObject.addProperty("user_id", credentials.get("user_id").getAsString());
            flightRequestObject.addProperty("user_password", credentials.get("user_password").getAsString());
            flightRequestObject.addProperty("access", credentials.get("access").getAsString());
            flightRequestObject.addProperty("ip_address", credentials.get("ip_address").getAsString());
            flightRequestObject.addProperty("UniqueID", requestObject.get("UniqueID").getAsString());

            loggger.info("CANCEL TRIP REQUEST |  URL " + url + "  REQ " + flightRequestObject);
            responseObject = utility.flightLogicRequest(flightRequestObject, url);
            loggger.info("CANCEL TRIP RESPONSE  |  " + responseObject);

            if (responseObject.has("errors")) {
                responseObject.addProperty("status", "01");
                responseObject.addProperty("message", "An error occured while processing your request. Please try again later");

                return responseObject;
            }

        } catch (IOException | ParseException ex) {
            loggger.info("Exception  |  " + ex.getMessage());
            responseObject.addProperty("status", "01");
            responseObject.addProperty("message", ex.getMessage());
            responseObject.addProperty("response", "");
        }

        return responseObject;

    }

    public JsonObject bookingNote(String request, String url, JsonObject credentials) {
        JsonObject responseObject = new JsonObject();

        try {

            //JsonObject incomingRequest = new JsonObject(request);
            JsonObject requestObject = JsonParser.parseString(request).getAsJsonObject();
            //  System.out.print("JSON REQUEST" + request);

            JsonObject flightRequestObject = new JsonObject();
            //form request here 

            flightRequestObject.addProperty("user_id", credentials.get("user_id").getAsString());
            flightRequestObject.addProperty("user_password", credentials.get("user_password").getAsString());
            flightRequestObject.addProperty("access", credentials.get("access").getAsString());
            flightRequestObject.addProperty("ip_address", credentials.get("ip_address").getAsString());
            flightRequestObject.addProperty("UniqueID", requestObject.get("UniqueID").getAsString());
            flightRequestObject.addProperty("notes", requestObject.get("notes").getAsString());

            loggger.info("BOOKING NOTE REQUEST |  URL " + url + "  REQ " + flightRequestObject);
            responseObject = utility.flightLogicRequest(flightRequestObject, url);
            loggger.info("BOOKING NOTE RESPONSE  |  " + responseObject);

            if (responseObject.has("errors")) {
                responseObject.addProperty("status", "01");
                responseObject.addProperty("message", "An error occured while processing your request. Please try again later");

                return responseObject;
            }

        } catch (IOException | ParseException ex) {
            loggger.info("Exception  |  " + ex.getMessage());
            responseObject.addProperty("status", "01");
            responseObject.addProperty("message", ex.getMessage());
            responseObject.addProperty("response", "");
        }

        return responseObject;

    }

    public JsonObject postTicketStatus(String request, String url, JsonObject credentials) {
        JsonObject responseObject = new JsonObject();

        try {

            //JsonObject incomingRequest = new JsonObject(request);
            JsonObject requestObject = JsonParser.parseString(request).getAsJsonObject();
            //  System.out.print("JSON REQUEST" + request);

            JsonObject flightRequestObject = new JsonObject();
            //form request here 

            flightRequestObject.addProperty("user_id", credentials.get("user_id").getAsString());
            flightRequestObject.addProperty("user_password", credentials.get("user_password").getAsString());
            flightRequestObject.addProperty("access", credentials.get("access").getAsString());
            flightRequestObject.addProperty("ip_address", credentials.get("ip_address").getAsString());
            flightRequestObject.addProperty("UniqueID", requestObject.get("UniqueID").getAsString());
            flightRequestObject.addProperty("ptrUniqueID", requestObject.get("ptrUniqueID").getAsString());

            loggger.info("POST TICKET STATUS REQUEST |  URL " + url + "  REQ " + flightRequestObject);
            responseObject = utility.flightLogicRequest(flightRequestObject, url);
            loggger.info("POST TICKET STATUS   |  " + responseObject);

            if (responseObject.has("errors")) {
                responseObject.addProperty("status", "01");
                responseObject.addProperty("message", "An error occured while processing your request. Please try again later");

                return responseObject;
            }

        } catch (IOException | ParseException ex) {
            loggger.info("Exception  |  " + ex.getMessage());
            responseObject.addProperty("status", "01");
            responseObject.addProperty("message", ex.getMessage());
            responseObject.addProperty("response", "");

        }

        return responseObject;

    }

    
    
    public JsonObject voidQuote(String request, String url, JsonObject credentials) {
        JsonObject responseObject = new JsonObject();

        try {

            //JsonObject incomingRequest = new JsonObject(request);
            JsonObject requestObject = JsonParser.parseString(request).getAsJsonObject();
            //  System.out.print("JSON REQUEST" + request);

            JsonObject flightRequestObject = new JsonObject();
            //form request here 

            requestObject.addProperty("user_id", credentials.get("user_id").getAsString());
            requestObject.addProperty("user_password", credentials.get("user_password").getAsString());
            requestObject.addProperty("access", credentials.get("access").getAsString());
            requestObject.addProperty("ip_address", credentials.get("ip_address").getAsString());
           
            loggger.info("VOID QUOTE REQUEST |  URL " + url + "  REQ " + flightRequestObject);
            responseObject = utility.flightLogicRequest(flightRequestObject, url);
            loggger.info("VOID QUOTE STATUS   |  " + responseObject);

            if (responseObject.has("errors")) {
                responseObject.addProperty("status", "01");
                responseObject.addProperty("message", "An error occured while processing your request. Please try again later");

                return responseObject;
            }

        } catch (IOException | ParseException ex) {
            loggger.info("Exception  |  " + ex.getMessage());
            responseObject.addProperty("status", "01");
            responseObject.addProperty("message", ex.getMessage());
            responseObject.addProperty("response", "");

        }

        return responseObject;

    }
}
