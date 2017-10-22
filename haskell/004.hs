isPalindrome :: Integer -> Bool
isPalindrome x = (div x 100000) == (mod x 10)
    && (mod (div x 10000) 10) == (mod (div x 10) 10)
    && (mod (div x 1000) 10) == (mod (div x 100) 10)
    
palindromes = [x*y | x <- [1..1000], y <- [1..1000], isPalindrome (x*y)]
result = maximum palindromes
