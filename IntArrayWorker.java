public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }

  /*  
    This function gets the amount of times the number is passed by in the matrix
    @param int of the number the function is looking for

  */
  public int getCount(int num){
    int total = 0;
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[i].length; j++){
        if(matrix[i][j] == num){
          total += 1;
        }
      }
    }

    return total;
  }

  /* 
    This function goes through the matrix and looks for the highest number in there
    @params none

  */
  public int getLargest(){
    int highest = 0;
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[i].length; j++){
        if(matrix[i][j] > highest){
          highest = matrix[i][j];
        }
      }
    }

    return highest;
  }
  /*
    This function is used to get the total amount in a column 
    @params 
      int column: The column that the function looks for
  */
  public int getColTotal(int col){
      int total = 0;
      //System.out.println("getColTotal called");
      for(int i=0; i<matrix.length; i++){
        //System.out.println(matrix[i][col]);
        total += matrix[i][col];
      }
      /*for(int j=0; j < matrix[col].length; j++){
        System.out.println(matrix[col][j]);
        total += matrix[col][j];
      }*/

    return total;

  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
 
}