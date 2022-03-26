/* LINK - https://exercism.org/tracks/typescript/exercises/matrix */

export class Matrix {
    private matrixWithRows :number[][];
    private matrixWithColumns: number[][];
    
    constructor(str: string) {
      console.clear();
      this.matrixWithColumns = str.split('\n').map(r => r.split(' ').map(e => parseInt(e)));
      this.matrixWithRows = str.split('\n').map(r => r.split(' ').map(e => parseInt(e)));
      
      this.matrixWithRows.forEach((c, i) => c.forEach((e, j) => {
        this.matrixWithColumns[j][i] = e;
      }));
  
    }
  
    get rows(): number[][] {
      return this.matrixWithRows;
    }
  
    get columns(): unknown {
      return this.matrixWithColumns;
    }
  }