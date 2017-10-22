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

result = product $ foldl merge [] $  map divisibles [1..20] 

merge :: [Int] -> [Int] -> [Int]
merge [] ys = ys
merge xs [] = xs
merge (x:xs) (y:ys)  
    | y == x        = x : merge xs ys
    | y < x         = y : merge (x:xs) ys
    | otherwise     = x : merge xs (y:ys)
