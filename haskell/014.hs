collatz :: Int -> [Int]
collatz x 
    | x == 1    = [1]
    | even x    = x:collatz (div x 2)
    | otherwise = x:collatz (3 * x + 1)

lngth :: Int -> [(Int,Int)]
lngth s = [ (x,length $ collatz x) | x <- [1..s]]

result0 :: Int -> (Int, Int)
result0 xs= foldl (\acc x -> if (snd acc > snd x) then acc else x) (0,0) $ lngth xs

result = result0 1000000

