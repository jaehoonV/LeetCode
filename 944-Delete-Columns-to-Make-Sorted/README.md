<h2><a href="https://leetcode.com/problems/delete-columns-to-make-sorted/">944. Delete Columns to Make Sorted</a></h2><h3>Easy</h3><hr><div>
<p>
You are given an array of <code>n</code> strings <code>strs</code>, all of the same length.

The strings can be arranged such that there is one on each line, making a grid. For example, <code>strs = ["abc", "bce", "cae"]</code> can be arranged as:
<pre>
abc
bce
cae
</pre>

You want to <strong>delete</strong> the columns that are <strong>not sorted lexicographically</strong>. In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted while column 1 ('b', 'c', 'a') is not, so you would delete column 1.

Return the number of columns that you will delete.

</div>