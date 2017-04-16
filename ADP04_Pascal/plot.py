from myplotmod import dlread, myloglog_tn

arr = dlread("sample.txt", ";", True)
names = ['iterative','recursive', 'binomial']
myloglog_tn(arr, 2, "Pascal's triangle", names)

