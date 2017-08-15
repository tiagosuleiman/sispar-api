package com.rest;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//Hexadecimal: Uma observa��o importante, como j� foi dito antes, 
//� que n�o � poss�vel descriptografar essa senha, por isso as senhas est�o teoricamente seguras.

public class CriptografiaSHA256 {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        	
        //-------------- Senha Admin
        System.out.println("senhahexAdmin: "+cryptoStrHex("test"));
               
        //-------------- Senha User
        System.out.println("#senhahexUser: "+cryptoStrHex("user"));
        
        //--Comparando Senha User e Admin
        System.out.println("##user==admin: "+cryptoStrHex("user").equals(cryptoStrHex("admin")));
              
        //--Comparando Senha Admin e Admin
        System.out.println("#admin==admin: "+cryptoStrHex("admin").equals(cryptoStrHex("admin")));
        
      //--Criptografia Admin SHA-256
        System.out.println("#SHA-256: "+cryptoSha256("admin"));
        
	}
	
	public static String cryptoStrHex(String param) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte messageDigestSenhaAdmin[] = algorithm.digest(param.getBytes("UTF-8"));
        StringBuilder hexStringSenhaAdmin = new StringBuilder();
        for (byte b : messageDigestSenhaAdmin) {
                 hexStringSenhaAdmin.append(String.format("%02X", 0xFF & b));
        }
        return hexStringSenhaAdmin.toString();
	}
	
	public static String cryptoSha256(String param) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte messageDigestSenhaAdmin[] = algorithm.digest(param.getBytes("UTF-8"));
        return messageDigestSenhaAdmin.toString();
	}
}
