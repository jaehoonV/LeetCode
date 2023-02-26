<h2><a href="https://leetcode.com/problems/left-and-right-sum-differences/">2574. Left and Right Sum Differences</a></h2><h3>Easy</h3><hr><div>
<p>
Given a <strong>0-indexed</strong> integer array <code>nums</code>, find a <strong>0-indexed</strong> integer array <code>answer</code> where:

<ul>
    <li><code>answer.length == nums.length.</code></li>
    <li><code>answer[i] = |leftSum[i] - rightSum[i]|.</code></li>
</ul>

Where:

<ul>
    <li><code>leftSum[i]</code> is the sum of elements to the left of the index <code>i</code> in the array <code>nums</code>. If there is no such element, <code>leftSum[i] = 0</code>.</li>
    <li><code>rightSum[i]</code> is the sum of elements to the right of the index <code>i</code> in the array <code>nums</code>. If there is no such element, <code>rightSum[i] = 0</code>.</li>
</ul>

Return the array <code>answer</code>.
</p>

</div>