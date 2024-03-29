<h2><a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/description/">150. Evaluate Reverse Polish Notation</a></h2><h3>Medium</h3><hr><div>
<p>Evaluate the value of an arithmetic expression in <a href="https://en.wikipedia.org/wiki/Reverse_Polish_notation">Reverse Polish Notation</a>.

Valid operators are <code>+</code>, <code>-</code>, <code>*</code>, and <code>/</code>. Each operand may be an integer or another expression.

<strong>Note</strong> that division between two integers should truncate toward zero.

It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> tokens = ["2","1","+","3","*"]
<strong>Output:</strong> 9
<strong>Explanation:</strong> ((2 + 1) * 3) = 9
</pre>

<p>&nbsp;</p>
<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> tokens = ["4","13","5","/","+"]
<strong>Output:</strong> 6
<strong>Explanation:</strong> (4 + (13 / 5)) = 6
</pre>

<p>&nbsp;</p>
<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
<strong>Output:</strong> 22
<strong>Explanation:</strong> ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 <= tokens.length <= 10<sup>4</sup></code></li>
	<li><code>tokens[i]</code> is either an operator: <code>"+", "-", "*", or "/"</code>, or an integer in the range <code>[-200, 200]</code>.</li>
</ul>
</div>