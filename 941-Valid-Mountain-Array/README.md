<h2><a href="https://leetcode.com/problems/valid-mountain-array/description/">941. Valid Mountain Array</a></h2><h3>Easy</h3><hr><div>
<p>Given an array of integers <code>arr</code>, return <code>true</code> if and only if it is a valid mountain array.</p>
<p>Recall that arr is a mountain array if and only if:</p>

<ul>
	<li><code>arr.length >= 3</code></li>
	<li>There exists some <code>i</code> with <code>0 < i < arr.length - 1</code> such that:
		<ul>
			<li><code>arr[0] < arr[1] < ... < arr[i - 1] < arr[i] </code></li>
			<li><code>arr[i] > arr[i + 1] > ... > arr[arr.length - 1]</code></li>
		</ul>
	</li>
</ul>

<img alt="Mountain_array" src="https://assets.leetcode.com/uploads/2019/10/20/hint_valid_mountain_array.png" style="width: 700px; height: 365px;">

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> arr = [2,1]
<strong>Output:</strong> false
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> arr = [3,5,5]
<strong>Output:</strong> false
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> arr = [0,3,2,1]
<strong>Output:</strong> true
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 <= arr.length <= 10<sup>4</sup></code></li>
	<li><code>0 <= arr[i] <= 10<sup>4</sup></code></li>
	
</ul>
</div>