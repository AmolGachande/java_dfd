package com.example.awsdemographic.ssnhashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

import com.read.file.hash.AES;



public class SocialSecurityNumber {

	public String getSsnEncryption(String ssnToHash) {
		String salt = "";
		String mask = "";
		try {
			salt = getSalt();
			String secureSsn = getSecureSsn(ssnToHash, salt);
			String encryptedString = AES.encrypt(ssnToHash, secureSsn);
			String decryptedString = AES.decrypt(encryptedString, secureSsn);

			mask = decryptedString.replaceAll("\\w(?=\\w{4})", "*");

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mask;
	}

	private static String getSecureSsn(String ssnToHash, String salt) {
		String generatedSsn = null;
		try {
			// Create MessageDigest instance for MD5
			MessageDigest md = MessageDigest.getInstance("MD5");

			// Add ssn bytes to digest
			md.update(salt.getBytes());

			// Get the hash's bytes
			byte[] bytes = md.digest(ssnToHash.getBytes());

			// This bytes[] has bytes in decimal format;
			// Convert it to hexadecimal format
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}

			// Get complete hashed ssn in hex format
			generatedSsn = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return generatedSsn;
	}

	// Add salt
	public static String getSalt() throws NoSuchAlgorithmException, NoSuchProviderException {
		// Always use a SecureRandom generator
		SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "SUN");

		// Create array for salt
		byte[] salt = new byte[16];

		// Get a random salt
		sr.nextBytes(salt);

		// return salt
		return salt.toString();
	}

}