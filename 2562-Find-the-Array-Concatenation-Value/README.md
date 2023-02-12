<h2><a href="https://leetcode.com/problems/find-the-array-concatenation-value/">2562. Find the Array Concatenation Value</a></h2><h3>Easy</h3><hr><div>
<p>
You are given a <strong>0-indexed</strong> integer array <code>nums</code>.

The <strong>concatenation</strong> of two numbers is the number formed by concatenating their numerals.

<ul>
    <li>For example, the concatenation of <code>15, 49 is 1549</code>.</li>
</ul>

The <strong>concatenation value</strong> of <code>nums</code> is initially equal to <code>0</code>. Perform this operation until <code>nums</code> becomes empty:

<ul>
    <li>If there exists more than one number in <code>nums</code>, pick the first element and last element in <code>nums</code> respectively and add the value of their concatenation to the <strong>concatenation value</strong> of <code>nums</code>, then delete the first and last element from <code>nums</code>.</li>
    <li>If one element exists, add its value to the <strong>concatenation value</strong> of <code>nums</code>, then delete it.</li>
</ul>
Return the concatenation value of the <code>nums</code>.
</p>

</div>