-- 400 try by probing many times
primes = 1:2:sieve [3,5..]
  where sieve (p:xs) 
          | p < 400   = p : sieve [x | x <- xs, mod x p /= 0]
          | otherwise = p : xs
result = primes !! 10001
