result = 
    let p x = mod x 5 == 0 || mod x 3 == 0
    in sum $ filter p [1..999]
