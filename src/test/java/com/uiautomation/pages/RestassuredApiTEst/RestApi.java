/**
 * 
 */
package com.uiautomation.pages.RestassuredApiTEst;

import java.util.Hashtable;

import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import jline.internal.Log;

/**
 * 
 * @version $Id$
 */
public class RestApi
{
   
   
   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Bavithiran
    */
   public static void main(String[] args)
   {
      // TODO Auto-generated method stub

      String responseBody = null;
      String openId = "oJdbq0x77IYlWRqlw_7s28ENB5kI";
      Hashtable<String, Object[]> data = null;

      // Specify the base URL to the RESTful web service
      RestAssured.baseURI = "https://servicecloudwechatifyapi.azurewebsites.net/api/SalesforceContact";

      // Get the RequestSpecification of the request that you want to sent
      // to the server. The server is specified by the BaseURI that we have
      // specified in the above step.
      RequestSpecification HttpRequest = RestAssured.given();
      
      Response response = HttpRequest.request(Method.GET, "/"+openId+"/622");
      responseBody = response.getBody().asString();
      System.out.println("Response -->" +responseBody);
      
      Gson gson = new Gson();
      
      JsonResults jsonObj = gson.fromJson(responseBody, JsonResults.class);
      
      data.put(openId, new Object[] { jsonObj.errorcode , jsonObj.status , jsonObj.data.contactid });
      
      for(String openid1 : data.keySet() )
      {
         Log.info(data);
      }
      data.get(openId);
      
     
      

   }

}
