p :: Integer -> Bool
p x = x == digSum x
    where digSum x 
            | x == 0    = 0
            | otherwise = ( mod x 10 ) ^ 5 + digSum ( div x 10)    

result :: Integer
result = sum [ x | x <- [2..999999], p x]
