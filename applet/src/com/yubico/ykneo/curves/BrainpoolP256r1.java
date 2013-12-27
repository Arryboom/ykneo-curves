package com.yubico.ykneo.curves;

/* Copyright (c) 2013 Yubico AB 
 * All rights reserved.
 */

import javacard.security.ECPrivateKey;
import javacard.security.ECPublicKey;
import javacard.security.KeyPair;

public class BrainpoolP256r1 {

	private final static byte[] q = {
		(byte)0xa9, (byte)0xfb, 0x57, (byte)0xdb, (byte)0xa1, (byte)0xee, (byte)0xa9, (byte)0xbc, 0x3e, 0x66, 0x0a, (byte)0x90, (byte)0x9d, (byte)0x83, (byte)0x8d, 0x72, 0x6e, 0x3b, (byte)0xf6, 0x23, (byte)0xd5, 0x26, 0x20, 0x28, 0x20, 0x13, 0x48, 0x1d, 0x1f, 0x6e, 0x53, 0x77
	};

	private final static byte[] a = {
		0x7d, 0x5a, 0x09, 0x75, (byte)0xfc, 0x2c, 0x30, 0x57, (byte)0xee, (byte)0xf6, 0x75, 0x30, 0x41, 0x7a, (byte)0xff, (byte)0xe7, (byte)0xfb, (byte)0x80, 0x55, (byte)0xc1, 0x26, (byte)0xdc, 0x5c, 0x6c, (byte)0xe9, 0x4a, 0x4b, 0x44, (byte)0xf3, 0x30, (byte)0xb5, (byte)0xd9
	};

	private final static byte[] b = {
		0x26, (byte)0xdc, 0x5c, 0x6c, (byte)0xe9, 0x4a, 0x4b, 0x44, (byte)0xf3, 0x30, (byte)0xb5, (byte)0xd9, (byte)0xbb, (byte)0xd7, 0x7c, (byte)0xbf, (byte)0x95, (byte)0x84, 0x16, 0x29, 0x5c, (byte)0xf7, (byte)0xe1, (byte)0xce, 0x6b, (byte)0xcc, (byte)0xdc, 0x18, (byte)0xff, (byte)0x8c, 0x07, (byte)0xb6
	};

	private final static byte[] G = {
		0x04, (byte)0x8b, (byte)0xd2, (byte)0xae, (byte)0xb9, (byte)0xcb, 0x7e, 0x57, (byte)0xcb, 0x2c, 0x4b, 0x48, 0x2f, (byte)0xfc, (byte)0x81, (byte)0xb7, (byte)0xaf, (byte)0xb9, (byte)0xde, 0x27, (byte)0xe1, (byte)0xe3, (byte)0xbd, 0x23, (byte)0xc2, 0x3a, 0x44, 0x53, (byte)0xbd, (byte)0x9a, (byte)0xce, 0x32, 0x62, 0x54, 0x7e, (byte)0xf8, 0x35, (byte)0xc3, (byte)0xda, (byte)0xc4, (byte)0xfd, (byte)0x97, (byte)0xf8, 0x46, 0x1a, 0x14, 0x61, 0x1d, (byte)0xc9, (byte)0xc2, 0x77, 0x45, 0x13, 0x2d, (byte)0xed, (byte)0x8e, 0x54, 0x5c, 0x1d, 0x54, (byte)0xc7, 0x2f, 0x04, 0x69, (byte)0x97
	};

	private final static byte[] r = { // n?
		(byte)0xa9, (byte)0xfb, 0x57, (byte)0xdb, (byte)0xa1, (byte)0xee, (byte)0xa9, (byte)0xbc, 0x3e, 0x66, 0x0a, (byte)0x90, (byte)0x9d, (byte)0x83, (byte)0x8d, 0x71, (byte)0x8c, 0x39, 0x7a, (byte)0xa3, (byte)0xb5, 0x61, (byte)0xa6, (byte)0xf7, (byte)0x90, 0x1e, 0x0e, (byte)0x82, (byte)0x97, 0x48, 0x56, (byte)0xa7
	};

	static public KeyPair newKeyPair() {
		KeyPair key = new KeyPair(KeyPair.ALG_EC_FP, (short) 256);

		ECPrivateKey privKey = (ECPrivateKey) key.getPrivate();
		ECPublicKey pubKey = (ECPublicKey) key.getPublic();

		privKey.setFieldFP(q, (short) 0, (short) q.length);
		privKey.setA(a, (short) 0, (short) a.length);
		privKey.setB(b, (short) 0, (short) b.length);
		privKey.setG(G, (short) 0, (short) G.length);
		privKey.setR(r, (short) 0, (short) r.length);

		pubKey.setFieldFP(q, (short) 0, (short) q.length);
		pubKey.setA(a, (short) 0, (short) a.length);
		pubKey.setB(b, (short) 0, (short) b.length);
		pubKey.setG(G, (short) 0, (short) G.length);
		pubKey.setR(r, (short) 0, (short) r.length);

		return key;
	}
}