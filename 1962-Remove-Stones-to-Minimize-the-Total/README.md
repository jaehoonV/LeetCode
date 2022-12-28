<h2><a href="https://leetcode.com/problems/remove-stones-to-minimize-the-total/description/">1962. Remove Stones to Minimize the Total</a></h2><h3>Medium</h3><hr><div>
<p>
You are given a <strong>0-indexed</strong> integer array <code>piles</code>, where <code>piles[i]</code> represents the number of stones in the <code>i<sup>th</sup></code> pile, and an integer <code>k</code>. You should apply the following operation <strong>exactly</strong> <code>k</code> times:
<ul>
    <li>
    Choose any <code>piles[i]</code> and <strong>remove</strong> <code>floor(piles[i] / 2)</code> stones from it.
    </li>
</ul>

<strong>Notice</strong> that you can apply the operation on the <strong>same</strong> pile more than once.

Return the <strong>minimum</strong> possible total number of stones remaining after applying the <code>k</code> operations.

<code>floor(x)</code> is the <strong>greatest</strong> integer that is <strong>smaller</strong> than or <strong>equal</strong> to <code>x</code> (i.e., rounds <code>x</code> down).
</p>

</div>