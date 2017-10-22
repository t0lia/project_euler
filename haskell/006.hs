sq :: Int -> Int
sq x = x * x

summary :: [Int] -> Int
summary = sum . map sq 

square :: [Int] -> Int
square = sq . sum 

result = 
    let xs = [1..100]
    in square xs - summary xs
