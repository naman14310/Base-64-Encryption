package com.base64Encryption;

import java.util.Base64;
import java.util.Scanner;

public class Base64Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg;
		String encodedMessage;

		Scanner sc = new Scanner(System.in);
		System.out.print("enter message which you want to encode to base64 : ");
		msg = sc.nextLine();

		Base64.Encoder encoder = Base64.getMimeEncoder();
		encodedMessage = encoder.encodeToString(msg.getBytes());
		System.out.println("Encoded message : " + encodedMessage);

		Base64.Decoder decoder = Base64.getMimeDecoder();
		String decodedMessage = new String(decoder.decode(encodedMessage));
		System.out.println("Decoded message : " + decodedMessage);

		// decodedMessage=(decoder.decode(encodedMessage).toString();
	}

}
