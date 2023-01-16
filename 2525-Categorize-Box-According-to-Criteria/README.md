<h2><a href="https://leetcode.com/problems/categorize-box-according-to-criteria/">2525. Categorize Box According to Criteria</a></h2><h3>Easy</h3><hr><div>
<p>
Given four integers <code>length, width, height, and mass</code>, representing the dimensions and mass of a box, respectively, return a string representing the <strong>category</strong> of the box.

<ul>
    <li>The box is <code>"Bulky"</code> if:
        <ul>
            <li><strong>Any</strong> of the dimensions of the box is greater or equal to 10<sup>4</sup>.</li>
            <li>Or, the <strong>volume</strong> of the box is greater or equal to 10<sup>9</sup>.</li>
        </ul>
    </li>
    <li>If the mass of the box is greater or equal to <code>100</code>, it is <code>"Heavy"</code>.</li>
    <li>If the box is both <code>"Bulky"</code> and <code>"Heavy"</code>, then its category is <code>"Both"</code>.</li>
    <li>If the box is neither <code>"Bulky"</code> nor <code>"Heavy"</code>, then its category is <code>"Neither"</code>.</li>
    <li>If the box is <code>"Bulky"</code> but not <code>"Heavy"</code>, then its category is <code>"Bulky"</code>.</li>
    <li>If the box is <code>"Heavy"</code> but not <code>"Bulky"</code>, then its category is <code>"Heavy"</code>.</li>
</ul>

<strong>Note</strong> that the volume of the box is the product of its length, width and height.
</p>

</div>