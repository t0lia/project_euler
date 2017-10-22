third(a,b,c,d) = c
condition (a,b,l,c) =
    if a < c 
        then (l ++ [a] ++ third(nextfib(b,a+b,l,c-1))) 
        else l

nextfib(a,b,l,c) = (b, a+b, condition(a,b,l,c), c)

fibs = third(nextfib(0,1,[],4000000))

result = sum [x | x <- fibs, even x]
