package br.com.feature;

import java.math.BigInteger;

public class InstanceOf {

	public static BigInteger exemplo(Object obj) {
		if(obj instanceof BigInteger id) {
			return id; //elimina a necessidade de fazer o cast return (BigInteger) id;
		}
		throw new RuntimeException();
	}
	
}
