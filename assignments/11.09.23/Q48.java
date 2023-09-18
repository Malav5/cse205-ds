class Solution {
    public void rotate(int[][] m) {
        int n = m.length;
        int x = n;
        int [][] arr = new int [n][n];

        for(int i = 0 ; i < n ; i++){
            for( int k = 0 ; k < n ; k++){
                arr[k][i] = m[i][k];
            }
        }

        for(int i = 0 ; i < n ; i++){
            for( int k = 0 ; k < n ; k++){
                m[i][k] = arr[i][k];
            }
        }
        // Transpose completed....

        for(int i = 0 ; i < m.length/2 ; i++){
            for(int j = 0 ; j < m.length ; j++){
                int tmp = m[j][i];
                m[j][i] = m[j][m.length - 1 - i];
                m[j][m.length - 1 - i] = tmp; 
            }
        }
        
        return;
    }
}