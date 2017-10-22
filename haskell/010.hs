primes = 2:sieve [3,5..1999999]
  where sieve (p:xs) 
          | p < 1500 = p : sieve [x | x <- xs, mod x p /= 0]
          | otherwise = p : xs
result = sum primes
