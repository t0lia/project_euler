summary :: Integer -> Integer
summary 0 = 0
summary x = mod x 10 + summary (div x 10)

result = summary ( 2 ^ 1000 )
