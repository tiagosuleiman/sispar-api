package com.sispar.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {
	
	public static String cryptoStrHex(String param) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte messageDigestPasswordAdmin[] = algorithm.digest(param.getBytes("UTF-8"));
        StringBuilder hexStringPasswordAdmin = new StringBuilder();
        for (byte b : messageDigestPasswordAdmin) {
                 hexStringPasswordAdmin.append(String.format("%02X", 0xFF & b));
        }
        return hexStringPasswordAdmin.toString();
	}
	
	
	public static String newDateToString() {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date today = Calendar.getInstance().getTime();        
		String dateString = df.format(today);
		return dateString;
	}
}
