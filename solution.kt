class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        
        for (i in nums.indices) {
            var count = 0
            
            for (j in nums.indices) {
                if (nums[j] < nums[i]) {
                    count++
                }
            }
            
            result[i] = count
        }
        
        return result
    }
}

fun main() {
    val solution = Solution()

    val nums1 = intArrayOf(8, 1, 2, 2, 3)
    val output1 = solution.smallerNumbersThanCurrent(nums1)
    println("Input: ${nums1.joinToString(", ")}")
    println("Output: ${output1.joinToString(", ")}")

    val nums2 = intArrayOf(6, 5, 4, 8)
    val output2 = solution.smallerNumbersThanCurrent(nums2)
    println("Input: ${nums2.joinToString(", ")}")
    println("Output: ${output2.joinToString(", ")}")

    val nums3 = intArrayOf(7, 7, 7, 7)
    val output3 = solution.smallerNumbersThanCurrent(nums3)
    println("Input: ${nums3.joinToString(", ")}")
    println("Output: ${output3.joinToString(", ")}")
}
