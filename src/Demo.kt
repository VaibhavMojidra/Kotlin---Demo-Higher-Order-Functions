fun main(args: Array<String>) {

	//A higher-order function is a function that takes another function as parameter and/or returns a function.
	val result = calculate(4, 5, ::sum)
	println(result)
	//Here we are calling the higher-order function passing in two integer values and the function argument ::sum. Here :: is the notation that references a function by name in Kotlin.

	//one more example where a function returns another function. Here we defined a higher-order function that returns a function. Here (Int) -> Int represents the parameters and return type of the square function.
	val func = operation()
	println(func(4))


}

fun square(x: Int) = x * x

fun operation(): (Int) -> Int {
	return ::square
}

fun sum(a: Int, b: Int) = a + b

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
	return operation(a, b)
}