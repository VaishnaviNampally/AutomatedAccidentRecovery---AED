/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SMS;

/**
 *
 * @author Dell
 */
import java.util.*; 
import com.twilio.sdk.*; 
import com.twilio.sdk.resource.factory.*; 
import com.twilio.sdk.resource.instance.*;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
 
public class sms { 
 // Find your Account Sid and Token at twilio.com/user/account 
 public static final String ACCOUNT_SID = "AC337b6c1677dbb0dac317473e0b38fa58"; 
 public static final String AUTH_TOKEN = "ad516e856a6830cda158bb34ba6b4bda"; 
 
 public void sms1() throws TwilioRestException { 
	TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN); 
 
	 // Build the parameters 
	 List<NameValuePair> params = new ArrayList<NameValuePair>(); 
	 params.add(new BasicNameValuePair("To", "6173723775")); 
	 params.add(new BasicNameValuePair("From", "+13392013683")); 
         params.add(new BasicNameValuePair("Body","Emergency"));
 
	 MessageFactory messageFactory = client.getAccount().getMessageFactory(); 
	 Message message = messageFactory.create(params); 
	 System.out.println(message.getSid()); 
 } 
}