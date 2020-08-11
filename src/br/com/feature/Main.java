package br.com.feature;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		CachorroRecord pastor = new CachorroRecord(1, "Pastor");
		System.out.println(TextBlock.retorno());
		System.out.println(InstanceOf.exemplo(new BigInteger("10")));
		NullPointerMelhorado.nullPointerMelhorado();
	}

}
