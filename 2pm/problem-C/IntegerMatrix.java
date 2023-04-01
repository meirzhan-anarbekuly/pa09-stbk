public class IntegerMatrix extends GenericMatrix<Integer> {
    @Override /** Add two integers */
    protected Integer add(Integer o1, Integer o2) {
      return o1 + o2;
    }
  
    @Override /** Multiply two integers */
    protected Integer multiply(Integer o1, Integer o2) {
      return o1 * o2;
    }
  
    @Override /** Specify zero for an integer */
    protected Integer zero() {
      return 0;
    }

    public Integer minMatrix(Integer[][] matrix1, Integer[][] matrix2) {
        // Check bounds of the two matrices
        if ((matrix1.length != matrix2.length) ||
            (matrix1[0].length != matrix2[0].length)) {
          throw new RuntimeException(
            "The matrices do not have the same size");
        }
    
        Integer result1 = Integer.MAX_VALUE;
        Integer result2 = Integer.MAX_VALUE;
    
        for (int i = 0; i < matrix1.length; i++)
          for (int j = 0; j < matrix1[i].length; j++) {
            if (matrix1[i][j] < result1) {
                result1 = matrix1[i][j];
            }
            if (matrix2[i][j] < result2) {
                result2 = matrix2[i][j];
            }
          }
    
        return Math.min(result1, result2);
      }
  }