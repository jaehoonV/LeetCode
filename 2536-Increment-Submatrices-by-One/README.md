<h2><a href="https://leetcode.com/problems/increment-submatrices-by-one/">2536. Increment Submatrices by One</a></h2><h3>Medium</h3><hr><div>
<p>
You are given a positive integer <code>n</code>, indicating that we initially have an <code>n x n</code> <strong>0-indexed</strong> integer matrix <code>mat</code> filled with zeroes.

You are also given a 2D integer array <code>query</code>. For each <code>query[i] = [row1<sub>i</sub>, col1<sub>i</sub>, row2<sub>i</sub>, col2<sub>i</sub>]</code>, you should do the following operation:
<ul>
    <li>Add <code>1</code> to <strong>every element</strong> in the submatrix with the <strong>top left</strong> corner <code>(row1<sub>i</sub>, col1<sub>i</sub>)</code> and the <strong>bottom right</strong> corner <code>(row2<sub>i</sub>, col2<sub>i</sub>)</code>. That is, add <code>1</code> to <code>mat[x][y]</code> for for all <code>row1<sub>i</sub> <= x <= row2<sub>i</sub></code> and <code>col1<sub>i</sub> <= y <= col2<sub>i</sub></code>.</li>
</ul>

Return the matrix <code>mat</code> after performing every query.
</p>

</div>