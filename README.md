排序算法(Java 实现)
-------------
| 算法种类|时间复杂度<br>最好情况 平均情况 最坏情况 |空间复杂度| 稳定性|
|:------:|:-----:|:------:|:---:|
|冒泡排序|O(n) &nbsp; &nbsp; &nbsp; <img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)"> &nbsp; &nbsp; &nbsp;  <img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)">|O(1)|是|
|选择排序| <img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)">&nbsp; &nbsp; &nbsp;  <img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)"> &nbsp; &nbsp; &nbsp;  <img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)">|O(1)|否|
|归并排序|<img src="http://www.forkosh.com/mathtex.cgi?O($n\log_2n)$"> <img src="http://www.forkosh.com/mathtex.cgi?O($n\log_2n)$"> <img src="http://www.forkosh.com/mathtex.cgi?O($n\log_2n)$">|O(n)|是|
|快速排序|<img src="http://www.forkosh.com/mathtex.cgi?O($n\log_2n)$"> <img src="http://www.forkosh.com/mathtex.cgi?O($n\log_2n)$">  <img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)">|<img src="http://www.forkosh.com/mathtex.cgi?O($log_2n)$">|否|
|插入排序|O(n) &nbsp; &nbsp; &nbsp;  <img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)"> &nbsp; &nbsp; &nbsp;  <img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)">|O(1)|是|
|希尔排序||O(1)|否|
|堆排序|<img src="http://www.forkosh.com/mathtex.cgi?O($n\log_2n)$"> <img src="http://www.forkosh.com/mathtex.cgi?O($n\log_2n)$"> <img src="http://www.forkosh.com/mathtex.cgi?O($n\log_2n)$">|O(1)|否|
|基数排序|O(d(n+r)) O(d(n+r)) O(d(n+r))|O(r)|是|
|鸡尾酒排序 |O(n) &nbsp; &nbsp; &nbsp;  <img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)"> &nbsp; &nbsp; &nbsp; <img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)">|O(1)|是|
|地精排序|O(n) &nbsp; &nbsp; &nbsp;  <img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)"> &nbsp; &nbsp; &nbsp; <img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)">|O(1)|是|
|梳排序|<img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)"> <img src="http://www.forkosh.com/mathtex.cgi?O($n^2/2^p)$">  <img src="http://www.forkosh.com/mathtex.cgi?O($n^2$)">|O(1)|否|

### 冒泡排序
![BubbleSort](animation/Bubble_sort_animation.gif)


 冒泡排序（Bubble Sort)是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。

算法描述如下：

1. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。

2. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。

3. 针对所有的元素重复以上的步骤，除了最后一个。

4. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。

### 选择排序
![SelectionSort](animation/Selection_sort_animation.gif)

选择排序(Selection sort)是一种简单直观的排序算法。它的工作原理如下。首先在未排序序列中找到最小元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。以此类推，直到所有元素均排序完毕。

算法描述如下：

1. 从第一个元素开始，向后依次比较。

2. 若有比第一个元素更小的元素，则交换第一个元素与当前元素，直到全部扫描完成。

3. 此时第一个元素为最小的元素，再从第二个元素开始，重复执行1、2

### 归并排序
![MergeSort](animation/Merge_sort_animation2.gif)

归并排序(Merge Sort),是创建在归并操作上的一种有效的排序算法，效率为O(n log n)。1945年由约翰·冯·诺伊曼首次提出。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用，且各层分治递归可以同时进行。

算法描述如下：
1. 采用递归的方法将序列每次进行划分，2路归并则每次划分左右2部分，直到不能再划分为止。

2. 讲划分后的序列，每相邻两个数字进行归并操作，排序后每个序列包含两个元素。

3. 将上述序列再次归并。

4. 重复步骤2，直到所有元素排序完毕。

### 快速排序
快速排序（Quicksort)，又称划分交换排序（partition-exchange sort），一种排序算法，最早由东尼·霍尔提出。在平均状况下，排序n个项目要Ο(n log n)次比较。在最坏状况下则需要Ο(n2)次比较，但这种状况并不常见。

![QuickSort](animation/Sorting_quicksort_anim.gif)

算法描述如下：

1. 从数列中挑出一个元素，称为"基准"(pivot)。

2. 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。

3. 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。

递归的最底部情形，是数列的大小是零或一，也就是永远都已经被排序好了。虽然一直递归下去，但是这个算法总会结束，因为在每次的迭代（iteration）中，它至少会把一个元素摆到它最后的位置去。

### 插入排序
![InsertSort](animation/Insertion_sort_animation.gif)

插入排序(Insertion Sort)一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。插入排序在实现上，通常采用in-place排序（即只需用到O(1)的额外空间的排序），因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。

算法描述如下：

1. 从第一个元素开始，该元素可以认为已经被排序

2. 取出下一个元素，在已经排序的元素序列中从后向前扫描

3. 如果该元素（已排序）大于新元素，将该元素移到下一位置

4. 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置

5. 将新元素插入到该位置后

6. 重复步骤2~5
