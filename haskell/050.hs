primes = 2:sieve [3,5..10001]
  where sieve (p:xs) 
          | p < 100  = p : sieve [x | x <- xs, mod x p /= 0]
          | otherwise = p : xs

result :: [Integer]
result = foo 0 primes
  where foo s (x:xs)
          | (x:xs) == []    = []
          | s > 10000       = []
          | elem s (x:xs)   = s : foo (s+x) xs 
          | otherwise       = foo (s+x) xs
