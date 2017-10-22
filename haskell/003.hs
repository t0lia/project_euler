-- not used. my implementation of prime ###########################
p :: Int -> [Int] -> Bool
p x = foldl (\acc y -> acc && mod x y /= 0) True 
prms = foldl (\acc x -> acc ++ if p x acc then [x] else []) [] [2..]
-- ################################################################

primes = sieve [2..]
  where sieve (p:xs) = 
         p : sieve [x | x <- xs, mod x p /= 0]

divisibles :: Int -> [Int]
divisibles x = divisibles0 x primes

divisibles0 :: Int -> [Int] -> [Int]
divisibles0 x (y:ys)
    | x == 1        = []
    | mod x y == 0  = y : divisibles0 (div x y) (y:ys)
    | otherwise     = divisibles0 x ys

result = last $ divisibles 600851475143
