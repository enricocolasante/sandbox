fizzBuzz = fn
  (0,0,_) -> "FizzBuzz"
  (0,_,_) -> "Fizz"
  (_,0,_) -> "Buzz"
  (_,_,a) -> a
end

fizzTest = fn
  n -> fizzBuzz.(rem(n,3), rem(n,5),n)
end

IO.inspect Enum.map(10..16, fizzTest)
