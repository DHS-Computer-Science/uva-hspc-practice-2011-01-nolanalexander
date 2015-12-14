# Practice 2011 - 01: Geometric Inflation

## Background
A very unusual model of inflation can be simulated by multiplying the cost of a
given item 3 months ago with the cost of the item 2 months ago and dividing that
quantity by the cost of the item 1 month ago. The costs will be given in
dollars, with no more than 2 decimal places representing cents. No cost can
include partial cents, so always round to the nearest whole cent for every
month.
For example, suppose dumplings from the corner cost $5.23 in month 1, $5.50 in
month 2, and $5.52 in month 3. It is now month 4 and we need to find out how
much to charge considering inflation. We would multiply 5.23 by 5.50 to get
28.765. Note: no rounding takes place at this step. Then take that quantity
and divide it by 5.52 to get 5.21.

## Description

### Input
Each line will start with 3 decimal numbers, with 1 or 2 decimal places,
representing the costs at month 1, 2, and 3. The next input on the line will be
an integer, N, between 1 and 100 inclusively indicating for which month the cost
is to be calculated. A line starting with -1 will mark the end of the
test cases.

### Output
For each test case (line of input) you should calculate the cost for that month
and output your result as “Month N cost: $c”, where c is the cost in dollars.
Each output should have exactly 2 decimal digits and be comma grouped. The cost
for every month that you are requested to find will fit in a Java double.

## Sample
### Input
```
5.23 5.5 5.52 4
5.23 5.5 5.52 2
-1
```

### Output
```
Month 4 cost: $5.21
Month 2 cost: $5.50
```
