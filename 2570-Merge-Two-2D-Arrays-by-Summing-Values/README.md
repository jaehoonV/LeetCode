<h2><a href="https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/">2574. Left and Right Sum Differences</a></h2><h3>Easy</h3><hr><div>
<p>
You are given two 2D integer arrays nums1 and nums2.

<ul>
    <li>nums1[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.</li>
    <li>nums2[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.</li>
</ul>

Each array contains unique ids and is sorted in ascending order by id.

Merge the two arrays into one array that is sorted in ascending order by id, respecting the following conditions:

<ul>
    <li>Only ids that appear in at least one of the two arrays should be included in the resulting array.</li>
    <li>Each id should be included only once and its value should be the sum of the values of this id in the two arrays. If the id does not exist in one of the two arrays then its value in that array is considered to be 0.</li>
</ul>

Return the resulting array. The returned array must be sorted in ascending order by id.
</p>

</div>