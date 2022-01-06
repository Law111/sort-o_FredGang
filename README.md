# sort-o_FredGang
APCS L04: sort-o-matic
## FredGang
#### Joseph Othman, Lawrence Joa, Michael Kamela

Note: we decided to look at number of comparisons performed by each method, as opposed to number of swaps or number of passes.
## BubbleSort
- Best case scenario: when the data is already ordered.
- Reason: when all entries are sorted, then after the first pass, the count of swaps for the pass will be 0. This ends the method after 1 pass, or (n-1) comparisons.
- Worst case scenario: when the data is in descending order.
- Reason: when the arraylist is in descending order, then the only way we can get an element to be in its correct location is when it swaps with all of the elements between itself and its correct location. This implies that each pair of elements must be swapped. Note that since each pair of elements is compared at most once, this is the worst case scenario in terms of comparisons.

## InsertionSort
- Best case scenario: when the data is already sorted.
- Reason: when the data is already ordered, then at each pass, wthe only comparison that occurs is between the element at index <pass number> and index <pass number - 1>. This implies that there are n-1 total comparisons, since there will be n-1 passes.
- Worst case scenario: when the data is in descending order.
- Reason: similarly to BubbleSort, when the data is in descending order, each pair of elements will be compared exactly once. Since we cannot compare elements more than once under this algo, this is maximal.
  
## SelectionSort
- For number of comparisons, there does not exist a best or worst case scenario! All scenarios are equivalent.
- Reason: in order to find the maximum of all elements succeeding a given element, we must perform at least k-1 comparions, where k is the number of elements after the given element. As k ranges from 0 to n-1, this gives a total of (n-1)+(n-2)+...+0 comparisons, no matter what the given ArrayList looks like.
