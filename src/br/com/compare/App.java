package br.com.compare;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {

		BigDecimal equalsTeste = new BigDecimal("0");
		BigDecimal equalsTeste2 = new BigDecimal("0.0");
		BigDecimal zero = new BigDecimal("0");

		if (equalsTeste.equals(0)) {
			System.out.println("Big Decimal 0 Equals 0  é igual\n");
		} else {
			System.out.println("Big Decimal 0 Equals 0  é Diferente\n");
		}

		if (equalsTeste2.equals(0)) {
			System.out.println("Big Decimal 0.0 Equals 0 é igual\n");
		} else {
			System.out.println("Big Decimal 0.0 Equals 0 é Diferente\n");
		}

		if (equalsTeste.equals(zero)) {
			System.out.println("Big Decimal 0 Equals Big Decimal 0 é igual\n");
		} else {
			System.out.println("Big Decimal 0 Equals Big Decimal 0 é Diferente\n");
		}

		if (equalsTeste2.equals(zero)) {
			System.out.println("Big Decimal 0.0 Equals  Big Decimal 0 é igual\n");
		} else {
			System.out.println("Big Decimal 0.0 Equals Big Decimal 0 é Diferente\n");
		}

		if (equalsTeste == zero) {
			System.out.println("Big decimal 0 == Big Decimal 0 é igual\n");
		} else {
			System.out.println("Big decimal 0 == Big Decimal 0 é difente\n");
		}

		if (equalsTeste2 == zero) {
			System.out.println("Big decimal 0.0 == Big Decimal 0 é igual\n");
		} else {
			System.out.println("Big decimal 0.0 == Big Decimal 0 é difente\n");
		}

		if (equalsTeste.compareTo(zero) == 0) {
			System.out.println("Big Decimal 0 Compare Big Decimal 0  é igual\n");
		} else {
			System.out.println("Big Decimal 0 Compare Big Decimal 0  é Diferente\n");
		}

		if (equalsTeste2.compareTo(zero) == 0) {
			System.out.println("Big Decimal 0.0 Compare Big Decimal 0 é igual\n");
		} else {
			System.out.println("Big Decimal 0.0 Compare Big Decimal 0 é Diferente\n");
		}

	}
}
