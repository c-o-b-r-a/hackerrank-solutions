/* LINK - https://exercism.org/tracks/typescript/exercises/complex-numbers */

export class ComplexNumber {
  constructor(private realNum: number, private imaginaryNum: number) {}

  public get real(): number {
    return this.realNum;
  }

  public get imag(): number {
    return this.imaginaryNum;
  }

  public add(complexNumber: ComplexNumber): ComplexNumber {
    return new ComplexNumber(
      complexNumber.realNum + this.realNum,
      complexNumber.imaginaryNum + this.imaginaryNum
    );
  }

  public sub(complexNumber: ComplexNumber): ComplexNumber {
    return new ComplexNumber(
      this.realNum - complexNumber.realNum,
      this.imaginaryNum - complexNumber.imaginaryNum
    );
  }

  public div(complexNumber: ComplexNumber): ComplexNumber {
    const [a, b, c, d] = [
      this.realNum,
      this.imaginaryNum,
      complexNumber.realNum,
      complexNumber.imaginaryNum,
    ];
    const realNum: number = (a * c + b * d) / (c * c + d * d);
    const imaginaryNum: number = (b * c - a * d) / (c * c + d * d);
    return new ComplexNumber(realNum, imaginaryNum);
  }

  public mul(complexNumber: ComplexNumber): ComplexNumber {
    const [a, b, c, d] = [
      this.realNum,
      this.imaginaryNum,
      complexNumber.realNum,
      complexNumber.imaginaryNum,
    ];
    const realNum: number = a * c - b * d;
    const imaginaryNum: number = b * c + a * d;
    return new ComplexNumber(realNum, imaginaryNum);
  }

  public get abs(): number {
    return Math.sqrt(
      this.realNum * this.realNum + this.imaginaryNum * this.imaginaryNum
    );
  }

  public get conj(): ComplexNumber {
    return new ComplexNumber(this.realNum, 0 - this.imaginaryNum);
  }

  public get exp(): ComplexNumber {
    const e_b = Math.pow(Math.E, this.realNum);
    return new ComplexNumber(
      e_b * Math.cos(this.imaginaryNum),
      e_b * Math.sin(this.imaginaryNum)
    );
  }
}
