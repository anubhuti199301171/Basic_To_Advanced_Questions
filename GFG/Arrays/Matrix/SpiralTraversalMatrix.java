/*

Spirally traversing a matrix
Medium
Given a matrix of size r*c. Traverse the matrix in spiral form.

Example 1:

Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
Output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Explanation:

Example 2:

Input:
r = 3, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12}}
Output:
1 2 3 4 8 12 11 10 9 5 6 7
Explanation:
Applying same technique as shown above,
output for the 2nd testcase will be
1 2 3 4 8 12 11 10 9 5 6 7.

Your Task:
You dont need to read input or print anything. Complete the function spirallyTraverse() that takes matrix, r and c as input
parameters and returns a list of integers denoting the spiral traversal of matrix.

Expected Time Complexity: O(r*c)
Expected Auxiliary Space: O(r*c), for returning the answer only.

Constraints:
1 <= r, c <= 100
0 <= matrixi <= 100


*/
class SpiralTraversalMatrix
{

    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        int left=0, right=c-1, top=0, down=r-1;

        int dir=0;

        while(left<=right && top<=down)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                    ans.add(matrix[top][i]);

                top++;
            }

            else if(dir==1)
            {
                for(int i=top;i<=down;i++)
                    ans.add(matrix[i][right]);

                right--;
            }

            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                    ans.add(matrix[down][i]);

                down--;
            }
            else if(dir==3)
            {
                for(int i=down;i>=top;i--)
                    ans.add(matrix[i][left]);

                left++;
            }

            dir=(dir+1)%4;
        }

        return ans;
    }
}
