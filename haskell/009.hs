trng :: Int -> Int
trng x = head [ a*b*(x-a-b) | a <- [1..x], b <- [1..a], a^2 + b^2 == (x-a-b)^2]
