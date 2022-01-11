# sort-o_FredGang
APCS L04: sort-o-matic
## FredGang
#### Joseph Othman, Lawrence Joa, Michael Kamela
#### SotW: Aria Math

Note: we decided to look at number of comparisons performed by each method, as opposed to number of swaps or number of passes.
## BubbleSort
- Best case scenario of arrangements: when the data is already ordered.
- Reason: when all entries are sorted, then after the first pass, the count of swaps for the pass will be 0. This ends the method after 1 pass, or (n-1) comparisons.
- Worst case scenario of arrangements: when the data is in descending order.
- Reason: when the arraylist is in descending order, then the only way we can get an element to be in its correct location is when it swaps with all of the elements between itself and its correct location. This implies that each pair of elements must be swapped. Note that since each pair of elements is compared at most once, this is the worst case scenario in terms of comparisons.

- Best case of time complexity: O(n)
  - Reason: The best case of bubble sort is when the elements are already in order. This will take 1 pass, 0 swaps, and n-1 comparisons. This grows linearly with n, so this is performed in O(n) time.
- Worst case of time complexity: O(n^2)
  - Reason: When the elements are in descending order, we must perform n-1 passes, n(n-1)/2 comparisons, and n(n-1)/2 swaps. Summing these gives O(n^2) time.   

# Extra Note
- We used "Exit-Early Bubblesort" instead of "Vanilla Bubblesort"


## InsertionSort
- Best case scenario of arrangements: when the data is already sorted.
- Reason: when the data is already ordered, then at each pass, wthe only comparison that occurs is between the element at index <pass number> and index <pass number - 1>. This implies that there are n-1 total comparisons, since there will be n-1 passes.
- Worst case scenario of arrangements: when the data is in descending order.
- Reason: similarly to BubbleSort, when the data is in descending order, each pair of elements will be compared exactly once. Since we cannot compare elements more than once under this algo, this is maximal.
  
- Best case of time complexity: O(n)
- Reason: When the elements are already in order, this is similar to bubble sort. We only compare consecutive elements, of which there are n-1 pairs. Nothing else must occur, and there are n-1 passes, so this comes out to O(n) time.
- Worst case of time complexity: O(n^2)
  - Reason: When the elements are in descending order, we still must perform n-1 passes, but we now must perform swaps and comparisons. We perform n(n-1)/2 of each, giving O(n^2) time.
  
## SelectionSort
- For number of comparisons, there does not exist a best or worst case scenario! All scenarios are equivalent.
- Reason: in order to find the maximum of all elements succeeding a given element, we must perform at least k-1 comparions, where k is the number of elements after the given element. As k ranges from 0 to n-1, this gives a total of (n-1)+(n-2)+...+0 comparisons, no matter what the given ArrayList looks like.
- For number of swaps, the worst case scenario is when each element is shifted over by a given amount (taking indices mod n if necessary). This is beacuse no elements will swap by chance to the correct spot, so n swaps will be necessary.
  
- Best case of time complexity: O(n^2)
  - Reason: no matter what, in order to locate the minimum element of the "rest of the array" (as in, on pass k, the subarray starting from element with index k-1), we must perform n(n-1)/2 comparisons in total to locate the minimum each time, giving O(n^2) time. However, this is still the best case because we need not perform any swaps.
- Worst case of time complexity: O(n^2)
  - Reason: the worst case arrangement requires n(n-1)/2 comparisons, but it also compares n swaps. This does not contribute to the big O time, but does still constitute a worst case.
