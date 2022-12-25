<h2><a href="https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/description/">2515. Shortest Distance to Target String in a Circular Array</a></h2><h3>Easy</h3><hr><div>
<p>
You are given a <strong>0-indexed circular</strong> string array <code>words</code> and a string <code>target</code>. A <strong>circular array</strong> means that the array's end connects to the array's beginning.
<ul>
    <li>
    Formally, the next element of <code>words[i]</code> is <code>words[(i + 1) % n]</code> and the previous element of <code>words[i]</code> is <code>words[(i - 1 + n) % n]</code>, where n is the length of <code>words</code>.
    </li>
</ul>
Starting from <code>startIndex</code>, you can move to either the next word or the previous word with <code>1</code> step at a time.

Return the <strong>shortest</strong> distance needed to reach the string <code>target</code>. If the string <code>target</code> does not exist in <code>words</code>, return <code>-1</code>.
</p>

</div>