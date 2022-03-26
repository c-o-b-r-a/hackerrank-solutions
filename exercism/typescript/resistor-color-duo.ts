/* LINK - https://exercism.org/tracks/typescript/exercises/resistor-color-duo */

const colors: { [key: string]: number } = {
  black: 0,
  brown: 1,
  red: 2,
  orange: 3,
  yellow: 4,
  green: 5,
  blue: 6,
  violet: 7,
  grey: 8,
  white: 9,
};

export function decodedValue(arr: string[]) {
  const fNum: number = colors[arr[0]];
  const sNum: number = colors[arr[1]];
  return fNum * 10 + sNum;
}
