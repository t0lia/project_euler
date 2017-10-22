result = length ( takeWhile  ( \x -> digits x < 1000 ) fibonacci) + 1

fibonacci :: [Integer]
fibonacci = foo 1 1
    where foo a b = a : foo b (a+b) 

digits :: Integer -> Int
digits 0 = 0
digits x = 1 + digits (div x 10)
   
