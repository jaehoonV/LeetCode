<h2><a href="https://leetcode.com/problems/count-distinct-numbers-on-board/">2549. Count Distinct Numbers on Board</a></h2><h3>Easy</h3><hr><div>
<p>
You are given a positive integer n, that is initially placed on a board. Every day, for 10<sup>9</sup> days, you perform the following procedure:
<ul>
    <li>For each number x present on the board, find all numbers <code>1 <= i <= n</code> such that <code>x % i == 1</code>.</li>
    <li>Then, place those numbers on the board.</li>
</ul>

Return the number of <strong>distinct</strong> integers present on the board after 10<sup>9</sup> days have elapsed.

<strong>Notes:</strong>
<ul>
    <li>Once a number is placed on the board, it will remain on it until the end.</li>
    <li>% stands for the modulo operation. For example, 14 % 3 is 2.</li>
</ul>

</p>

</div>