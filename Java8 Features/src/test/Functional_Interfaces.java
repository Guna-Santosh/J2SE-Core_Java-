package test;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

@FunctionalInterface // 1.8
interface Demo {
	public void sample();
}

public class Functional_Interfaces {

	public static void main(String[] args) {
		// Consumer example
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("hello");

		// Function example
		Function<Integer, String> intToString = num -> "Number: " + num;
		System.out.println(intToString.apply(42));

		// Predicate example
		Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println(isEven.test(5)); // false

		// Supplier example
		Supplier<Double> randomDouble = () -> Math.random();
		System.out.println(randomDouble.get() * 10);

		// UnaryOperator example
		UnaryOperator<Integer> square = num -> num * num;
		System.out.println(square.apply(7));

		// BinaryOperator example
		BinaryOperator<Integer> add = (a, b) -> a + b;
		System.out.println("5 + 3 = " + add.apply(5, 3));
	}
}
